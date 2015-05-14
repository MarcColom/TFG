/* 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import taeds.TaedsFacadeBean;
import jpa.InsuranceJPA;
import jpa.OrderJPA;
import jpa.PersonJPA;


@Stateless
public class InsuranceReservationFacadeBean implements InsuranceReservationFacade {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	

	@Override
	public List<InsuranceJPA> findAllInsurances(String origin, String destination, Date initDate,Date endDate) {

		// Llama a la classe que gestiona el Web Service de TAEDS				
		List<InsuranceJPA> insurances = new ArrayList<InsuranceJPA>();
		TaedsFacadeBean inTaeds = new TaedsFacadeBean();		
		insurances = inTaeds.TaedsLogin(origin, destination, initDate, endDate);
		return insurances;
	}

	@Override
	public OrderJPA bookInsurance(String insurance, Date initDate, Integer days, String origin, String destination, 
								  Integer numPersons, List<PersonJPA> persons) {
		//***** TO DO **** //
		OrderJPA order = new OrderJPA();
		return order;
	}
	
	@Override
	public OrderJPA findOrder(String orderId) {
		//***** TO DO **** //
		OrderJPA order = new OrderJPA();
		return order;

	}
	
	
}