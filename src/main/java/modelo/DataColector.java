package modelo;


import java.util.ArrayList;
import java.util.List;

import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;
import Proxy.ProxyIngrediente;
import Proxy.ProxyPlato;

public class DataColector {
	
	private static ProxyIngredienteInterface proxyIngrediente ;
	private ProxyPlatoInterface proxyPlato;
	private static IdentyMap cache;
	
	
	public DataColector() {
		proxyIngrediente = new ProxyIngrediente();
		proxyPlato = new ProxyPlato();
		cache= new IdentyMap();
	}
	
	public static StockCantidad getStockIngredientes(){
		StockCantidad ret;
		
		ret = cache.getStockCantidad();
		if(ret.isEmpty()) {
			
			ret = proxyIngrediente.get();
			cache.addStockCantidad(ret);
		}
		
		return ret;
		
	}
	

	public Cantidad getCantidad(Ingrediente arg0) {
		
		return cache.getCantidad(arg0);

		
	}
	
	public List<Plato> getPlatos(){
		List <Plato> ret;
		ret= cache.getPlatos();
		
		if(ret.isEmpty()) {
			
			ret = proxyPlato.get();
			cache.addPlatos(ret);
		}
		
		return ret;
		
	}
	
}
