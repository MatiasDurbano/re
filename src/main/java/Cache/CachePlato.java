package Cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Plato;

public class CachePlato implements CacheInterface{
	
	private  List<Plato>platos;
	
	public CachePlato () {
		platos = new ArrayList<Plato>();
	}
	
	

	@Override
	public void add(Object arg0) {
		Plato a = (Plato) arg0;
		platos.add(a);
		
	}
 
	@Override
	public Object get(Object arg0) {
		String a = (String) arg0;
		for(Plato p : platos) {
			if (a.equals(p.getNombre()))return p;
		}
		return null;
	}
}
