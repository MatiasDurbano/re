package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ranker {
	
	public Ranker() {
		
	}
	public List<Plato> ordenar(Map<Plato, Double> map) {
		List<Plato> ret = new ArrayList<Plato>();
		Map<Plato,Double> aux = this.clonar(map);
		
		while(!aux.isEmpty()) {
			Plato maxPlato = Collections.max(aux.entrySet(), Map.Entry.comparingByValue()).getKey();    			
			ret.add(maxPlato);
			aux.remove(maxPlato);
		}			
		return ret;				
	}

	public Map<Plato, Double> clonar(Map<Plato, Double> map)
	{
		Map<Plato,Double> aux = new HashMap<Plato,Double>();
		for(Entry<Plato, Double> entry : map.entrySet()) 
		{
			aux.put(entry.getKey(), entry.getValue());
		}		
		return aux;
	}
}
