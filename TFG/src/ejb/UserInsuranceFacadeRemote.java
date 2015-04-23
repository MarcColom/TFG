/**
 * @author Marc Colom Royo - mcolomro@gmail.com
*/

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
import javax.ws.rs.core.MediaType;

import jpa.InsuranceJPA;
import jpa.OrderJPA;

@Remote
@Path("/WSUserInsuranceRest")
public interface UserInsuranceFacadeRemote {

	@POST	
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces("application/json")
	@Path("/findInsurances")	
	public List<OrderJPA> findInsurances(OrderJPA newOrder) throws ParseException;	
	
	@GET	
	@Produces("application/json")
	@Path("/insuranceCoverage")
	public String insuranceCoverage(String insurance);	
	
	@GET	
	@Produces("application/json")
	@Path("/insuranceGeneralConditions")
	public String insuranceGeneralConditions(String insurance);
}