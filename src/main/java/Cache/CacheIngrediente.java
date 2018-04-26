package Cache;

import java.util.HashMap;
import java.util.Map;

import Interface.CacheInterface;
import modelo.Cantidad;
import modelo.DataTransfer;
import modelo.Ingrediente;
import modelo.StockCantidad;

public class CacheIngrediente implements CacheInterface{
	
	private  Map<Ingrediente,Cantidad> ingredientes;
	
	public CacheIngrediente () {
		ingredientes = new HashMap<Ingrediente,Cantidad>();
	}
	

	@Override
	public void add(Object arg0) {
		DataTransfer a= (DataTransfer) arg0;
		ingredientes.put(a.getIng(),a.getCant());
		
		
	}

	@Override
	public Object get(Object arg0) {
		Ingrediente a = (Ingrediente) arg0; 
		return ingredientes.get(a);
	}
	
}
