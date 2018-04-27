package modelo;
import java.util.List;


public class Plato 
{
	String nombre;
	Receta receta;
	public Plato (String nombre, Receta receta)
	{
		this.nombre = nombre;
		this.receta = receta;
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Receta getReceta() {
		return receta;
	}
	
	@Override
	public String toString() {
		return "\n" + "Plato = " + nombre + "\n" +" Receta ="+ receta;
	}
	
	//TODO: pensar si esto seria asi
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plato other = (Plato) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (receta == null) {
			if (other.receta != null)
				return false;
		} else if (!receta.equals(other.receta))
			return false;
		return true;
		
	}
	
}
