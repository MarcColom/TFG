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
import java.util.Properties;

import javax.ejb.Stateless;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

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