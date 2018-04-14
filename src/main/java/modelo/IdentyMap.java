package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IdentyMap {

	private static Map<Integer, Ingrediente> ingredientes;
	
	private static Map<Integer, Plato> platos;

	public IdentyMap() {
	
		ingredientes = new HashMap<Integer,Ingrediente>();
		platos = new HashMap<Integer,Plato>();;
	
	}
	
	public Ingrediente getIngrediente(int key) {
		
		return ingredientes.get(key);
		
	}
	
	public Plato getPlato(int key) {
		
		return platos.get(key);
		
	}
	
	public ArrayList<Ingrediente> getIngredientes(){
	
		ArrayList<Ingrediente> _ingredientes = new ArrayList<Ingrediente>();
		
		for (Ingrediente ingrediente : ingredientes.values()) {
		    _ingredientes.add(ingrediente);
		}
		
		return _ingredientes;
		
	}
	
	public ArrayList<Plato> getPlatos(){
		
		ArrayList<Plato> _platos = new ArrayList<Plato>();
		
		for (Plato plato : platos.values()) {
		    _platos.add(plato);	
		}
		
		return _platos;
		
	}
	
	public void addIngredientes(List<Ingrediente> arg) {
		ingredientes.clear();
		
		for(Ingrediente ingre : arg) {
			ingredientes.put(ingre.hashCode(), ingre);
		}
		
	}

	
	public void addPlatos(List<Plato> arg) {
		platos.clear();
		
		for(Plato plato : arg) {
			platos.put(plato.hashCode(), plato);
		}
		
	}
}
