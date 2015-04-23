/**
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.InsuranceJPA;
import jpa.OrderJPA;
import ejb.InsuranceReservationFacade;

@Stateless
public class UserInsuranceFacadeBean implements UserInsuranceFacadeRemote {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	
	@Override
	public List<OrderJPA> findInsurances(OrderJPA newOrder) throws ParseException {		
		// ***** TO DO **** //
				
		System.out.println("Aquest es el Origen rebut: " + newOrder.getOrigin());
		System.out.println("Aquest es el Desti rebut: " + newOrder.getDestination());		  	 		
		System.out.println("Aquesta es la Data de Inici rebuda: " + newOrder.getInitDate().toString());
		System.out.println("Aquesta es la Data de Fi rebuda: " + newOrder.getEndDate().toString());
		System.out.println("Els dies de viatge són: " + (((newOrder.getEndDate().getTime() - newOrder.getInitDate().getTime())/86400000) + 1));
		
		// Crida al metode InsuranceReservationFacade que administra els WS //
		InsuranceReservationFacadeBean wsReservation = new InsuranceReservationFacadeBean();						
		List<OrderJPA> insurances = new ArrayList<OrderJPA>();
		insurances = wsReservation.findAllInsurances(newOrder);	
		
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
}	