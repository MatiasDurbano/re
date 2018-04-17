package modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu 
{	
	private Map<Plato, Integer> platos;	
	private Date fecha_de_creacion;
	private Date fecha_de_implementacion;	
	
	public Menu() 
	{
		this.platos = new HashMap<Plato, Integer>();
		this.fecha_de_creacion = new Date(System.currentTimeMillis());
	}

	public Map<Plato, Integer> getPlatos() {
		return platos;
	}	
	
	public void AgregarMenu(Plato p, Integer i)
	{
		this.platos.put(p, i);
	}
	public Date getFecha_de_Creacion() 
	{
		return this.fecha_de_creacion;
	}
}
