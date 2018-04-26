package Cache;

import modelo.Cantidad;
import modelo.Ingrediente;

public class IngCant {
	Ingrediente ing;
	Cantidad cant;
	
	
	public IngCant(Ingrediente ing, Cantidad cant){
		this.ing= ing;
		this.cant= cant;
	}
	
	public Ingrediente getIng() {
		return ing;
	}
	
	public Cantidad getCant() {
		return cant;
	}
	
}
