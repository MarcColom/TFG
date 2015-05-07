/**
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.CustomerJPA;
import jpa.InsuranceJPA;
import jpa.OrderJPA;


@Stateless
public class UserInsuranceFacadeBean implements UserInsuranceFacadeRemote {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	
	@Override
	public List<OrderJPA> findInsurances(OrderJPA newOrder) throws ParseException {		
								
		List<OrderJPA> insurances = new ArrayList<OrderJPA>();
		InsuranceReservationFacadeBean inR = new InsuranceReservationFacadeBean();
		insurances = inR.findAllInsurances(newOrder);	
		System.out.println("FindInsurances ha estat invocat!!!");
		
		return insurances;
	}
	
	@Override
	public String insuranceCoverage(String insurance){
		// ***** TO DO **** //
		String coverage = null;
		return coverage;
	}
		
	@Override
	public String insuranceGeneralConditions(String insurance){
		// ***** TO DO **** //
		String generalConditions = null;
		return generalConditions;
	}	
	
	@Override
	public void contact(CustomerJPA customer) {
		// ***** TO DO **** //
		
		System.out.println("Contact ha estat invocat!!!");
		System.out.println("Customer name: " + customer.getName().getName());
		System.out.println("Customer email: " + customer.getEmail());
		
	}
}	