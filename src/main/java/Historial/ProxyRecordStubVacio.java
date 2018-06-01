package Historial;

import java.util.ArrayList;
import java.util.List;

import criteriosDeAceptacion_2da.BateriaDeTest;
import modelo.Menu;

public class ProxyRecordStubVacio implements ProxyRecordInterface {
	
	List<Menu> menues;
	
	public ProxyRecordStubVacio() {
		this.menues = new ArrayList<Menu>();
	}

	@Override
	public List<Menu> getMenues() {
		return this.menues;
	}

	@Override
	public void writeMenues(List<Menu> x) {
		this.menues = x;
	}

}