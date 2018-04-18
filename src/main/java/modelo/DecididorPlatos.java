package modelo;

import java.util.ArrayList;
import java.util.HashMap;

public class DecididorPlatos {
	
	public HashMap<Ingrediente, Cantidad> cantidadIngredientes (Plato plato, DataColector Data){
		
		HashMap<Ingrediente, Cantidad> ret = new HashMap<Ingrediente, Cantidad>();
		ArrayList<Ingrediente> ingredientes = AnalizadorPlatos.dameIngredientes(plato);
		DataColector dataColector = Data;
		for(Ingrediente i: ingredientes) {
			ret.put(i, dataColector.getCantidad(i));
		}
		return ret;
	}
	
	public boolean esPosibleArmar (Plato plato, DataColector dataColector) {
		
		boolean ret = true;
		
		ArrayList<Ingrediente> ingredientes = AnalizadorPlatos.dameIngredientes(plato);
		HashMap<Ingrediente, Cantidad> receta = AnalizadorPlatos.dameIngredientesyCantidad(plato);
		HashMap<Ingrediente, Cantidad> stock = cantidadIngredientes(plato,dataColector);
		
		for(Ingrediente i: ingredientes) {
			
			if(receta.get(i).getValor() <= stock.get(i).getValor()) {
				ret = ret & true;
			}
			else {
				ret = ret & false;
			}
		}
		
		return ret;
	}
}
