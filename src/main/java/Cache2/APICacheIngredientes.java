package Cache2;

import Proxy.ProxyIngrediente;
import modelo.Cantidad;
import modelo.Ingrediente;

public class APICacheIngredientes {
	
	Cache<Ingrediente, Cantidad> cacheIngredientes;
	ProxyIngrediente gateway;
	
	public APICacheIngredientes(Cache<Ingrediente, Cantidad> cacheIngredientes, ProxyIngrediente gateWay) {
		this.cacheIngredientes = cacheIngredientes;
		this.gateway = gateWay;
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
