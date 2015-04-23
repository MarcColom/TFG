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

import wsTaeds.TaedsFacadeBean;
import jpa.OrderJPA;
import jpa.PersonJPA;


@Stateless
public class InsuranceReservationFacadeBean implements InsuranceReservationFacade {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	

	@Override
	public List<OrderJPA> findAllInsurances(OrderJPA newOrder) {
		//***** TO DO **** //
		// Llama a todos los WebServices para obtener los seguros disponibles //  
		System.out.println("Hola, estic a InsuranceReservationFacadeBean");
		
				
		TaedsFacadeBean wsTaeds = new TaedsFacadeBean();
		System.out.println("Hola, estic a InsuranceReservationFacadeBean 2");
		List<OrderJPA> insurances = new ArrayList<OrderJPA>();
		insurances = wsTaeds.TaedsLogin(newOrder);
		System.out.println("Hola, estic a InsuranceReservationFacadeBean 3");
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