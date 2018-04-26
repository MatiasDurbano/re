package modelo;

public class Ingrediente 
{
	private String nombre;
	
	
	public Ingrediente (String nombre) {
		
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if( arg0==null) return false;
		if(!(arg0 instanceof Ingrediente))return false;
		
		Ingrediente obj = (Ingrediente) arg0;
		return this.nombre.equals(obj.getNombre());
		
	}
	
	@Override
	public int hashCode() {
		return this.nombre.hashCode();
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
