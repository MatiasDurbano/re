package modelo;
import java.util.List;

public class Plato 
{
	private String nombre;
	private List<Ingrediente> ingredientes;
	
	public Plato (String nombre, List<Ingrediente> ingredientes)
	{
		this.nombre = nombre;
		this.ingredientes = ingredientes;
	}
	
	
	public List<Ingrediente> getReceta(){
		
		return this.ingredientes;
		
	}
	
	public String getNombre(){
		return this.nombre;
	}


	public Integer getID() {
		return this.nombre.hashCode();
	}


	public boolean contiene(Ingrediente arg) {
		
		for(Ingrediente ingrediente:  ingredientes ) {
			if(ingrediente.equals(arg)) return true;
		}
		
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj == null) return false;
		//if(!(obj instanceof  Plato)) return false;
		 
		Plato other = (Plato) obj;
		
		if(other.ingredientes.size() != this.ingredientes.size()|| 
				!(other.nombre.equals(this.nombre))) return false;
		
		for (Ingrediente _ingrediente : ingredientes) {
			if(!(other.ingredientes.contains(_ingrediente))) return false;
			
		}
		return true;
		
		
	}
	
	
}
