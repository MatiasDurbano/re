package modelo;

import java.util.ArrayList;
import java.util.List;

public class DB {
	
	List<Plato> platos;
	
	public DB() {
		platos = new ArrayList<Plato>();
	}
	
	public void add(Plato arg0) {
		platos.add(arg0);	
	}
	
	
	public List<Plato> get() {
		return platos;
	}

}
