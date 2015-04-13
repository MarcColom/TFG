/**
 * @author Marc Colom Royo - mcolomro@gmail.com
*/

package ejb;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import jpa.OrderJPA;

@Remote
@Path("/WSAdministratorRest")
public interface AdministratorFacadeRemote {

	@GET	
	@Produces("application/json")
	@Path("/login")	
	public Boolean login(String user, String password);	
	
	@GET	
	@Produces("application/json")
	@Path("/findAllOrders")	
	public List<OrderJPA> findAllOrders();
	
	@GET	
	@Produces("application/json")
	@Path("/findOrderById")	
	public OrderJPA findOrderById(String orderId);	

	@GET	
	@Produces("application/json")
	@Path("/findOrderByEmail")	
	public List<OrderJPA> findOrderByEmail(String email);
	
	@GET	
	@Produces("application/json")
	@Path("/findOrderByDate")	
	public List<OrderJPA> findOrderByDate(Date from, Date to);
}


	