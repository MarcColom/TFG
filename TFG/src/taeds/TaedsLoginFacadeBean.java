/* 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package taeds;

import java.io.DataOutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.omg.CORBA.Any;
import org.omg.CORBA.NameValuePair;

import jpa.CompanyJPA;
import jpa.InsuranceJPA;
import jpa.OrderJPA;

public class TaedsLoginFacadeBean {
			
	// Constantes para LOGIN Entorno de Pruebas // 
	private static final String LOGIN_TEST = "test";
	private static final String PASS_TEST = "test";
	private static final String CLIENTE_TEST = "b2c";
	private static final String URL_TEST = "http://taeds.juniper.es/aonseguros/xml/XMLGetResponse2.aspx";	
	
	// Constantes para LOGIN Entorno de Produccion //	
	
	public List<InsuranceJPA> TaedsLogin (String origin, String destination, Date initDate,Date endDate) {
		
	try  {
		
	// Creamos la instancia con los datos de Login //	
	PETICIONCONFIGURACION peticionLogin = new PETICIONCONFIGURACION();	
	peticionLogin.setAUTENTICACION(new PETICIONCONFIGURACION.AUTENTICACION());	
	
	peticionLogin.getAUTENTICACION().setLogin(LOGIN_TEST);
	peticionLogin.getAUTENTICACION().setPass(PASS_TEST);
	peticionLogin.getAUTENTICACION().setCliente(CLIENTE_TEST);
	
	
	// MARSHAL Creamos i almacenamos el XML // 
	JAXBContext jaxbContext = JAXBContext.newInstance(PETICIONCONFIGURACION.class);
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);	
	StringWriter stringWriter = new StringWriter();
    jaxbMarshaller.marshal(peticionLogin, stringWriter);   
	
	
    // Crea la connexion HttpPost    
    HttpURLConnection conn = null;  
    URL url = new URL(URL_TEST);
    conn = (HttpURLConnection)url.openConnection();
    conn.setRequestMethod("POST");
    conn.setDoOutput(true);
    conn.setDoInput(true);
    conn.setRequestProperty("Accept", "application/xml");
    conn.setRequestProperty("Content-Length", "0");
        
	
    // Crea un Entity como un formulario (variable + valor)	    
    String urlParameters =
            "pXML=" + URLEncoder.encode(stringWriter.toString(), "UTF-8") +
            "&sortida=" + URLEncoder.encode("0", "UTF-8");  	
    
    byte[] postData = urlParameters.getBytes(Charset.forName("UTF-8"));    
    try( DataOutputStream wr = new DataOutputStream( conn.getOutputStream())) {
    	   wr.write( postData );
    	    }
    
    // UNMARSHAL Leemos el XML de la respuesta del Login y lo almacenamos en las clases //	
	JAXBContext context = JAXBContext.newInstance(LoginResponseObjectFactory.class);	  
	Unmarshaller un = context.createUnmarshaller();
	RESPUESTACONFIGURACION resp = (RESPUESTACONFIGURACION) un.unmarshal(conn.getInputStream());
	
	// CREA una lista con los seguros disponibles //	
	List<InsuranceJPA> insurances = new ArrayList<InsuranceJPA>();
	List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD> receiptInsurances = resp.getMODALIDADES().getMODALIDAD();	
		
	// Iteramos cada seguro //
	for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD> itM = receiptInsurances.iterator(); itM.hasNext();) {        		
		InsuranceJPA tempInsurance = new InsuranceJPA();
		RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD tempModalidad = itM.next();
			
		if (tempModalidad.getComisionable().equals("Si")) {
			tempInsurance = setInsurance(tempInsurance, tempModalidad, origin, destination, initDate, endDate);
			if (tempInsurance.getGrossPrice() != 0.0) {
			insurances.add(tempInsurance);
			}
		}
	} 	
/*	
	// PROVA PER IMPRIMIR PER CONSOLA ELS SEGUROS //		
	for (Iterator<OrderJPA> triats = insurances.iterator(); triats.hasNext();) {			
			OrderJPA tempO = triats.next();
			System.out.println("Aquest es el seguro triat:" + "\n" );
			System.out.println("Nom: " + tempO.getInsurance().getName() + "\n" );
			System.out.println("Origen: " + tempO.getOrigin() + "\n" );
			System.out.println("Desti: " + tempO.getDestination() + "\n" );
			System.out.println("Preu PVP: " + tempO.getGrossPrice() + "\n" );
			System.out.println("Preu NET: " + tempO.getNetPrice() + "\n" );
	}
*/	
	return insurances;
	
	
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
}	
	
	// Metodo que rellena los datos de cada seguro segun los parametros de entrada //
	
	public InsuranceJPA setInsurance (InsuranceJPA tempInsurance, RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD tempModalidad,
							  		  String origin, String destination, Date initDate,Date endDate) {	
		
		// Variables
		Long duracion = ((endDate.getTime() - initDate.getTime())/86400000) + 1;
		
		// Rellena los datos de la Companyia //
		CompanyJPA newCompany = new CompanyJPA();
		newCompany.setLogo(tempModalidad.getIMGCOURL());
				
		// Rellena los datos de Insurances //		
		tempInsurance.setName(tempModalidad.getNombre());
		tempInsurance.setCode(new Integer(tempModalidad.getCodigo()));
		tempInsurance.setCoverage(tempModalidad.getMODURL());
		tempInsurance.setCompany(newCompany);
		tempInsurance.setGeneralConditions(tempModalidad.getLABEL());
		tempInsurance.setInitDate(initDate);
		tempInsurance.setEndDate(endDate);
		tempInsurance.setOrigin(origin);
		tempInsurance.setDestination(destination);
		tempInsurance.setImage(tempModalidad.getIMGMODURL());
		tempInsurance.getCompany().setLogo(tempModalidad.getIMGCOURL());	
		tempInsurance.setDuracion(duracion.intValue());
				
		// Itera los destinos y los precios //
		for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO> itD = tempModalidad.getDESTINO().iterator(); itD.hasNext();) {			
			RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO tempD = itD.next();

			// Busca el destino //
			if ((destination.equals("España") & (tempD.getNombre().equals("España") || tempD.getNombre().equals("España/Andorra"))) ||
				(destination.equals("Europa") & (tempD.getNombre().equals("Europa") || tempD.getNombre().equals("Europa y Rib. del Mediterraneo"))) ||
				(destination.equals("Mundo") & (tempD.getNombre().equals("Mundo")))					
				) {					
					
					// Guarda el Codigo del Destino //
					tempInsurance.setDestinationCode(tempD.getCodigo().intValue());
				
					// Busca la duración //
					Integer beforeDay = 0;
					Integer afterDay = 0;
					for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION> itDur = tempD.getDURACION().iterator(); itDur.hasNext();) {			
						RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION tempDur = itDur.next();
						afterDay = tempDur.getDies().intValue();

						 if ((beforeDay <= duracion) & (afterDay >= duracion)) {
							// Guarda el Codigo de Duración //
							 tempInsurance.setDuracionCode(tempDur.getCodigo().intValue());
							 tempInsurance.setGrossPrice(tempDur.getPrecio());
							 tempInsurance.setNetPrice(tempDur.getPrecioC());
						 }
						beforeDay = afterDay; 
					}						
			}				
		}
	return tempInsurance;
	}
			
}	

