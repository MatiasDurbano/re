package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ranker {
	
	public Ranker() {
		
	}
	public List<Plato> ordenar(Map<Plato,Integer> p) {
		List ret = new ArrayList<Plato>();
		Map<Plato,Integer> aux = new HashMap<Plato,Integer>();
		
		for(Map.Entry<Plato, Integer> entry : p.entrySet()) {
			aux.put(entry.getKey(), entry.getValue());
		}
		
		while(!aux.isEmpty()) {
			Plato maxPlato = Collections.max(aux.entrySet(), Map.Entry.comparingByValue()).getKey();    			
			ret.add(maxPlato);
			aux.remove(maxPlato);
		}			
		return ret;				
	}

}
