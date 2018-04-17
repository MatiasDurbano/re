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
	@Override
	public String toString() {
		return "Plato [" + nombre + ", " + receta + "]";
	}
}
