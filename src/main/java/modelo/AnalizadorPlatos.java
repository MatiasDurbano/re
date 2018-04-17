package modelo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalizadorPlatos 
{
	public static Map<Ingrediente, Cantidad> dameIngredientesyCantidad(Plato plato)
	{
		Map<Ingrediente, Cantidad> map = new HashMap<Ingrediente,Cantidad>();
		for (Map.Entry<Ingrediente, Cantidad> entry: plato.receta.receta.entrySet()) 
		{
			map.put(entry.getKey(), entry.getValue());
		}
		return map;
	}
	
	public static List<Ingrediente> dameIngredientes(Plato plato)
	{
		List<Ingrediente> lista = new ArrayList<Ingrediente>();
		for (Map.Entry<Ingrediente, Cantidad> entry: plato.receta.receta.entrySet()) 
		{
			lista.add(entry.getKey());
		}
		return lista;
	}
}
