/* 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.OrderJPA;


@Stateless
public class UserOrderFacadeBean implements UserOrderFacadeRemote {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	
	@Override
	public OrderJPA order(String insurance, Date initDate, Date endDate, String origin,
			  			  String destination, Integer numPersons){		
		// ***** TO DO **** //
		OrderJPA order = new OrderJPA();
		return order;
	}
	
	@Override
	public void addCustomer(String name, String email, String phone, String address, String city, 
							String province, String postalCode, String country){
		// ***** TO DO **** //
	}
		
	@Override
	public void addPersons(List<String> persons) {
		// ***** TO DO **** //		
	}	
	
	@Override
	public OrderJPA findOrderByName(String name, String surname, String email) {
		// ***** TO DO **** //
		OrderJPA order = new OrderJPA();
		return order;
	}
	
	@Override
	public OrderJPA findOrderById(String orderId, String email){
		// ***** TO DO **** //
		OrderJPA order = new OrderJPA();
		return order;
	}
	
	@Override
	public void sendConfirmation(String orderId){
		// ***** TO DO **** //	
	}
	
}	



	