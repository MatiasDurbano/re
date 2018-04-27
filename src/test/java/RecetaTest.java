import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Receta;

public class RecetaTest {
	public void test() {
		
		Ingrediente i = new Ingrediente("papa");
		Ingrediente i2 = new Ingrediente("pollo");
		Cantidad c = new Cantidad(Medicion.Kg, 10);
		Cantidad c2 = new Cantidad(Medicion.Kg,5);
		Map<Ingrediente, Cantidad> map = new HashMap<Ingrediente, Cantidad>();
		Map<Ingrediente, Cantidad> map2 = new HashMap<Ingrediente, Cantidad>();
		map2.put(i2, c2);
		map.put(i, c);
		Receta r = new Receta(map);		
		Receta r2 = null;	
		Receta r3;
		assertNotEquals(r.toString(),"hola");
		assertFalse(r.equals(r2));
		r2 = new Receta(map2);
		assertFalse(r.equals(r2));
		r3 = new Receta(r.getReceta());
		assertTrue(r.equals(r3));
		
		
		
	}
}
