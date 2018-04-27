package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MenuCreator {
	
	private Menu menu;
	private Ranker ranker;
	private List<Plato> platos;
	
	public MenuCreator() 
	{
		this.menu = new Menu();
		this.ranker = new Ranker();
		this.platos = new ArrayList<Plato>();
	}
	
	public void ordenar(Map<Plato,Integer> map) {
		platos = ranker.ordenar(map);
	}
	
	public Menu crearMenu(int n) {		
		if(n <= this.platos.size()) {			
			for( int i=0; i<n;i++) {
				menu.agregarPlato(platos.get(i));
			}			
		}
		return this.menu;
	}
	
}
