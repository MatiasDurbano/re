package modelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Puntuador.ManagerPuntuadores;
import Puntuador.PuntuadorPorCantidad;

public class Solver {
	private ManagerPuntuadores managerPuntuadores;
	private Map<Plato, Double> platosYcantidad;
	
	public Solver() {
		this.managerPuntuadores = new ManagerPuntuadores();	
		this.platosYcantidad = new HashMap<Plato,Double>();
	}
	public Map<Plato, Double> getPlatosYcantidad(){
		return this.platosYcantidad;
	}
	public void puntuarPlatos(List<Plato> platos, StockCantidad stock) {
		for(Plato p : platos) 
		{
			double i = managerPuntuadores.puntuarPlato(p, stock);
			this.platosYcantidad.put(p, i);
		}
	}
}
