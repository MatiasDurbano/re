package Cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Interface.CacheInterface;
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
		List<Plato> a = (ArrayList<Plato>) arg0;
		for(Plato plato : a) {
			platos.add(plato);
		}
		
		System.out.println(platos.size());
		
	}
	@Override
	public Object get(Object arg0) {
		String a = (String) arg0;
		Object ret= null;
		
		System.out.println(platos.size());
		System.out.println("Platos : "+ a );
		for(Plato p : platos) {
			
			System.out.println(a +" "+ p.getNombre());
			if (a.equals(p.getNombre())) {
				return p.getReceta();
			} 		
		}
		return ret;
	}
}
