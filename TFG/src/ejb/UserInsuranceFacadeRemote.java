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

import jpa.InsuranceJPA;

@Remote
@Path("/WSUserInsuranceRest")
public interface UserInsuranceFacadeRemote {

	@GET	
	@Produces("application/json")
	@Path("/findInsurances")	
	public List<InsuranceJPA> findInsurances(Date initDate, Date endDate, String origin, String destination);	
	
	@GET	
	@Produces("application/json")
	@Path("/insuranceCoverage")
	public String insuranceCoverage(String insurance);	
	
	@GET	
	@Produces("application/json")
	@Path("/insuranceGeneralConditions")
	public String insuranceGeneralConditions(String insurance);
}