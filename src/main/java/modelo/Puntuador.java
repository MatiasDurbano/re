package modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Puntuador {
	
	public Integer puntuarPlato(Plato plato,StockCantidad stock) {		
		List<Integer> list = new ArrayList<Integer>();
		Receta r = plato.getReceta();		
		for (Map.Entry<Ingrediente, Cantidad> entry : r.getReceta().entrySet()) {
			double num = this.stockIngrediente(entry.getKey(), stock) / this.cantidadIngredienteReceta(entry.getKey(), plato);
			list.add((int)num);
		}		
		return list.indexOf(Collections.min(list));		
	}
	
	public double cantidadIngredienteReceta(Ingrediente i, Plato p) {
		return p.getReceta().getReceta().get(i).getValor();
	}	
	public double stockIngrediente(Ingrediente i,StockCantidad s) {		
		return s.getCantidad(i).getValor();
	}
}
