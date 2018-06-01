package Historial;

import java.util.ArrayList;
import java.util.List;

import criteriosDeAceptacion_2da.BateriaDeTest;
import modelo.Menu;

public class ProxyRecordStub implements ProxyRecordInterface {
	
	List<Menu> menues;
	
	public ProxyRecordStub() {
		this.menues = new ArrayList<Menu>();
		this.menues.add(BateriaDeTest.menuPrueba1());
		this.menues.add(BateriaDeTest.menuPrueba2());
		this.menues.add(BateriaDeTest.menuPrueba3());
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
