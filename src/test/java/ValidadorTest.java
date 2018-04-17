import static org.junit.Assert.*;

import org.junit.Test;

import Stub.ProxyIngredienteStub;
import modelo.Cantidad;
import modelo.DataColector;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.StockCantidad;

public class ValidadorTest {

	@Test
	public void test() {
		ProxyIngredienteStub stock = new ProxyIngredienteStub();
		DataColector data= new DataColector();
		StockCantidad a = data.getStockIngredientes(); 
		
		for( Ingrediente ing : a.getIngredientes()) {
			System.out.println(ing.getNombre()+" " + a.getCantidad(ing).getValor());
		}
		
		assertEquals(4,a.getIngredientes().size());
		 
	}

}
