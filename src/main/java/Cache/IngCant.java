package Cache;

import modelo.Cantidad;
import modelo.Ingrediente;

public class IngCant {
	Ingrediente ing;
	Cantidad cant;
	
	
	public IngCant(Object ing, Object cant){ 
		this.ing= (Ingrediente)ing;
		this.cant= (Cantidad) cant;
	}
	
	public Ingrediente getIng() {
		return ing;
	}

	public Cantidad getCant() {
		return cant;
	}
	
}
