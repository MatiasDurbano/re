package Cache;

import Interface.ActualizadorCacheInterface;
import Interface.CacheInterface;
import modelo.DataTransfer;
import modelo.Ingrediente;


public class ActualizadorCache implements ActualizadorCacheInterface {
	
	CacheInterface cacheIngrediente;
	CacheInterface cachePlato;
	
	public ActualizadorCache() {
		//por ahora
		cacheIngrediente= new CacheIngrediente() ;
		cachePlato = new CachePlato();
				
	}
	
	public void add (Object arg0) {
		if((arg0 instanceof DataTransfer))
			cacheIngrediente.add(arg0);
	
		else {
			cachePlato.add(arg0);
		}
		
	}

}