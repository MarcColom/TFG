/* 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import jpa.PaymentJPA;

@Stateless
public class PaymentFacadeBean implements PaymentFacade {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	

	@Override
	public Boolean payment(PaymentJPA payment) {
		// SEND PAYMENT TO BANC TPV WEB SERVICE //
		Boolean isPay = true;
		return isPay;
	}
}
