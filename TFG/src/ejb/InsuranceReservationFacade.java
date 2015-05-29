/**
 * @author Marc Colom Royo - mcolomro@gmail.com
*/

package ejb;

import java.util.Date;
import java.util.List;

import jpa.InsuranceJPA;
import jpa.OrderJPA;
import jpa.PersonJPA;

public interface InsuranceReservationFacade {

	public List<InsuranceJPA> findAllInsurances(String origin, String destination, Date initDate,Date endDate);
	
	public OrderJPA bookInsurance (InsuranceJPA insurance, Integer paxsNumber, Float netPrice, String poblacion, List<String> persons);
	
	public OrderJPA findOrder(String orderId);
	
}	
	