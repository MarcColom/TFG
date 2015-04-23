/**
  * @author Marc Colom Royo - mcolomro@gmail.com
  */

package wsTaeds;

import java.util.List;
import wsTaedsLoginResponse.RESPUESTACONFIGURACION;
import jpa.OrderJPA;



public interface TaedsFacadeRemote {	

	public List<OrderJPA> TaedsLogin(OrderJPA newOrder);
	
	public OrderJPA setOrder(OrderJPA in, OrderJPA newOrder, RESPUESTACONFIGURACION.MODALIDADES.MODALIDAD tempModalidad) ;
	
	
	
}
