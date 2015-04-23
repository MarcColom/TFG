/* 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package wsTaeds;

import java.io.StringWriter;
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

import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

import wsTaedsLogin.PETICIONCONFIGURACION;
import wsTaedsLoginResponse.RESPUESTACONFIGURACION;
import jpa.CompanyJPA;
import jpa.InsuranceJPA;
import jpa.OrderJPA;

@Stateless
public class TaedsFacadeBean implements TaedsFacadeRemote{
	
	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
		
	// Constantes para LOGIN Entorno de Pruebas // 
	private static final String LOGIN_TEST = "test";
	private static final String PASS_TEST = "test";
	private static final String CLIENTE_TEST = "b2c";
	private static final String URL_TEST = "http://taeds.juniper.es/aonseguros/xml/XMLGetResponse2.aspx";
	
	// Constantes para LOGIN Entorno de Produccion //
	
	
	// Datos Order de prueba //
	OrderJPA or = new OrderJPA();
	
	
	
	@Override
	public List<OrderJPA> TaedsLogin (OrderJPA newOrder) {
		
	try  {			

	System.out.println("Hola, estic a TaedsFacadeBean \n");	
		
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
	CloseableHttpClient httpClient = HttpClients.createDefault();				
	HttpPost httpPost = new HttpPost(URL_TEST);
	
	// Crea un Entity como un formulario (variable + valor)	
	List<NameValuePair> formparams = new ArrayList<NameValuePair>();
	formparams.add(new BasicNameValuePair("pXML", stringWriter.toString()));
	formparams.add(new BasicNameValuePair("sortida", "0"));
	UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");		
	httpPost.setEntity(entity);
	
	// Envia la petici�n HttpPost
	HttpResponse httpResponse = httpClient.execute(httpPost);
	
		
	// UNMARSHAL Leemos el XML de la respuesta del Login y lo almacenamos en las clases //	
	JAXBContext context = JAXBContext.newInstance(wsTaedsLoginResponse.ObjectFactory.class);	  
	Unmarshaller un = context.createUnmarshaller();
	RESPUESTACONFIGURACION resp = (RESPUESTACONFIGURACION) un.unmarshal(httpResponse.getEntity().getContent());
	
	// MUESTRA INFORMACI�N //
	System.out.println("\nClase RESPUESTACONFIGURACION: " + "\n\n" + 
						resp.getMODALIDADES().toString());
	
	// CREA una lista con los seguros disponibles //	
	List<OrderJPA> insurances = new ArrayList<OrderJPA>();
	List<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD> receiptInsurances = resp.getMODALIDADES().getMODALIDAD();
	
	// Iteramos cada seguro //
	for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD> itM = receiptInsurances.iterator(); itM.hasNext();) {        		
		OrderJPA in = new OrderJPA();
		RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD tempModalidad = itM.next();
	
		if (tempModalidad.getComisionable().equals("Si")) {
			in = setOrder(in, newOrder, tempModalidad);
			insurances.add(in);
		}
	} 	
	
	// PROVA PER IMPRIMIR PER CONSOLA ELS SEGUROS //		
	for (Iterator<OrderJPA> triats = insurances.iterator(); triats.hasNext();) {			
			OrderJPA tempO = triats.next();
			System.out.println("Aquest es el seguro triat:" + "\n" );
			System.out.println("Nom: " + tempO.getInsurance().getName() + "\n" );
			System.out.println("Origen: " + tempO.getOrigin() + "\n" );
			System.out.println("Desti: " + tempO.getDestination() + "\n" );
			System.out.println("Preu PVP: " + tempO.getGrossPrice() + "\n" );
			System.out.println("Preu PVP: " + tempO.getNetPrice() + "\n" );
	}
	
	return insurances;
	
	
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
}	
	
	// Metodo que rellena los datos de cada seguro segun los parametros de entrada //
	@Override
	public OrderJPA setOrder (OrderJPA in, OrderJPA newOrder, RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD tempModalidad) {
	
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
		in.setInsurance(newInsurance);

		// Itera los destinos y los precios //
		for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO> itD = tempModalidad.getDESTINO().iterator(); itD.hasNext();) {			
			RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO tempD = itD.next();
			
			// Busca el destino //
			if ((in.getDestination().equals("Espa�a") & (tempD.getNombre().equals("Espa�a") || tempD.getNombre().equals("Espa�a/Andorra"))) ||
				(in.getDestination().equals("Europa") & (tempD.getNombre().equals("Europa") || tempD.getNombre().equals("Europa y Rib. del Mediterraneo"))) ||
				(in.getDestination().equals("Mundo") & (tempD.getNombre().equals("Mundo")))					
				) {
					// Busca la duraci�n //
					Integer beforeDay = 0;
					Integer afterDay = 0;
					for (Iterator<RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION> itDur = tempD.getDURACION().iterator(); itDur.hasNext();) {			
						RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD.DESTINO.DURACION tempDur = itDur.next();
						afterDay = tempDur.getDies().intValue();
						 if ((beforeDay <= duracion) & (afterDay >= duracion)) {
							 in.setGrossPrice(tempDur.getPrecio());
							 in.setNetPrice(tempDur.getPrecioC());
						 }
						beforeDay = afterDay; 
					}							
			}				
		}
	return in;
	}
			
}	

