import static org.junit.Assert.*;

import org.junit.Test;

import Stub.ProxyCacheStub;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;
import modelo.DataColector;
import modelo.Ingrediente;
import modelo.StockCantidad;

public class ValidadorTest 
{	
	@Test
	public void ingredienteRepetido() 
	{
		ProxyIngredienteStub proxyIngrediente = new ProxyIngredienteStub();
		ProxyPlatoStub proxyPlato = new ProxyPlatoStub();
		ProxyCacheStub proxyCache = new ProxyCacheStub(proxyIngrediente,proxyPlato);
		
		DataColector data= new DataColector(proxyCache);
		
		StockCantidad a = data.getStockIngredientes(); 
		 
		for( Ingrediente ing : a.getIngredientes()) {
			System.out.println(ing.getNombre()+" " +  a.getCantidad(ing).getValor());
		}
		
		assertEquals(4,a.getIngredientes().size());
	}
}
