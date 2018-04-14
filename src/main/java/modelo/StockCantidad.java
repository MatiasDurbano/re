package modelo;

import java.util.HashMap;
import java.util.Map;

public class StockCantidad {
	
	Map<Ingrediente,Cantidad> stock;
	

	public StockCantidad() {
		
		stock = new HashMap<Ingrediente,Cantidad>();
		
	}
	
	public void addStock(Ingrediente arg0, Cantidad arg1) {
		stock.put(arg0, arg1);
	}
	
	public Cantidad getCantidad(Ingrediente arg0) {
		return stock.get(arg0);
	}
	
}
