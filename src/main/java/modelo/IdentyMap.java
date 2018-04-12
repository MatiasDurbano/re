package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IdentyMap {

	private static Map<Integer, Ingrediente> ingredientes = new HashMap<Integer,Ingrediente>();;
	private static Map<Integer, Plato> platos = new HashMap<Integer,Plato>();;
	
	
	public static void addIngrediente(Ingrediente arg) {
		
		ingredientes.put(arg.getID(), arg);
	}
	
	public static void addPlato(Plato arg) {
		
		platos.put(arg.getID(), arg);
	}

	public static Ingrediente getIngrediente(int key) {
		
		return ingredientes.get(key);
	}
	
	public static Plato getPlato(int key) {
		
		return platos.get(key);
	}
	
	public static ArrayList<Ingrediente> getIngredientes(){
	
		ArrayList<Ingrediente> _ingredientes = new ArrayList<Ingrediente>();
		
		for (Ingrediente ingrediente : ingredientes.values()) {
		    _ingredientes.add(ingrediente);
		}
		
		return _ingredientes;
		
	}
	
	public static ArrayList<Plato> getPlatosPorIngrediente(Ingrediente arg){
		
		ArrayList<Plato> _platos = new ArrayList<Plato>();
		
		for (Plato plato : platos.values()) {
		    if(plato.contiene(arg)) _platos.add(plato);
		    	
		}
		
		return _platos;
		
	}

}
