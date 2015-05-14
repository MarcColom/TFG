/**
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import jpa.CustomerJPA;
import jpa.InsuranceJPA;
import jpa.OrderJPA;


@Stateless
public class UserInsuranceFacadeBean implements UserInsuranceFacadeRemote {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	
	@Override
	public List<InsuranceJPA> findInsurances(String origin, String destination, String initDate,String endDate) throws ParseException{		
								
		List<InsuranceJPA> insurances = new ArrayList<InsuranceJPA>();
		InsuranceReservationFacadeBean inR = new InsuranceReservationFacadeBean();		
						
		try {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	    Date iDate = df.parse(initDate);
	    Date eDate = df.parse(endDate);			
	
		insurances = inR.findAllInsurances(origin, destination, iDate, eDate);			
		}catch (ParseException e) {	        
		}
		return insurances;
	}	
	
	@Override
	public String insuranceCoverage(String insurance){
		// ***** TO DO **** //
		String coverage = null;
		return coverage;
	}
		
	@Override
	public String insuranceGeneralConditions(String insurance){
		// ***** TO DO **** //
		String generalConditions = null;
		return generalConditions;
	}	
	
	@Override		
	public List<String> contact(String nombre, String email, String asunto, String consulta) {		
		
		EnviadorMail(nombre, email, asunto, consulta);
		
		List<String> list = new ArrayList<String>();
		String respuesta = "Tu consulta se ha enviado correctamente. En breve nos pondermos en contacto contigo";
		list.add(respuesta);	
		return list;		
	}
	
	
	    

	    public void EnviadorMail(String nombre, String email, String asunto, String consulta) {    	  	
	    	
	    	 String from = "mcolomro@gmail.com";
	         String pass = "935683813";
	         String RECIPIENT = "mcolomro@gmail.com";
	         String[] to = { RECIPIENT }; // list of recipient email addresses
	         String subject = "SegurosyViajes.com Consultas";
	         String body = "Nombre: " + nombre + "\n" + "Email: " + email + "\n" + "Asunto: " + asunto + "\n" + "Consulta: " + consulta;
	    	
	    	 Properties props = System.getProperties();
	         String host = "smtp.gmail.com";
	         props.put("mail.smtp.starttls.enable", "true");
	         props.put("mail.smtp.host", host);
	         props.put("mail.smtp.user", from);
	         props.put("mail.smtp.password", pass);
	         props.put("mail.smtp.port", "587");
	         props.put("mail.smtp.auth", "true");

	         Session session = Session.getDefaultInstance(props);
	         MimeMessage message = new MimeMessage(session);

	         try {
	             message.setFrom(new InternetAddress(from));
	             InternetAddress[] toAddress = new InternetAddress[to.length];

	             // To get the array of addresses
	             for( int i = 0; i < to.length; i++ ) {
	                 toAddress[i] = new InternetAddress(to[i]);
	             }

	             for( int i = 0; i < toAddress.length; i++) {
	                 message.addRecipient(Message.RecipientType.TO, toAddress[i]);
	             }

	             message.setSubject(subject);
	             message.setText(body);
	             Transport transport = session.getTransport("smtp");
	             transport.connect(host, from, pass);
	             transport.sendMessage(message, message.getAllRecipients());
	             transport.close();
	         }
	         catch (AddressException ae) {
	             ae.printStackTrace();
	         }
	         catch (MessagingException me) {
	             me.printStackTrace();
	         }
	     }
	
}	