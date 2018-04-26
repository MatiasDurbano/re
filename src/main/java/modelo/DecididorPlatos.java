package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class DecididorPlatos {
	
	public static HashMap<Ingrediente, Cantidad> cantidadIngredientes (Plato plato, DataColector Data){
		
		HashMap<Ingrediente, Cantidad> ret = new HashMap<Ingrediente, Cantidad>();
		ArrayList<Ingrediente> ingredientes = AnalizadorPlatos.dameIngredientes(plato);
		DataColector dataColector = Data;
		for(Ingrediente i: ingredientes) {
			ret.put(i, dataColector.getCantidad(i));
		}
		return ret;
	}
	
	public static int esPosibleArmar (Plato plato, DataColector dataColector) {
		
		int cantidadMinima = Integer.MAX_VALUE;
		
		ArrayList<Ingrediente> ingredientes = AnalizadorPlatos.dameIngredientes(plato);
		HashMap<Ingrediente, Cantidad> receta = AnalizadorPlatos.dameIngredientesyCantidad(plato);
		HashMap<Ingrediente, Cantidad> stock = cantidadIngredientes(plato,dataColector);
		
		for(Ingrediente i: ingredientes) {
			int cuantos = (int) (stock.get(i).getValor() / receta.get(i).getValor());
			if(cuantos < cantidadMinima) {
				cantidadMinima = cuantos;
			}
		}
		
		return cantidadMinima;
	}
}
