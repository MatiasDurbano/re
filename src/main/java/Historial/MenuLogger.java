package Historial;

import java.util.ArrayList;
import java.util.List;

import modelo.Menu;
import modelo.Plato;

public class MenuLogger {
	
	MenuRecord registroMenus;
	ProxyRecordInterface proxyRecord;
	
	public MenuLogger (int tamañoMaximo, ProxyRecordInterface proxyRecord) {
		this.registroMenus = new MenuRecord(tamañoMaximo);
		this.proxyRecord = proxyRecord;
	}
	
	public void update(Menu menu) {
		this.registroMenus.agregar(menu);
	}
	
	public void load() {
		List<Menu> menues = this.proxyRecord.getMenues();
		for(Menu menu: menues) {
			this.update(menu);
		}
	}
	
	public void save() {
		
		List<Menu> aActualizar = new ArrayList<Menu>();
		Menu[] menus = this.obtenerMenus();
		
		for(int i = 0; i < menus.length; i ++) {
			aActualizar.add(menus[i]);
		}
		
		this.proxyRecord.writeMenues(aActualizar);
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
