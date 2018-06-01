package Historial;

import java.util.Arrays;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuRecord other = (MenuRecord) obj;
		if (!Arrays.equals(menus, other.menus))
			return false;
		if (tamañoMaximo != other.tamañoMaximo)
			return false;
		return true;
	}
}
