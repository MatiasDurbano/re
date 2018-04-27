package Cache2;

import modelo.Plato;
import modelo.Receta;

public class APICachePlatos {
	
	Cache<String, Receta> cachePlatos;
	
	public APICachePlatos() {
		this.cachePlatos = new Cache<String, Receta>();
	}
	
	public void put(String plato, Receta receta){
		this.cachePlatos.add(plato, receta);
	}
	
	public Receta get(String plato) {
		if(this.cachePlatos.get(plato) == null) {
			return null;
		}
		else {
			return this.cachePlatos.get(plato);
		}
	}
}
