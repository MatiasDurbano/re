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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receta other = (Receta) obj;
		if (receta == null) {
			if (other.receta != null)
				return false;
		} else if (!receta.equals(other.receta))
			return false;
		return true;
	}
	
}
