package modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu 
{	
	private List<Plato> platos;	
	private Date fecha_de_creacion;	
	
	public Menu() 
	{
		this.platos = new ArrayList<Plato>();
	}

	public List<Plato> getPlatos() {
		return platos;
	}	
	
	public void agregarPlato(Plato p)
	{
		this.platos.add(p);
	}
	public Date getFecha_de_Creacion() 
	{
		return this.fecha_de_creacion;
	}
	public void asignarFechaActual()
	{
		this.fecha_de_creacion = new Date(System.currentTimeMillis());
	}
}
