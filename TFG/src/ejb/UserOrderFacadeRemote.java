/**
 * @author Marc Colom Royo - mcolomro@gmail.com
**/

package ejb;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jpa.CustomerJPA;
import jpa.InsuranceJPA;
import jpa.OrderJPA;
import jpa.PaymentJPA;
import jpa.PersonJPA;

@Remote
@Path("/WSUserOrderRest")
public interface UserOrderFacadeRemote {

	
	@GET	
	@Produces("application/json")
	@Path("/order")	
	public OrderJPA order(@QueryParam("insuranceCode")Integer insuranceCode, @QueryParam("destinationCode")Integer destinationCode,
						  @QueryParam("duracionCode")Integer duracionCode, @QueryParam("initDate")String initDate, 
						  @QueryParam("paxsNum")Integer paxsNum, @QueryParam("city")String city, @QueryParam("persons") String person		
						 )throws ParseException;					  
	
	@GET	
	@Produces("application/json")
	@Path("/contact")	
	public List<String> contact(@QueryParam("nombre")String nombre, @QueryParam("email")String email, 
						  @QueryParam("asunto")String asunto, @QueryParam("consulta")String consulta);
	
			
	/*
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addCustomer")	
	public void addCustomer(String name, String email, String phone, String address, String city, String province, String postalCode, String country);  
	
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addPersons")	
	public void addPersons(List<String> persons);  
	*/		
	
	@GET	
	@Produces("application/json")
	@Path("/findOrderByName")	
	public OrderJPA findOrderByName(String name, String surname, String email);	

	@GET	
	@Produces("application/json")
	@Path("/findOrderById")	
	public OrderJPA findOrderById(String orderId, String email);	

	@GET	
	@Produces("application/json")
	@Path("/sendConfirmation")	
	public void sendConfirmation(String orderId);
}