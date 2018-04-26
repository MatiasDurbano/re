package Cache2;

import modelo.Cantidad;
import modelo.Ingrediente;

public class APICacheIngredientes {
	
	Cache<Ingrediente, Cantidad> cacheIngredientes;
	
	public APICacheIngredientes() {
		this.cacheIngredientes = new Cache<Ingrediente, Cantidad>();
	}
	
	public void put(Ingrediente ingrediente, Cantidad cantidad) {
		this.cacheIngredientes.add(ingrediente, cantidad);
	}
	
	public Cantidad get(Ingrediente ingrediente) {
		
		if(this.cacheIngredientes.get(ingrediente) == null) {
			return null;
		}
		else {
			return this.cacheIngredientes.get(ingrediente);
		}
	}
}
