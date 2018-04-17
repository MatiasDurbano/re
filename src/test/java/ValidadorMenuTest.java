

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

import Validadores.ValidadorMenu;
import modelo.Menu;
import modelo.Plato;

public class ValidadorMenuTest {

	@Test
	public void test() {
		Menu menu = new Menu();		
		assertTrue(ValidadorMenu.MenuVacio(menu));
		assertFalse(menu.getFecha_de_Creacion() == null);
		
		
		
		for(Map.Entry<Plato, Integer> entry: menu.getPlatos().entrySet())
		{
			assertTrue(entry.getValue() >= 0);
		}
		
		
		
		
		
	}
}
