import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import modelo.Ingrediente;
public class IngredienteTest {
	
	public void test() {
		Ingrediente i1 = new Ingrediente("papa");
		Ingrediente i2 = null;
		assertFalse(i1.equals(i2));
		assertTrue(i1.equals(i1));
		assertEquals(i1.getNombre(),"papa");
		assertEquals(i1.toString(),"papa");
	}

}
