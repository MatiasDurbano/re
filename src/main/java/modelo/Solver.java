package modelo;

import java.util.HashMap;
import java.util.Map;

public class Solver {
	private Puntuador rank;
	private Map<Plato,Integer> platosYcantidad;
	
	public Solver() {
		Puntuador rank = new Puntuador();	
		this.platosYcantidad = new HashMap<Plato,Integer>();
	}
	
}
