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

public class TaedsFacadeBean {
			
	// Constantes para LOGIN Entorno de Pruebas // 
	private static final String LOGIN_TEST = "test";
	private static final String PASS_TEST = "test";
	private static final String CLIENTE_TEST = "b2c";
	private static final String URL_TEST = "http://taeds.juniper.es/aonseguros/xml/XMLGetResponse2.aspx";	
	
	// Constantes para LOGIN Entorno de Produccion //	
	
	public List<OrderJPA> TaedsLogin (OrderJPA newOrder) {
		
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
	JAXBContext context = JAXBContext.newInstance(TaedsLoginResponseObjectFactory.class);	  
	Unmarshaller un = context.createUnmarshaller();
	RESPUESTACONFIGURACION resp = (RESPUESTACONFIGURACION) un.unmarshal(conn.getInputStream());
	
	// CREA una lista con los seguros disponibles //	
	List<OrderJPA> insurances = new ArrayList<OrderJPA>();
	List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD> receiptInsurances = resp.getMODALIDADES().getMODALIDAD();	
		
	// Iteramos cada seguro //
	for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD> itM = receiptInsurances.iterator(); itM.hasNext();) {        		
		OrderJPA tempOrder = new OrderJPA();
		RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD tempModalidad = itM.next();
			
		if (tempModalidad.getComisionable().equals("Si")) {
			tempOrder = setOrder(tempOrder, newOrder, tempModalidad);
			if (tempOrder.getGrossPrice() != 0.0) {
			insurances.add(tempOrder);
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
	
	public OrderJPA setOrder (OrderJPA tempOrder, OrderJPA newOrder, RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD tempModalidad) {	
		
		// Variables
		Long duracion = ((newOrder.getEndDate().getTime() - newOrder.getInitDate().getTime())/86400000) + 1;
		
		// Rellena los datos de la Companyia //
		CompanyJPA newCompany = new CompanyJPA();
		newCompany.setLogo(tempModalidad.getIMGCOURL());
				
		// Rellena los datos de Insurances //
		InsuranceJPA newInsurance = new InsuranceJPA();
		newInsurance.setName(tempModalidad.getNombre());
		newInsurance.setCode(new Integer(tempModalidad.getCodigo()));
		newInsurance.setCoverage(tempModalidad.getMODURL());
		newInsurance.setCompany(newCompany);
		newInsurance.setGeneralConditions(tempModalidad.getLABEL());		
		
		// Rellena los datos de Order //
		tempOrder.setInsurance(newInsurance);
		tempOrder.setOrigin(newOrder.getOrigin());
		
		// Itera los destinos y los precios //
		for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO> itD = tempModalidad.getDESTINO().iterator(); itD.hasNext();) {			
			RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO tempD = itD.next();

			// Busca el destino //
			if ((newOrder.getDestination().equals("España") & (tempD.getNombre().equals("España") || tempD.getNombre().equals("España/Andorra"))) ||
				(newOrder.getDestination().equals("Europa") & (tempD.getNombre().equals("Europa") || tempD.getNombre().equals("Europa y Rib. del Mediterraneo"))) ||
				(newOrder.getDestination().equals("Mundo") & (tempD.getNombre().equals("Mundo")))					
				) {
					tempOrder.setDestination(tempD.getNombre());				
					
					// Busca la duración //
					Integer beforeDay = 0;
					Integer afterDay = 0;
					for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION> itDur = tempD.getDURACION().iterator(); itDur.hasNext();) {			
						RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION tempDur = itDur.next();
						afterDay = tempDur.getDies().intValue();

						 if ((beforeDay <= duracion) & (afterDay >= duracion)) {
							 tempOrder.setGrossPrice(tempDur.getPrecio());
							 tempOrder.setNetPrice(tempDur.getPrecioC());
						 }
						beforeDay = afterDay; 
					}						
			}				
		}
	return tempOrder;
	}
			
}	

