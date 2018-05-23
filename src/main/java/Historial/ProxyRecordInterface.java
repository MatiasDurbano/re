package Historial;

import java.util.List;

import modelo.Menu;

public interface ProxyRecordInterface {
	
	public List<Menu> getMenues();
	
	public void writeMenues(List<Menu> x);
}
