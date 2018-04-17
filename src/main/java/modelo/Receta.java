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
}
