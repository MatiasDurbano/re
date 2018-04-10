package modelo;
import java.util.List;

public class Plato 
{
	String nombre;
	List<Ingrediente> ingredientes;
	
	public Plato (String nombre, List<Ingrediente> ingredientes)
	{
		this.nombre = nombre;
		this.ingredientes = ingredientes;
	}
}
