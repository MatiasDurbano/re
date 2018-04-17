package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheMap {

	private  Map<Ingrediente,Cantidad> ingredientes;
	
	private  Map<Integer, Plato> platos;

	public CacheMap() {
	
		ingredientes = new HashMap<Ingrediente,Cantidad>();
		platos = new HashMap<Integer,Plato>();;
	
	}
	
	public Cantidad getCantidad(Ingrediente arg0) {
		
		return ingredientes.get(arg0);
		
	}
	
	public Plato getPlato(int key) {
		
		return platos.get(key);
		
	}
	
	public StockCantidad getStockCantidad(){
		
		//mmmmm
		StockCantidad ret = new StockCantidad();
		for (Map.Entry<Ingrediente, Cantidad> stockCantidad : ingredientes.entrySet()) {
			ret.addStock(stockCantidad.getKey(),stockCantidad.getValue());
			
		}
		
		return ret;
		
	}

	
	public ArrayList<Plato> getPlatos(){
		
		ArrayList<Plato> _platos = new ArrayList<Plato>();
		
		for (Plato plato : platos.values()) {
		    _platos.add(plato);	
		}
		
		return _platos;
		
	}
	 
	//REVISAR
	public void addStockCantidad(StockCantidad arg0) {
		ArrayList <Ingrediente> ingredientes = arg0.getIngredientes();;
		
		for(Ingrediente ingr: ingredientes) {
			this.ingredientes.put(ingr,arg0.getCantidad(ingr));	
		}	
	
	}

	
	public void addPlatos(List<Plato> arg) {
		platos.clear();
		
		for(Plato plato : arg) {
			platos.put(plato.hashCode(), plato);
		}
		
	}
}
