/* 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
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
	
	// Constantes para LOGIN Entorno de Pruebas // 
	private static final String USER = "TFGJEE";
	private static final String PASSWORD = "UOC1234";
	
	@Override
	public Boolean login(String user, String password){	
		
		Boolean isLogin = false;
		if (user.equals(USER) && password.equals(PASSWORD)) {
			isLogin=true;
		}
		return isLogin;
	}
	
	@Override		
	public List<OrderJPA> findAllOrders() {
					
		@SuppressWarnings("unchecked")		
		List<OrderJPA> allOrders = entman.createQuery("from OrderJPA order by ORDER_ID").getResultList();		
		return allOrders;
	}
	
	@Override	
	public List<OrderJPA> findOrderByCode(Integer orderCode){
				
		OrderJPA order = new OrderJPA();
		List<OrderJPA> findOrder = new ArrayList <OrderJPA>();
		
		@SuppressWarnings("unchecked")		
		List<OrderJPA> allOrders = entman.createQuery("from OrderJPA order by ORDER_ID").getResultList();	
		
		for (Iterator<OrderJPA> it = allOrders.iterator(); it.hasNext();) {
			order = it.next();
			
			if (order.getCode().equals(orderCode)) {			
				findOrder.add(order);
			}			
		}		
		return findOrder;
	}
		
	@Override
	public List<OrderJPA> findOrderByEmail(String email) {
	
		OrderJPA order = new OrderJPA();
		List<OrderJPA> findOrder = new ArrayList <OrderJPA>();
		
		@SuppressWarnings("unchecked")		
		List<OrderJPA> allOrders = entman.createQuery("from OrderJPA order by ORDER_ID").getResultList();	
		
		for (Iterator<OrderJPA> it = allOrders.iterator(); it.hasNext();) {
			order = it.next();			
			
			if (order.getCustomer().getEmail().equalsIgnoreCase(email)) {				
				findOrder.add(order);
			}			
		}		
		return findOrder;
	}
	

	@Override
	@SuppressWarnings("unchecked")	
	public List<OrderJPA> findOrderByDate(String from, String to) {
		
		System.out.println("Strings from " + from + " To " + to);
		
		// Dar formato a las fechas //
		try {   
		    
		    DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		    
		    Calendar fromDate = Calendar.getInstance();
		    fromDate.setTime(sdf.parse(from));
		    fromDate.set(Calendar.HOUR_OF_DAY, 0);		   
		    fromDate.add(Calendar.DATE, 1);
		    
		    Calendar toDate = Calendar.getInstance();
		    toDate.setTime(sdf.parse(to));		    
		    toDate.set(Calendar.HOUR_OF_DAY, 0);		   
		    toDate.add(Calendar.DATE, 2);	
		
		OrderJPA order = new OrderJPA();
		List<OrderJPA> findOrder = new ArrayList <OrderJPA>();
		
			
		List<OrderJPA> allOrders = entman.createQuery("from OrderJPA order by ORDER_ID").getResultList();	
		
		for (Iterator<OrderJPA> it = allOrders.iterator(); it.hasNext();) {
			order = it.next();
			
			if ((order.getOrderDate().compareTo(fromDate.getTime())>=0) && (order.getOrderDate().compareTo(toDate.getTime())<=0)) {				
				findOrder.add(order);				
			}			
		}		
		return findOrder;
		
		}catch (ParseException e) {				  	 
			  return null;
		}
	}

}

	