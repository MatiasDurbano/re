package Cache2;

import java.util.ArrayList;
import java.util.List;

import modelo.Ingrediente;

public class PoliticaCacheIngrediente {
	
	boolean primeraVuelta;
	int cantidadMaximia;
	int puntero;
	List<Ingrediente> ingredientes;
	List<Boolean> vidas;
	
	public PoliticaCacheIngrediente(int cantidadMaxima) {
		this.cantidadMaximia = cantidadMaxima;
		this.puntero = 0;
		this.ingredientes = new ArrayList<Ingrediente>();
		this.vidas = new ArrayList<Boolean>();
	}
	
	public void actualizar(Ingrediente ingrediente) {
		int posicion = this.ingredientes.indexOf(ingrediente);
		this.vidas.set(posicion, Boolean.TRUE);
	}
	
	public Ingrediente analizar(Ingrediente ingrediente) {
		
		Ingrediente ret = null;
		
		if(primeraVuelta) {
			this.ingredientes.add(ingrediente);
			this.vidas.add(Boolean.TRUE);
			if(this.ingredientes.size() == this.cantidadMaximia) {
				this.primeraVuelta = false;
			}
		}
		else {
			
			boolean recorrer = true;
			
			while(recorrer) {	
				if(this.vidas.get(puntero)) {
					this.vidas.set(puntero, Boolean.FALSE);
					this.puntero ++;
				}
				else {
					ret = this.ingredientes.get(puntero);
					this.ingredientes.set(puntero, ingrediente);
					this.vidas.set(puntero, Boolean.TRUE);
					this.puntero ++;
					recorrer = false;
				}
			
				if(this.puntero == this.cantidadMaximia){
					this.puntero = 0;
				}
			}
		}
		
		return ret;
	}
}
