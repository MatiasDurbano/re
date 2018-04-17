package modelo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalizadorPlatos 
{
	public static HashMap<Ingrediente, Cantidad> dameIngredientesyCantidad(Plato plato)
	{
		HashMap<Ingrediente, Cantidad> map = new HashMap<Ingrediente,Cantidad>();
		for (Map.Entry<Ingrediente, Cantidad> entry: plato.receta.getReceta().entrySet()) 
		{
			map.put(entry.getKey(), entry.getValue());
		}
		return map;
	}
	
	public static ArrayList<Ingrediente> dameIngredientes(Plato plato)
	{
		ArrayList<Ingrediente> lista = new ArrayList<Ingrediente>();
		for (Map.Entry<Ingrediente, Cantidad> entry: plato.receta.getReceta().entrySet()) 
		{
			lista.add(entry.getKey());
		}
		return lista;
	}
}
