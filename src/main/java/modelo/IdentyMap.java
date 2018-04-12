package modelo;

import java.util.HashMap;
import java.util.Map;

public class IdentyMap {

	private static Map<Integer, Ingrediente> ingredientes = new HashMap<Integer,Ingrediente>();;
	
	
	public static void addIngrediente(Ingrediente arg) {
		
		ingredientes.put(arg.getID(), arg);
	}

	public static Ingrediente getIngrediente(int key) {
		
		return ingredientes.get(key);
	}

}
