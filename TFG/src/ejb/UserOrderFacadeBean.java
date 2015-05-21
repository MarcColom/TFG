/** 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
**/

package ejb;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.QueryParam;

import taeds.TaedsBookFacadeBean;
import jpa.CustomerJPA;
import jpa.InsuranceJPA;
import jpa.OrderJPA;
import jpa.PaymentJPA;
import jpa.PersonJPA;


@Stateless
public class UserOrderFacadeBean implements UserOrderFacadeRemote {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	
	
	@Override
	public OrderJPA order(Integer insuranceCode, Integer destinationCode, Integer duracionCode, String initDate, 
						  Integer paxsNum, String city, String person) throws ParseException {

		
		System.out.println("Hola, Estic a UserOrderFacadebean 1");
		// Dar formato a las fechas //
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		    Date iDate = df.parse(initDate);		
		
		System.out.println("Hola, Estic a UserOrderFacadebean 2");
		// Llenar clase InsuranceJPA //
		InsuranceJPA ins = new InsuranceJPA();		
		ins.setCode(insuranceCode);
		ins.setDestinationCode(destinationCode);
		ins.setDuracionCode(duracionCode);
		ins.setInitDate(iDate);
		
		System.out.println("UserOrderFacadebean Insurance: ");
		System.out.println("Code" + ins.getCode());
		System.out.println("Code Byte" + ins.getCode().byteValue());
		
		System.out.println("Destination" + ins.getDestinationCode());
		System.out.println("Destination Byte" + ins.getDestinationCode().byteValue());
		
		System.out.println("Duracion" + ins.getDuracionCode());
		System.out.println("Duracion Byte" + (byte) ins.getDuracionCode().byteValue());   
			//							(byte)(value >>> 24),		
		
		System.out.println("InitDate" + ins.getInitDate());		
		
		// Generar List //
		List<String> persons = new ArrayList<String>();
		persons.add(person);
		
		System.out.println("persons" + persons.toString());	
		
		TaedsBookFacadeBean taeds = new TaedsBookFacadeBean();		
		OrderJPA order = taeds.TaedsBook(ins, paxsNum, city, persons);
		System.out.println("Hola, Estic a UserOrderFacadebean 3");
		return order;
		
		}catch (ParseException e) {	
			return null;
		}		
		
	}
	
	
	public void addCustomer(String name, String email, String phone, String address, String city, 
							String province, String postalCode, String country){
		// ***** TO DO **** //
	}
		
	
	public void addPersons(List<String> persons) {
		// ***** TO DO **** //		
	}	
	
	@Override
	public OrderJPA findOrderByName(String name, String surname, String email) {
		// ***** TO DO **** //
		OrderJPA order = new OrderJPA();
		return order;
	}
	
	@Override
	public OrderJPA findOrderById(String orderId, String email){
		// ***** TO DO **** //
		OrderJPA order = new OrderJPA();
		return order;
	}
	
	@Override
	public void sendConfirmation(String orderId){
		// ***** TO DO **** //	
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
	    	
	    	 String from = "segurosyviajes.com@gmail.com";
	         String pass = "seguros1234";
	         String RECIPIENT = "segurosyviajes.com@gmail.com";
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



	