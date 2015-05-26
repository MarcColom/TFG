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
						  @QueryParam("paxsNum")Integer paxsNum, @QueryParam("city")String city, @QueryParam("persons") List<String> persons		
						 )throws ParseException;					  
	
	@GET	
	@Produces("application/json")
	@Path("/contact")	
	public void contact(@QueryParam("nombre")String nombre, @QueryParam("email")String email, 
				   	    @QueryParam("asunto")String asunto, @QueryParam("consulta")String consulta);
	
			
	
	@GET		
	@Path("/addCustomer")	
	public void addCustomer(@QueryParam("orderId")Integer orderId, @QueryParam("name")String name, @QueryParam("surnames")String surnames, @QueryParam("email")String email, 
							@QueryParam("phone")String phone, @QueryParam("address") String address, @QueryParam("city") String city,
							@QueryParam("province")String province, @QueryParam("postalCode") String postalCode, @QueryParam("country") String country);  
	
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	@Path("/payment")	
	public Boolean payment(PaymentJPA payment);  
			
	
	@GET	
	@Produces("application/json")
	@Path("/findOrderByName")	
	public OrderJPA findOrderByName(@QueryParam("name")String name, @QueryParam("surnames")String surnames, @QueryParam("email")String email);	

	@GET	
	@Produces("application/json")
	@Path("/findOrderById")	
	public OrderJPA findOrderById(@QueryParam("orderId")Integer orderId, @QueryParam("email")String email);	

	@GET	
	@Path("/sendConfirmation")	
	public void sendConfirmation(@QueryParam("orderId")Integer orderId);
}