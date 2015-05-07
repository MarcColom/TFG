/**
 * @author Marc Colom Royo - mcolomro@gmail.com
*/

package ejb;

public interface PaymentFacade {

	public Boolean payment(String idShop, String cc, String cad, String cvs, float amount);
		
}	
	