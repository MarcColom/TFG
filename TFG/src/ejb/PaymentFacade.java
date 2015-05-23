/**
 * @author Marc Colom Royo - mcolomro@gmail.com
*/

package ejb;

import jpa.PaymentJPA;

public interface PaymentFacade {

	public Boolean payment(PaymentJPA payment);
		
}	
	