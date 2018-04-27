package modelo;

import java.util.List;

public class MenuCreator {
	
	private Menu menu;
	private List<Plato> platos;
	private boolean menuTerminado;
	private Ranker ordenador;
	
	public MenuCreator() 
	{
		this.menu = new Menu();
		menu.asignarFechaActual();
		this.menuTerminado = false;
	}
	
	public void agregarListaPlatos(List p)
	{
		this.platos = p;
	}
	
	public boolean agregarNplatosAlMenu(List p,Integer n)
	{
		this.agregarListaPlatos(p);
		if((!this.platos.isEmpty()) && (p.size() >= n) ) {
			this.menu = this.crearMenu(n);
			return true;
		}
		return false;
	}
	
	public Menu crearMenu(Integer n)
	{
		Menu ret = new Menu();
		for(int i=0; i<n ; i++) 
		{
			ret.agregarPlato(platos.get(i));
		}		
		return ret;
	}
	
}
