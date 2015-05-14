/**
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.PathParam;

import jpa.CustomerJPA;
import jpa.InsuranceJPA;
import jpa.OrderJPA;


@Stateless
public class UserInsuranceFacadeBean implements UserInsuranceFacadeRemote {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	
	@Override
	public List<InsuranceJPA> findInsurances(String origin, String destination, String initDate,String endDate) throws ParseException{		
								
		List<InsuranceJPA> insurances = new ArrayList<InsuranceJPA>();
		InsuranceReservationFacadeBean inR = new InsuranceReservationFacadeBean();		
						
		try {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	    Date iDate = df.parse(initDate);
	    Date eDate = df.parse(endDate);			
	
		insurances = inR.findAllInsurances(origin, destination, iDate, eDate);			
		}catch (ParseException e) {	        
		}
		return insurances;
	}
	
	@Override
	public void prova(){
		String pr = "Hola Marc Funciona la Prova i la torna a AngularJS!!!!";
				
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