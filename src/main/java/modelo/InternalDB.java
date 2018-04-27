package modelo;

import java.util.ArrayList;
import java.util.List;

public class InternalDB {
	
	List<Plato> platos;
	
	public InternalDB() {
		platos = new ArrayList<Plato>();
	}
	
	public void add(Plato arg0) {
		if(!(platos.contains(arg0)))
			platos.add(arg0);	 
	}
	
	
	public List<Plato> get() {
		return platos;
	}

}
