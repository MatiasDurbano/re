import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import modelo.Cantidad;
import modelo.DataColector;
import modelo.IdentyMap;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.StockCantidad;

public class DataColectorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		DataColector data= new DataColector();
		StockCantidad a = new StockCantidad ();
		a = data.getStockIngredientes();
	
		assertEquals(false, a.isEmpty());
		 
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void test2() { 
		DataColector data= new DataColector();
		StockCantidad a = new StockCantidad ();
		a = data.getStockIngredientes();
	    ArrayList<Ingrediente> b = a.getIngredientes();
	    
	    for(Ingrediente c: b) {
	    	System.out.println( c.getNombre());
	    }
		
		
		assertEquals("papa", b.get(2).getNombre());
		 
	}
	
	
	@Test
	public void test3() { 
		DataColector data= new DataColector();
		StockCantidad a = new StockCantidad ();
		a = data.getStockIngredientes();
	    
		ArrayList<Ingrediente> b = a.getIngredientes();
		
		ArrayList<Cantidad> c =new ArrayList<Cantidad>();
		
		for(int i=0; i<b.size();i++) {
			c.add(data.getCantidad(b.get(i)));
			System.out.println(b.get(i).getNombre()+" "+c.get(i).getValor());
		}
	    
		
		assertEquals(4, c.size());
		 
	}
	
	

}
