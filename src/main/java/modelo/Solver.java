package modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solver {
	private Puntuador puntuador;
	private Map<Plato,Integer> platosYcantidad;
	
	public Solver() {
		this.puntuador = new Puntuador();	
		this.platosYcantidad = new HashMap<Plato,Integer>();
	}
	public Map<Plato,Integer> getPlatosYcantidad(){
		return this.platosYcantidad;
	}
	public void puntuarPlatos(List<Plato> platos, StockCantidad stock) {
		for(Plato p : platos) {
			Integer i=puntuador.puntuarPlato(p, stock);
			this.platosYcantidad.put(p, i);
		}
	}
	
}
