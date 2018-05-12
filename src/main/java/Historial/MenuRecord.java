package Historial;

import modelo.Menu;

public class MenuRecord {
	Menu[] menus;
	int tamañoMaximo;
	int puntero;
	
	public MenuRecord(int tamañoMaximo) {
		this.tamañoMaximo = tamañoMaximo;
		this.menus = new Menu[this.tamañoMaximo];
		this.puntero = 0;
	}
	
	public void agregar(Menu menu) {
		this.menus[puntero] = menu;
		this.puntero ++;
		if(this.puntero == this.tamañoMaximo) {
			this.puntero = 0;
		}
	}
	
	public Menu[] menus() {
		return this.menus;
	}
}
