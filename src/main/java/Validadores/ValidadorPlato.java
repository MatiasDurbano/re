package Validadores;

import modelo.Plato;

public class ValidadorPlato {
	
	public static boolean isRight(Plato plato) {
		if( plato.getNombre().equals("")|| plato.getReceta().getReceta().isEmpty())
			return false;
		
		return true;
	}

}
