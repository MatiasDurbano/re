package Analizador;

import modelo.Ingrediente;
import modelo.Plato;

public class Informant {
	Plato plato;
	Double puntaje;
	
	public  Informant(Plato arg0, Double arg1) {
		plato = arg0;
		puntaje = arg1;
	}
	
	public Plato getPlato() {
		return plato;
	}
	
	public Double getPuntaje() {
		return puntaje;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if( arg0==null) return false;
		if(!(arg0 instanceof Informant))return false;
		
		Informant obj = (Informant) arg0;
		return this.plato.equals(obj.getPlato());
		
	}

}
