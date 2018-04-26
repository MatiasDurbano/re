package modelo;

import java.util.HashMap;
import java.util.Map;
public class Receta 
{
	private Map<Ingrediente, Cantidad> receta;
	
	public Receta(Map<Ingrediente, Cantidad> map) 
	{
		Map<Ingrediente, Cantidad> receta = new HashMap<Ingrediente, Cantidad>();
		for (Map.Entry<Ingrediente, Cantidad> entry: map.entrySet()) 
		{
			receta.put(entry.getKey(), entry.getValue());
		}
		this.receta = map;
	}

	public Map<Ingrediente, Cantidad> getReceta() 
	{
		return receta;
	}

	@Override
	public String toString() 
	{
		return receta.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		;
		Receta other = (Receta) obj;
		Map<Ingrediente,Cantidad> receta2= other.getReceta();
		
		for (Map.Entry<Ingrediente, Cantidad> entry: receta.entrySet()) 
		{
			if(!(receta2.containsKey(entry.getKey())) || !(receta2.containsValue(entry.getValue()))) {
				return false;
			}
		}
		return true;
		
	}
	
}
