package Cache;

import java.util.HashMap;
import java.util.Map;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.StockCantidad;

public class CacheIngrediente implements CacheInterface{
	
	private  Map<Ingrediente,Cantidad> ingredientes;
	
	public CacheIngrediente () {
		ingredientes = new HashMap<Ingrediente,Cantidad>();
	}
	

	@Override
	public void add(Object arg0) {
		IngCant a= (IngCant) arg0;
		System.out.println(a.ing.getNombre()); 
		ingredientes.put(a.getIng(),a.getCant());
		
		
	}

	@Override
	public Object get(Object arg0) {
		Ingrediente a = (Ingrediente) arg0; 
		return ingredientes.get(a);
	}
	
}
