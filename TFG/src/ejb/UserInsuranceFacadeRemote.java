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
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jpa.CustomerJPA;
import jpa.InsuranceJPA;
import jpa.OrderJPA;

@Remote
@Path("/WSUserInsuranceRest")
public interface UserInsuranceFacadeRemote {

	@GET	
	@Produces("application/json")
	@Path("/findInsurances")	
	public List<InsuranceJPA> findInsurances(@QueryParam("origin")String origin, @QueryParam("destination")String destination, 
											 @QueryParam("initDate")String initDate, @QueryParam("endDate")String endDate)throws ParseException;
		
	@GET	
	@Produces("application/json")
	@Path("/insuranceCoverage")
	public String insuranceCoverage(String insurance);	
	
	@GET	
	@Produces("application/json")
	@Path("/insuranceGeneralConditions")
	public String insuranceGeneralConditions(String insurance);

	/*
	@GET	
	@Produces("application/json")
	@Path("/contact")	
	public List<String> contact(@QueryParam("nombre")String nombre, @QueryParam("email")String email, 
						  @QueryParam("asunto")String asunto, @QueryParam("consulta")String consulta);	
	*/	
}