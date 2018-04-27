package Cache2;

import Interface.ProxyIngredienteInterface;
import modelo.Cantidad;
import modelo.Ingrediente;

public class APICacheIngredientes {
	
	Cache<Ingrediente, Cantidad> cacheIngredientes;
	ProxyIngredienteInterface gateway;
	PoliticaCacheIngrediente politica;
	
	public APICacheIngredientes(Cache<Ingrediente, Cantidad> cacheIngredientes, ProxyIngredienteInterface gateWay, int maximo) {
		this.cacheIngredientes = cacheIngredientes;
		this.gateway = gateWay;
		this.politica = new PoliticaCacheIngrediente(maximo);
	}
	
	public void put(Ingrediente ingrediente, Cantidad cantidad) {
		this.cacheIngredientes.add(ingrediente, cantidad);
	}
	
	public void remove(Ingrediente ingrediente) {
		this.cacheIngredientes.remove(ingrediente);
	}
	
	public Cantidad get(Ingrediente ingrediente) {
		
		Cantidad cantidad = this.cacheIngredientes.get(ingrediente);
		
		if(cantidad == null) {
			
			cantidad = this.gateway.get(ingrediente);
			Ingrediente eliminar = this.politica.analizar(ingrediente);
			if(eliminar != null) {
				this.remove(eliminar);
			}
			this.put(ingrediente, cantidad);
		}
		else {
			this.politica.actualizar(ingrediente);
		}
		
		return cantidad;
	}
}
