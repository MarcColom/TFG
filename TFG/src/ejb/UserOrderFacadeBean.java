/** 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
**/

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
import jpa.AddressJPA;
import jpa.CompanyJPA;
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
						  Integer paxsNum, Float netPrice, String city, List<String> persons) throws ParseException {		
		
		// Dar formato a las fechas //
		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		    Date iDate = df.parse(initDate);		

		// Llenar clase InsuranceJPA //
		InsuranceJPA ins = new InsuranceJPA();		
		ins.setCode(insuranceCode);
		ins.setDestinationCode(destinationCode);
		ins.setDuracionCode(duracionCode);
		ins.setInitDate(iDate);				
				
		InsuranceReservationFacade insR = new InsuranceReservationFacadeBean();		
		OrderJPA order = insR.bookInsurance(ins, paxsNum, netPrice, city, persons);
		
		PersonJPA tempPerson = new PersonJPA();		
		for (Iterator<PersonJPA> itP = order.getPersons().iterator(); itP.hasNext();) {
			tempPerson = itP.next();			
			entman.persist(tempPerson);
		}
		
		ins = order.getInsurance();		
		entman.persist(ins);
		entman.persist(order);
		
		return order;
		
		}catch (ParseException e) {				  	 
			  return null;
		}		
		
	}
		
	public void addCustomer(Integer orderId, String name, String surnames, String email, String phone, String address, String city,
				String province, String postalCode, String country) {	
			
		PersonJPA p = new PersonJPA();
		AddressJPA a = new AddressJPA();
		CustomerJPA c = new CustomerJPA();
		
		p.setName(name);
		p.setSurnames(surnames);		
		
		a.setAddress(address);
		a.setCity(city);
		a.setCountry(country);
		a.setPostalCode(postalCode);
		a.setProvince(province);
		
		c.setName(p);
		c.setAddress(a);
		c.setEmail(email);
		c.setPhone(phone);
		
		OrderJPA order = entman.find(OrderJPA.class, orderId);
		
		order.setCustomer(c);
		order.getCustomer().setAddress(a);
		order.getCustomer().setName(p);
		
		entman.persist(p);
		entman.persist(a);
		entman.persist(c);
		entman.persist(order);				
	}
		
	@Override
	public Boolean payment(PaymentJPA payment){
				
		PaymentFacade p = new PaymentFacadeBean();
		Boolean isPay = p.payment(payment);				
		return isPay;	
	}	
	
	@Override
	public OrderJPA findOrderByName(String name, String surnames, String email) {
		
		OrderJPA order = new OrderJPA();
		OrderJPA tempOrder = new OrderJPA();
		
		@SuppressWarnings("unchecked")		
		List<OrderJPA> allOrders = entman.createQuery("from OrderJPA order by ORDER_ID").getResultList();		
		//order = (OrderJPA) entman.createQuery("from OrderJPA where code='"+orderId+"' ").getSingleResult();
			
		for (Iterator<OrderJPA> it = allOrders.iterator(); it.hasNext();) {
			tempOrder = it.next();			
			
			if (tempOrder.getCustomer().getName().getName().equalsIgnoreCase(name) 
				&& tempOrder.getCustomer().getName().getSurnames().equalsIgnoreCase(surnames)
				&& tempOrder.getCustomer().getEmail().equalsIgnoreCase(email)) {
				
				order = tempOrder;
			}			
		}		
		return order;
	}
	
	@Override	
	public OrderJPA findOrderById(Integer orderId, String email){
				
		OrderJPA order = new OrderJPA();
		OrderJPA tempOrder = new OrderJPA();
		
		@SuppressWarnings("unchecked")		
		List<OrderJPA> allOrders = entman.createQuery("from OrderJPA order by ORDER_ID").getResultList();		
		//order = (OrderJPA) entman.createQuery("from OrderJPA where code='"+orderId+"' ").getSingleResult();
			
		for (Iterator<OrderJPA> it = allOrders.iterator(); it.hasNext();) {
			tempOrder = it.next();		
			if (tempOrder.getCode().equals(orderId) && tempOrder.getCustomer().getEmail().equalsIgnoreCase(email)) {
				order = tempOrder;
			}			
		}		
		return order;		
	}
	
	@Override
	public void sendConfirmation(Integer orderId){
				
		OrderJPA order = new OrderJPA();		
		
		order = (OrderJPA) entman.createQuery("from OrderJPA where code='"+orderId+"'").getSingleResult();		
			
		String emailEnvia = "segurosyviajes.com@gmail.com";
		String passwordEnvia = "seguros1234";
		String emailRecibe = order.getCustomer().getEmail();
		String titulo = "Confirmación de Compra Loc. " + order.getLocalizador() + "SegurosyViajes.com";
		String mensaje = "Nombre: " + order.getCustomer().getName().getName() + " " + order.getCustomer().getName().getSurnames()  
						+ "\n" + "Código: " + order.getCode() + " " + "Localizador: " + order.getLocalizador() 
						+ "\n" + "Fecha de inicio: " + order.getInitDate() + " " + "Fecha de finalización: " + order.getEndDate()
						+ "\n" + "Destino: " + order.getDestination()
						+ "\n" + "Número de asegurados: " + order.getPersonNum() + " " + "Precio total: " + order.getGrossPrice();	
		
		EnviadorMail(emailEnvia, passwordEnvia, emailRecibe, titulo, mensaje);
	}
	
	@Override		
	public void contact(String nombre, String emailCliente, String asunto, String consulta) {		
		
		String emailEnvia = "segurosyviajes.com@gmail.com";
		String passwordEnvia = "seguros1234";
		String emailRecibe = "segurosyviajes.com@gmail.com";
		String titulo = "SegurosyViajes.com Consultas";
		String mensaje = "Nombre: " + nombre + "\n" + "Email: " + emailCliente + "\n" + "Asunto: " + asunto + "\n" + "Consulta: " + consulta;
		
		EnviadorMail(emailEnvia, passwordEnvia, emailRecibe, titulo, mensaje);						
	}    

    public void EnviadorMail(String emailEnvia, String passwordEnvia, String emailRecibe, String asunto, String mensaje) {    	  	
    	
    	 String from = emailEnvia;
         String pass = passwordEnvia;
         String RECIPIENT = emailRecibe;
         String[] to = { RECIPIENT }; // list of recipient email addresses
         String subject = asunto;
         String body = mensaje;
    	
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



	