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
	
	
}
