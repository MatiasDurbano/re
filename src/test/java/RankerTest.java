import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import CriteriosSegundaIteracion.BateriaDeTest;
import modelo.Plato;
import modelo.Ranker;
public class RankerTest {
	
	@Test
	public void test() {
		List<Plato> platos = BateriaDeTest.damePlatos();
		List<Plato> platos2;
		Map<Plato,Double> map = new HashMap<Plato,Double>();
		map.put(platos.get(0), 1.0);
		map.put(platos.get(1), 4.0);
		map.put(platos.get(2), 2.0);		
			
		Ranker r = new Ranker();
		platos2 = r.ordenar(map);		
		assertTrue(platos.get(0).equals(platos2.get(2)));		
	}
}
