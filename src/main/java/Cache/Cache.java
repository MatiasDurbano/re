package Cache;

import modelo.Ingrediente;
import modelo.Plato;

public class Cache {
	
	CacheInterface cacheIngrediente;
	CacheInterface cachePlato;
	ActualizadorCache actualizador;
	Seacher buscador;
	
	public Cache() {
		//por ahora
		cacheIngrediente= new CacheIngrediente() ;
		cachePlato = new CachePlato();
		actualizador= new ActualizadorCache();
		buscador = new Seacher();
	}
	
	//HORRIBLE
	public Object get(Object arg0) {
		Object ret = null ;
		
		if(arg0 instanceof Ingrediente) 
			 ret = cacheIngrediente.get(arg0);
		
		if( arg0 instanceof Plato) 
			 ret = cachePlato.get(arg0);
		
		if(ret==null)
			 ret = actualizar(arg0);
		
		return ret;
	} 
	
	
	public void add(Object arg0) {
		actualizador.add(arg0);
	}
	
	private Object actualizar(Object arg0) {
		Object ret = buscador.get(arg0);
		add(new IngCant(arg0,ret));
		return ret;
	}

}
