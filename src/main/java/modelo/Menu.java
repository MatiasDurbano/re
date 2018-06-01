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
	public Menu(List<Plato> platos) 
	{
		this.platos = platos;
		asignarFechaActual();
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
	@Override
	public boolean equals(Object other) {
		Menu o = (Menu) other;
		if(this.platos.equals(o.getPlatos())) {
			return true;
		}
		return false;
	}
	public boolean contains(Plato p) {
		for(Plato i : this.platos) {
			if(i.equals(p)) return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		String ret = "Menu:";
			for(Plato i : this.platos) {
				ret= ret+i.toString();
			}
		return ret;
	}
	
}
