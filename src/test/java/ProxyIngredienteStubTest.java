import static org.junit.Assert.*;
import modelo.Cantidad;
import modelo.DataColector;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.StockCantidad;

import org.junit.Test;

import Stub.ProxyIngredienteStub;


public class ProxyIngredienteStubTest 
{
	@Test
	public void test() 
	{
		ProxyIngredienteStub stub = new ProxyIngredienteStub(1);
		
		StockCantidad stock = new StockCantidad();
		Ingrediente a= new Ingrediente ("papa");
		Cantidad a1= new Cantidad(Medicion.Kg,2);
		Ingrediente b= new Ingrediente ("pera");
		Cantidad b1= new Cantidad(Medicion.Kg,5.5);
		Ingrediente c= new Ingrediente ("tomate");
		Cantidad c1= new Cantidad(Medicion.Kg,2.0);
		Ingrediente d= new Ingrediente ("cebolla");
		Cantidad d1= new Cantidad(Medicion.Kg,1.0); 
		Ingrediente e= new Ingrediente ("papa");
		Cantidad e1= new Cantidad(Medicion.Kg,4); 
		
		stock.addStock(a, a1);
		stock.addStock(b, b1);
		stock.addStock(c, c1);
		stock.addStock(d, d1);
		stock.addStock(e, e1);
	
		assertEquals(true, stub.get().equals(stock));
		assertEquals(false, stub.get().isEmpty());
	}
	@Test
	public void test2() 
	{
		ProxyIngredienteStub stub = new ProxyIngredienteStub();
		
		StockCantidad stock = new StockCantidad();
		Ingrediente a= new Ingrediente ("papa");
		Cantidad a1= new Cantidad(Medicion.Kg,2);
		Ingrediente b= new Ingrediente ("pera"); 
		Cantidad b1= new Cantidad(Medicion.Kg,5.5);
		Ingrediente c= new Ingrediente ("tomate");
		Cantidad c1= new Cantidad(Medicion.Kg,2.0);
		Ingrediente d= new Ingrediente ("cebolla");
		Cantidad d1= new Cantidad(Medicion.Kg,1.0); 
		Ingrediente e= new Ingrediente ("papapapa");
		Cantidad e1= new Cantidad(Medicion.Kg,-4); 
		
		stock.addStock(a, a1);
		stock.addStock(b, b1);
		stock.addStock(c, c1);
		stock.addStock(d, d1);
		stock.addStock(e, e1);
	
		assertEquals(true, stub.get().equals(stock));
		assertEquals(false, stub.get().isEmpty());
	}
}
