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
import javax.ws.rs.QueryParam;

import jpa.OrderJPA;

@Remote
@Path("/WSAdministratorRest")
public interface AdministratorFacadeRemote {

	@GET	
	@Produces("application/json")
	@Path("/login")	
	public Boolean login(@QueryParam("user")String user, @QueryParam("password")String password);	
	
	@GET	
	@Produces("application/json")
	@Path("/findAllOrders")	
	public List<OrderJPA> findAllOrders();
	
	@GET	
	@Produces("application/json")
	@Path("/findOrderByCode")	
	public List<OrderJPA> findOrderByCode(@QueryParam("orderCode")Integer orderCode);	

	@GET	
	@Produces("application/json")
	@Path("/findOrderByEmail")	
	public List<OrderJPA> findOrderByEmail(@QueryParam("email")String email);
	
	@GET	
	@Produces("application/json")
	@Path("/findOrderByDate")	
	public List<OrderJPA> findOrderByDate(@QueryParam("from")String from, @QueryParam("to")String to);
}


	