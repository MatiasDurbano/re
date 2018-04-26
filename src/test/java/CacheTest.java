

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import Cache.Cache;
import Cache.CachePlato;
import modelo.Cantidad;
import modelo.DataTransfer;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;

public class CacheTest {

	@Test
	public void enCache() {
		Cache c = new Cache();
		Ingrediente a= new Ingrediente ("papa");
		Cantidad a1= new Cantidad(Medicion.Kg,2);
		Ingrediente b= new Ingrediente ("pera"); 
		Cantidad b1= new Cantidad(Medicion.Kg,5.5);
		
		c.add(new DataTransfer(a,a1));
		c.add(new DataTransfer(b,b1));
		 
		Cantidad exp= new Cantidad(Medicion.Kg,2);
		Cantidad exp2= new Cantidad(Medicion.Kg,5.5);
		
		
		assertEquals(true,exp.equals((Cantidad) c.get(new Ingrediente ("papa"))));
		assertEquals(true,exp2.equals((Cantidad) c.get(new Ingrediente ("pera")))); 
	}
	
	@Test
	public void enStub() {
		Cache c = new Cache();
		Ingrediente a= new Ingrediente ("papa");
		Cantidad a1= new Cantidad(Medicion.Kg,2);
		Ingrediente b= new Ingrediente ("pera"); 
		Cantidad b1= new Cantidad(Medicion.Kg,5.5);
		
		
		Cantidad exp= a1;
		Cantidad exp2= b1;
		
		
		assertEquals(true,exp.equals((Cantidad) c.get(new Ingrediente ("papa"))));
		assertEquals(true,exp2.equals((Cantidad) c.get(new Ingrediente ("pera")))); 
	}
	
	@Test
	public void plato() {
		
		Cache c = new Cache();
		
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


		assertEquals(true, ar.equals(c.get("Fideos con tuco")));
		
	}

}
