package Cache;

import Interface.ActualizadorCacheInterface;
import Interface.CacheInterface;
import modelo.DataTransfer;
import modelo.Ingrediente;


public class ActualizadorCache implements ActualizadorCacheInterface {
	
	CacheInterface cacheIngrediente;
	CacheInterface cachePlato;
	
	public ActualizadorCache(CacheInterface arg0, CacheInterface arg1) {
		//por ahora
		cacheIngrediente= arg0 ;
		cachePlato = arg1;
	
	}
	
	public void add (Object arg0) {
		if((arg0 instanceof DataTransfer))
			cacheIngrediente.add(arg0);
	
		else {
			cachePlato.add(arg0);
		} 
		
	}

}
