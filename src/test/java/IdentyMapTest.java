

import org.junit.Test;

import junit.framework.Assert;
import modelo.Cantidad;
import modelo.IdentyMap;
import modelo.Ingrediente;
import modelo.Medicion;

public class IdentyMapTest {

	
	
	@Test
	public void testAddIdenty() {
		Ingrediente ingrediente = new Ingrediente("Papa", new Cantidad(Medicion.Unidad,2));
		IdentyMap.addIngrediente(ingrediente);
		boolean esperado = true;
		
		Ingrediente ingrediente2 = IdentyMap.getIngrediente(ingrediente.getID());
		Assert.assertEquals(esperado,ingrediente.equals(ingrediente2));
	 		
	}
	
	@Test
	public void testAddIdenty2() {
		Ingrediente ingrediente = new Ingrediente("Papa", new Cantidad(Medicion.Unidad,2));
		Ingrediente ingrediente2 = new Ingrediente("Pera", new Cantidad(Medicion.Unidad,2));
		Ingrediente ingrediente3 = new Ingrediente("Pata de pollo", new Cantidad(Medicion.Unidad,2));
		IdentyMap.addIngrediente(ingrediente);
		IdentyMap.addIngrediente(ingrediente2);	
		
		Assert.assertEquals(true,ingrediente.equals(IdentyMap.getIngrediente(ingrediente.getID())));
		Assert.assertEquals(true,ingrediente2.equals(IdentyMap.getIngrediente(ingrediente2.getID())));
		Assert.assertEquals(false,ingrediente3.equals(IdentyMap.getIngrediente(ingrediente3.getID())));
		
	}

	

}
