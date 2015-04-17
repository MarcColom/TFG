/**
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.InsuranceJPA;


@Stateless
public class UserInsuranceFacadeBean implements UserInsuranceFacadeRemote {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	
	@Override
	public List<InsuranceJPA> findInsurances(Date initDate, Date endDate, String origin, String destination) {		
		// ***** TO DO **** //
		
		System.out.println("Aquest es el Origen rebut: " + origin);
		System.out.println("Aquest es el Desti rebut: " + destination);
		System.out.println("Aquesta es la Data de Inici rebuda: " + initDate.toString());
		System.out.println("Aquesta es la Data de Fi rebuda: " + endDate.toString());
		
		List<InsuranceJPA> insurances = new ArrayList<InsuranceJPA>();
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