package Cache;

import Interface.CacheInterface;
import modelo.DataTransfer;
import modelo.Ingrediente;
import modelo.Plato;
import modelo.Seacher;

public class Cache {
	
	CacheInterface cacheIngrediente;
	CacheInterface cachePlato;
	ActualizadorCache actualizador;
	Seacher buscador;
	 
	public Cache() {
		//por ahora
		cacheIngrediente= new CacheIngrediente() ;
		cachePlato = new CachePlato();
		actualizador= new ActualizadorCache(cacheIngrediente,cachePlato);
		buscador = new Seacher();
		load();
	
	}
	
	private void load(){
		Object act = buscador.load();
		add(act);
		
	}

	//HORRIBLE
	public Object get(Object arg0) {
		Object ret = null ;
		
		if(arg0 instanceof Ingrediente) 
			 ret = cacheIngrediente.get(arg0);
		
		if(arg0 instanceof String) {
			System.out.println("ENTRE : "+ (String) arg0);
			ret = cachePlato.get(arg0);
		}
		
		if(ret==null)
			 ret = actualizar(arg0);
		
		return ret;
	} 
	
	public void add(Object arg0) {
		actualizador.add(arg0);
	}
	
	private Object actualizar(Object arg0) {

		Object ret;
		ret= buscador.get(arg0);
		add(new DataTransfer(arg0,ret));

		return ret;
	}

}
