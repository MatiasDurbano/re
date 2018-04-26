package Cache2;

import modelo.Plato;
import modelo.Receta;

public class APICachePlatos {
	
	Cache<Plato, Receta> cachePlatos;
	
	public APICachePlatos() {
		this.cachePlatos = new Cache<Plato, Receta>();
	}
	
	public void put(Plato plato, Receta receta){
		this.cachePlatos.add(plato, receta);
	}
	
	public Receta get(Plato plato) {
		if(this.cachePlatos.get(plato) == null) {
			return null;
		}
		else {
			return this.cachePlatos.get(plato);
		}
	}
}
