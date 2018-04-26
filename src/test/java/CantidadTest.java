
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import modelo.Cantidad;
import modelo.Medicion;

public class CantidadTest {
	
	@Test
	public void test() {
		Cantidad c = new Cantidad(Medicion.Kg, 1);
		String s = "";
		c.setMedicion(Medicion.Lt);
		c.setValor(2);
		s = c.toString();
		assertEquals(c.getMedicion(),Medicion.Lt);
		assertTrue(c.getValor() == 2);
		assertFalse(s.equals("hola"));
	}

}
