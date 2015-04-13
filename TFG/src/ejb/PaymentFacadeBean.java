/* 
 * @author Marc Colom Royo - mcolomro@gmail.com * 
 */

package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PaymentFacadeBean implements PaymentFacade {

	// Persistence Unit Context
	@PersistenceContext(unitName = "SegurosyViajes")
	private EntityManager entman;
	

	@Override
	public Boolean payment(String idShop, String cc, String cad, String cvs, float amount) {
		//***** TO DO **** //
		Boolean isPay = false;
		return isPay;
	}
}
