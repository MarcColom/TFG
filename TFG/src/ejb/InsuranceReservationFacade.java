/**
 * @author Marc Colom Royo - mcolomro@gmail.com
*/

package ejb;

import java.util.Date;
import java.util.List;

import jpa.OrderJPA;
import jpa.PersonJPA;

public interface InsuranceReservationFacade {

	public List<OrderJPA> findAllInsurances(OrderJPA newOrder);
	
	public OrderJPA bookInsurance(String insurance, Date initDate, Integer days, String origin, String destination, 
								  Integer numPersons, List<PersonJPA> persons);
	
	public OrderJPA findOrder(String orderId);
	
}	
	