/**
 * @author Marc Colom Royo - mcolomro@gmail.com
*/

package ejb;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jpa.OrderJPA;

@Remote
@Path("/WSUserOrderRest")
public interface UserOrderFacadeRemote {

	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/order")	
	public OrderJPA order(String insurance, Date initDate, Date endDate, String origin, 
					  String destination, Integer numPersons);					  
	
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addCustomer")	
	public void addCustomer(String name, String email, String phone, String address, String city, String province, String postalCode, String country);  
	
	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addPersons")	
	public void addPersons(List<String> persons);  
		
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