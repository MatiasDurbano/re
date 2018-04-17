import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import Proxy.ProxyPlato;
import Stub.ProxyCacheStub;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;
import junit.framework.Assert;
import modelo.Cantidad;
import modelo.DataColector;
import modelo.CacheMap;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.StockCantidad;

public class DataColectorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() 
	{
		ProxyIngredienteStub proxyIngrediente = new ProxyIngredienteStub();
		ProxyPlatoStub proxyPlato = new ProxyPlatoStub();
		
		DataColector data= new DataColector(proxyIngrediente,proxyPlato);
		StockCantidad a = new StockCantidad ();
		a = data.getStockIngredientes();
	
		assertEquals(false, a.isEmpty());
	}
	
	@Test
	public void test3() 
	{ 
		ProxyIngredienteStub proxyIngrediente = new ProxyIngredienteStub();
		ProxyPlatoStub proxyPlato = new ProxyPlatoStub();
		DataColector data= new DataColector(proxyIngrediente,proxyPlato);
		
		StockCantidad a = new StockCantidad ();
		a = data.getStockIngredientes();
	    
		ArrayList<Ingrediente> b = a.getIngredientes();
		System.out.println(b.get(0).getNombre() + data.getCantidad(b.get(0)).getValor() );
		Cantidad c= new Cantidad (Medicion.Kg,5.5);
	    
		assertEquals(c, data.getCantidad(b.get(0)));
		assertFalse(c.equals(data.getCantidad(b.get(1))) );  
	}
}
