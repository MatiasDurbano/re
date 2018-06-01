package Stub;

import java.util.ArrayList;
import java.util.List;

import Historial.ProxyRecordInterface;
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