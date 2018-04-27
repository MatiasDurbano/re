package modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solverfetcher {
		
	private List<Plato> platos;
	private StockCantidad stock;
	private Map<Ingrediente,Cantidad> stock2;
	private DataColector datacolector;
	
	public Solverfetcher(DataColector datacolector) {	
		this.datacolector = datacolector;
		this.stock = new StockCantidad();
	}
	
	public void obtenerPlatos() {
		platos = datacolector.getPlato();
	}
	
	public void obtenerIngrediente(Plato p) {
		Receta r = p.getReceta();
		for (Map.Entry<Ingrediente, Cantidad> entry : r.getReceta().entrySet()) 
		{
			Ingrediente i = entry.getKey();
			this.agregarStock(i);
		}
	}
	
	public void agregarStock(Ingrediente i) {
		if(!stock.contains(i)) {
			stock.addStock(i, datacolector.getCantidad(i));
		}		
	}
	
	public StockCantidad getStock(){
		return stock;		
	}
	
	public List<Plato> getPlatos(){
		return platos;
	}
}
