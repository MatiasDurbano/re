import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.StockCantidad;

public class StockCantidadTest {

	@Test
	public void equalsTest() {
		StockCantidad a =new StockCantidad();
		StockCantidad b = null;
		StockCantidad c=new StockCantidad();
		StockCantidad d=new StockCantidad();
		
		a.addStock(new Ingrediente("papa"), new Cantidad(Medicion.Kg,2));
		c.addStock(new Ingrediente("papa"), new Cantidad(Medicion.Kg,2));
		
		assertEquals(false, a.equals(null));
		assertEquals(false, a.equals(new Object()));
		assertEquals(false, a.equals(b));
		assertEquals(true, a.equals(c));
		assertEquals(false, a.equals(d));
		
		
	}

	@Test
	public void isEmpty() {
		StockCantidad a =new StockCantidad();
		StockCantidad c=new StockCantidad();
		
		a.addStock(new Ingrediente("papa"), new Cantidad(Medicion.Kg,2));
		
		assertEquals(false, a.isEmpty());
		
		assertEquals(true, c.isEmpty());
		
		
	}
	
	@Test
	public void Contains() {
		StockCantidad a =new StockCantidad();
		StockCantidad c=new StockCantidad();
		
		a.addStock(new Ingrediente("papa"), new Cantidad(Medicion.Kg,2));
		
		assertEquals(true, a.contains(new Ingrediente("papa")));
		
		assertEquals(false, c.contains(new Ingrediente("papa")));
		
		
	}
	
	@Test
	public void getCantidad() {
		StockCantidad a =new StockCantidad();
		StockCantidad c=new StockCantidad();
		Cantidad t =  new Cantidad(Medicion.Kg,2);
		a.addStock(new Ingrediente("papa"), new Cantidad(Medicion.Kg,2));
		
		assertEquals(true,t.equals(a.getCantidad(new Ingrediente("papa"))));
		
		assertEquals(false,t.equals(c.getCantidad(new Ingrediente("papa"))));
		
		
	}
	
	@Test
	public void getIngredientes() {
		StockCantidad a =new StockCantidad();
		StockCantidad c=new StockCantidad();
		Cantidad t =  new Cantidad(Medicion.Kg,2);
		a.addStock(new Ingrediente("papa"), new Cantidad(Medicion.Kg,2));
		a.addStock(new Ingrediente("pera"), new Cantidad(Medicion.Kg,2));
		a.addStock(new Ingrediente("tomate"), new Cantidad(Medicion.Kg,2));
		
		assertEquals(true,a.getIngredientes().contains(new Ingrediente("papa")));
		assertEquals(true,a.getIngredientes().contains(new Ingrediente("pera")));
		assertEquals(true,a.getIngredientes().contains(new Ingrediente("tomate")));
		assertEquals(false,a.getIngredientes().contains(new Ingrediente("repollo")));
		
		
	}
}
