package modelo;

public class Ingrediente 
{
	private String nombre;
	private Cantidad cantidad;
	
	
	public Ingrediente(String nombre, Cantidad cantidad)
	{
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public String getNombre(){
		
		return nombre;
	}
	
	public Cantidad getCantidad(){
		return cantidad;
	}

	public int getID() {
		return nombre.hashCode();
	}
	
	
	public boolean equals(Ingrediente arg) {
		if(arg == null)return false;
		
		return this.nombre.equals(arg.nombre);
	}
	
	
}
