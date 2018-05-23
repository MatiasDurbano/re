package Historial;

import java.util.ArrayList;
import java.util.List;

import modelo.Menu;

public class ProxyRecordStub implements ProxyRecordInterface {
	
	List<Menu> menues;
	
	public ProxyRecordStub() {
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
