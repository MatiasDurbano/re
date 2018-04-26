package modelo;

public class DataTransfer {
	Ingrediente ing;
	Cantidad cant;
	
	
	public DataTransfer(Object ing, Object cant){ 
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
