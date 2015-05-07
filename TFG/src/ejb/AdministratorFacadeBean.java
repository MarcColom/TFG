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

import jpa.OrderJPA;


@Stateless
public class AdministratorFacadeBean implements AdministratorFacadeRemote {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	
	@Override
	public Boolean login(String user, String password){	
		// ***** TO DO **** //
		Boolean isLogin = false;
		return isLogin;
	}
	
	@Override		
	public List<OrderJPA> findAllOrders() {
		// ***** TO DO **** //
		List<OrderJPA> orders = new ArrayList<OrderJPA>();
		return orders;
	}
	
	@Override	
	public OrderJPA findOrderById(String orderId){
		// ***** TO DO **** //		
		OrderJPA order = new OrderJPA();
		return order;
	}
		
	@Override
	public List<OrderJPA> findOrderByEmail(String email) {
		// ***** TO DO **** //		
		List<OrderJPA> orders = new ArrayList<OrderJPA>();
		return orders;
	}

	@Override
	public List<OrderJPA> findOrderByDate(Date from, Date to) {
		// ***** TO DO **** //		
		List<OrderJPA> orders = new ArrayList<OrderJPA>();
		return orders;
	}
	
}	
	