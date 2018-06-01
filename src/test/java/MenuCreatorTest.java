import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import CriteriosSegundaIteracion.BateriaDeTest;
import modelo.Menu;
import modelo.MenuCreator;
import modelo.Plato;
public class MenuCreatorTest {	
	
	@Test
	public void test() {
		List<Plato> platos = BateriaDeTest.damePlatos();
		List<Plato> platos2;
		Map<Plato,Double> map = new HashMap<Plato,Double>();
		map.put(platos.get(0), 1.0);
		map.put(platos.get(1), 4.0);
		map.put(platos.get(2), 2.0);		
		
		MenuCreator mc = new MenuCreator();
		mc.ordenar(map);		
	    Menu m = mc.crearMenu(2);
	    
	    assertTrue(platos.get(1).equals(m.getPlatos().get(0)));		
	}

}
