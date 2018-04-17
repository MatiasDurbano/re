import static org.junit.Assert.*;
import org.junit.Test;
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
		DataColector data= new DataColector(proxyIngrediente,proxyPlato);
		 
		StockCantidad a = data.getStockIngredientes(); 
		
		for( Ingrediente ing : a.getIngredientes()) {
			System.out.println(ing.getNombre()+" " + a.getCantidad(ing).getValor());
		}
		
		assertEquals(4,a.getIngredientes().size());
	}
}
