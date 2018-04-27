package Cache2;

import Proxy.ProxyIngrediente;
import modelo.Cantidad;
import modelo.Ingrediente;

public class APICacheIngredientes {
	
	Cache<Ingrediente, Cantidad> cacheIngredientes;
	ProxyIngrediente gateway;
	PoliticaCacheIngrediente politica;
	
	public APICacheIngredientes(Cache<Ingrediente, Cantidad> cacheIngredientes, ProxyIngrediente gateWay) {
		this.cacheIngredientes = cacheIngredientes;
		this.gateway = gateWay;
		this.politica = new PoliticaCacheIngrediente(10);
	}
	
	public void put(Ingrediente ingrediente, Cantidad cantidad) {
		this.cacheIngredientes.add(ingrediente, cantidad);
	}
	
	public void borrar(Ingrediente ingrediente) {
		this.cacheIngredientes.remove(ingrediente);
	}
	
	public Cantidad get(Ingrediente ingrediente) {
		
		Cantidad cantidad = this.cacheIngredientes.get(ingrediente);
		
		if(cantidad == null) {
			Ingrediente eliminar = this.politica.analizar(ingrediente);
			if(eliminar != null) {
				this.cacheIngredientes.remove(eliminar);
			}
			this.put(ingrediente, cantidad);
		}
		else {
			this.politica.actualizar(ingrediente);
		}
		
		return cantidad;
	}
}
