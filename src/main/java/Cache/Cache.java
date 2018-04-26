package Cache;

import modelo.Ingrediente;

public class Cache {
	
	CacheInterface cacheIngrediente;
	CacheInterface cachePlato;
	
	public Cache() {
		//por ahora
		cacheIngrediente= new CacheIngrediente() ;
		cachePlato = new CachePlato();
	}
	
	//HORRIBLE
	public Object get(Object arg0) {
		if(arg0 instanceof Ingrediente) 
			return cachePlato.get(arg0);
		else {
			return cacheIngrediente.get(arg0);
		} 
	} 
	
	
	
	public Object getI(Object arg0) {
		return cacheIngrediente.get(arg0);
	} 
	
	public void add(Object arg0) {
		
		if((arg0 instanceof IngCant))
			cacheIngrediente.add(arg0);
	
		else {
			cachePlato.add(arg0);
		}
		
	}

}
