package Etiquetado;

import java.util.HashMap;
import java.util.Map;

import modelo.Etiqueta;
import modelo.Ingrediente;

public class Tagger {
	
	Map<Ingrediente, Etiqueta> listado;
	
	public Tagger() {
		this.listado = new HashMap<Ingrediente, Etiqueta>();
	}
	
	public void etiquetar(Ingrediente ingrediente, Etiqueta etiqueta) {
		this.listado.put(ingrediente, etiqueta);
	}
	
	public Etiqueta buscar(Ingrediente ingrediente) {
		return this.listado.get(ingrediente);
	}
}
