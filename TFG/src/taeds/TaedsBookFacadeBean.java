/** 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
**/

package taeds;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import taeds.PETICIONCERTIFICADO.DATOS.ASEGURADOS.ASEGURADO;
import jpa.InsuranceJPA;
import jpa.OrderJPA;
import jpa.PersonJPA;

public class TaedsBookFacadeBean {
	
		// Constantes para BOOK Entorno de Pruebas // 
		private static final String LOGIN_TEST = "test";
		private static final String PASS_TEST = "test";
		private static final String CLIENTE_TEST = "b2c";
		private static final String URL_TEST = "http://taeds.juniper.es/aonseguros/xml/XMLGetResponse2.aspx";	
		
		// Constantes para LOGIN Entorno de Produccion // 
		public static final String LOGIN_PROD = "";
		public static final String PASS_PROD = "";
		public static final String CLIENTE_PROD = "";
		public static final String URL_PROD = "http://www.taeds.com/aonseguros/xml/XMLGetResponse2.aspx";
		
		// Constantes para BOOK Entorno de Produccion //	
		
		public OrderJPA TaedsBook (InsuranceJPA insurance, Integer paxsNumber, Float netPrice, String poblacion, List<String> persons) {
			
		try  {	
				
		// Format date //		    	
    	SimpleDateFormat output = new SimpleDateFormat("dd/MM/YY");		    	
    	String formattedTime = output.format(insurance.getInitDate());    		
			
		// Creamos la instancia con los datos de Book //	
		PETICIONCERTIFICADO peticionCertificado = new PETICIONCERTIFICADO();		
		peticionCertificado.setAUTENTICACION(new PETICIONCERTIFICADO.AUTENTICACION());	
		peticionCertificado.setDATOS(new PETICIONCERTIFICADO.DATOS());		
		peticionCertificado.setMODALIDAD(new PETICIONCERTIFICADO.MODALIDAD());
		peticionCertificado.getMODALIDAD().setDESTINO(new PETICIONCERTIFICADO.MODALIDAD.DESTINO());
		peticionCertificado.getMODALIDAD().getDESTINO().setDURACION(new PETICIONCERTIFICADO.MODALIDAD.DESTINO.DURACION());
		peticionCertificado.getDATOS().setASEGURADOS(new PETICIONCERTIFICADO.DATOS.ASEGURADOS());		
		
		peticionCertificado.getAUTENTICACION().setLogin(LOGIN_TEST);
		peticionCertificado.getAUTENTICACION().setPass(PASS_TEST);
		peticionCertificado.getAUTENTICACION().setCliente(CLIENTE_TEST);		
		peticionCertificado.getDATOS().setLOCALIDAD(poblacion);
		peticionCertificado.getDATOS().setPRECIONETO("No");
		peticionCertificado.getDATOS().setREFAGENCIA("Web");
		peticionCertificado.getDATOS().setTRAMITADO("Web");
		peticionCertificado.getDATOS().setCOUNTRYSOLD("ES");				
		peticionCertificado.getMODALIDAD().setCodigo(insurance.getCode().shortValue());	  	
		peticionCertificado.getMODALIDAD().getDESTINO().setCodigo(insurance.getDestinationCode().byteValue());		
		peticionCertificado.getMODALIDAD().getDESTINO().getDURACION().setCodigo(insurance.getDuracionCode().byteValue());		
		peticionCertificado.getDATOS().setFECHAINICIOVIAJE(formattedTime);
		peticionCertificado.getDATOS().setNASEGURADOS(paxsNumber.byteValue());
		
		
		for (int i=0; i<persons.size(); i++){			 
			String fullName = persons.get(i); 			
			PETICIONCERTIFICADO.DATOS.ASEGURADOS.ASEGURADO a = new PETICIONCERTIFICADO.DATOS.ASEGURADOS.ASEGURADO();
			a.setNOMBRE(fullName);
			peticionCertificado.getDATOS().getASEGURADOS().getASEGURADO().add(a);			
		}
		
				
		// MARSHAL Creamos i almacenamos el XML // 
		JAXBContext jaxbContext = JAXBContext.newInstance(PETICIONCERTIFICADO.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);	
		StringWriter stringWriter = new StringWriter();
	    jaxbMarshaller.marshal(peticionCertificado, stringWriter);   
		
	    		
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
	    try( DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
	    	   wr.write( postData );
	    } catch (IOException e1) {
	        e1.printStackTrace();
	    }	    
	    	      
	    /*
	    // IMPRIMEIX XML ENVIAT //	    
	    System.out.println("XML ENVIAT: ");
		System.out.println(stringWriter.toString()); 
	    
	    // IMPRIMEIX XML REBUT //
	    BufferedReader in = new BufferedReader(
		        new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();    
	    
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 		
		System.out.println(response.toString());
		*/	    
	    
	    // UNMARSHAL Leemos el XML de la respuesta del Login y lo almacenamos en las clases //	
		JAXBContext context = JAXBContext.newInstance(BookResponseObjectFactory.class);	  
		Unmarshaller un = context.createUnmarshaller();
		RESPUESTACERTIFICADO resp = (RESPUESTACERTIFICADO) un.unmarshal(conn.getInputStream());				
		 
			
		// Mapea los datos del certificado en la clase OrderJPA //
		
		OrderJPA newOrder = new OrderJPA();		
		List<PersonJPA> listP = new ArrayList<PersonJPA>();
		
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yy");
		    Date initDate = df.parse(resp.getPERIODO().getDESDE());
		    Date endDate = df.parse(resp.getPERIODO().getHASTA());
		    DateFormat dfo = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		    Date orderDate = dfo.parse(resp.getFECHAEXPEDICION());	    
			
		newOrder.setInitDate(initDate);
		newOrder.setEndDate(endDate);
		newOrder.setCode(resp.getCODIGOREFERENCIA());
		newOrder.setLocalizador((int)(long)resp.getLOCALIZADOR());		
		newOrder.setInsurance(insurance);
		newOrder.setOrigin(insurance.getOrigin());
		newOrder.setDestination(resp.getDESTINO());
		newOrder.setOrderDate(orderDate);
		newOrder.setPersonNum((int)resp.getNUMEROASEGURADOSVIAJEROS());
		newOrder.setGrossPrice(resp.getPRECIO());
		newOrder.setNetPrice(netPrice*paxsNumber);
		newOrder.setCertificadoURL(resp.getCERTIFICADOURL());
		newOrder.setCertificadoEcoURL(resp.getCERTIFICADOECOURL());
		newOrder.setCertificadoMiURL(resp.getMICERTIFICADOURL());
		
		// Format CertificadoURL for Test Environment //
		String CertUrl = newOrder.getCertificadoURL();
		CertUrl = CertUrl.substring(21);
		String NewCertUrl = "http://taeds.juniper.es";
		NewCertUrl = NewCertUrl + CertUrl;		
		newOrder.setCertificadoURL(NewCertUrl);		
		
				
		for (int i=0; i<persons.size(); i++){					
			PersonJPA p = new PersonJPA();
			p.setName(resp.getASEGURADOS().getASEGURADO().get(i).getNOMBRE()); 
			listP.add(p);			
		}
		newOrder.setPersons(listP);		
				 		
		}catch (ParseException e) {
			e.printStackTrace();			
		}				
		
	return newOrder;	
	
	} catch (Exception f){
		f.printStackTrace();
		return null;
	}	
}}
