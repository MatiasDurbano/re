package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AnalizadorPlatos 
{
	public static Map<Ingrediente, Cantidad> dameIngredientesyCantidad(Plato plato)
	{
		Map<Ingrediente, Cantidad> map;
		map = plato.receta.receta;
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
