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
	
	@Override
	public boolean equals(Object arg) {
		if( arg == null) return false;
		if(!(arg instanceof  Ingrediente)) return false;
		
		Ingrediente other = (Ingrediente) arg;
		
		return this.nombre.equals(other.nombre);
	}
	
	
}
