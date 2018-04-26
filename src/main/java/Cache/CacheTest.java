package Cache;

import static org.junit.Assert.*;

import org.junit.Test;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;

public class CacheTest {

	@Test
	public void enCache() {
		Cache c = new Cache();
		Ingrediente a= new Ingrediente ("papa");
		Cantidad a1= new Cantidad(Medicion.Kg,2);
		Ingrediente b= new Ingrediente ("pera"); 
		Cantidad b1= new Cantidad(Medicion.Kg,5.5);
		
		c.add(new IngCant(a,a1));
		c.add(new IngCant(b,b1));
		 
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

}
