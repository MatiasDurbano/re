import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;
import modelo.StockCantidad;

import org.junit.Test;

import Stub.ProxyCacheStub;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;

public class ProxyCacheStubTest 
{
	@Test
	public void testPlatos() 
	{
		ProxyCacheStub stub = new ProxyCacheStub();
		ArrayList<Plato> lista = new ArrayList<Plato>();
		//Plato fideos con tuco , Receta: tomate (10), fideos (8)
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente fideos = new Ingrediente("fideos");
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Map<Ingrediente, Cantidad> am = new HashMap<Ingrediente, Cantidad>();
		am.put(tomate, diez);
		am.put(fideos, ocho);
		Receta ar = new Receta(am);
		String as = "Fideos con tuco";
		Plato a = new Plato(as, ar);
		
		//carne al horno con papas , Receta: carne (5), papas (4)
		Ingrediente carne = new Ingrediente("carne");
		Ingrediente papas = new Ingrediente("papas");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad cuatro = new Cantidad(Medicion.Unidad, 4);
		Map<Ingrediente, Cantidad> bm = new HashMap<Ingrediente, Cantidad>();
		bm.put(carne, cinco);
		bm.put(papas, cuatro);
		Receta br = new Receta(am);
		String bs = "Carne al horno con papas";
		Plato b = new Plato(bs, br);
		
		lista.add(a);
		lista.add(b);
		assertEquals(true, stub.getPlatos().equals(lista));
		assertEquals(false, stub.getPlatos().isEmpty());
	}
	
	@Test
	public void testStock() 
	{
		ProxyCacheStub stub = new ProxyCacheStub();

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
	
		assertEquals(true, stub.getCantidad().equals(stock));
		assertEquals(false, stub.getCantidad().isEmpty());
	}
	@Test
	public void testActualizar() 
	{
		ProxyCacheStub stub = new ProxyCacheStub();
		stub.actualizar();
	}
	@Test
	public void testEstaActualizada() 
	{
		ProxyCacheStub stub = new ProxyCacheStub();
		assertEquals(true, stub.estaActualizada());
		assertEquals(false, !stub.estaActualizada());
	}
}
