import static org.junit.Assert.*;

import org.junit.Test;

import Interface.ProxyCacheInterface;
import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;
import Proxy.ProxyCache;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;
import modelo.DataColector;
import modelo.StockCantidad;

public class CacheTest {

	@Test
	public void test() {
		ProxyCacheInterface cache = new ProxyCache(new ProxyIngredienteStub(),new ProxyPlatoStub());
		DataColector data = new DataColector(cache);
		
		StockCantidad stock= data.getStockIngredientes();
		
		StockCantidad stock2 = data.getStockIngredientes(); //por cache
		
		assertEquals(stock,stock2);
		
	}

}
