import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import modelo.Plato;
import modelo.Ranker;
public class RankerTest {
	
	@Test
	public void test() {
		List<Plato> platos = BateriaDeTest.damePlatos();
		List<Plato> platos2;
		Map<Plato,Integer> map = new HashMap<Plato,Integer>();
		map.put(platos.get(0), 1);
		map.put(platos.get(1), 4);
		map.put(platos.get(2), 2);		
			
		Ranker r = new Ranker();
		platos2 = r.ordenar(map);		
		assertTrue(platos.get(0).equals(platos2.get(2)));		
	}
}
