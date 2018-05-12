package Historial;

import modelo.Menu;
import modelo.Plato;

public class MenuLogger {
	
	MenuRecord registroMenus;
	
	public MenuLogger (int tamañoMaximo) {
		this.registroMenus = new MenuRecord(tamañoMaximo);
	}
	
	public void registrar(Menu menu) {
		this.registroMenus.agregar(menu);
	}
	
	public int platosEncontrados(Plato plato) {
		int ret = 0;
		Menu[] menus = this.obtenerMenus();
		
		for(int i = 0; i < menus.length; i ++) {
			if(menus[i].getPlatos().contains(plato)) {
				ret++;
			}
		}
		
		return ret;
	}
	
	public Menu[] obtenerMenus() {
		return this.registroMenus.menus;
	}
}
