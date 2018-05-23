package Etiquetado;

import java.util.HashMap;
import java.util.Map;

import modelo.Etiqueta;
import modelo.Ingrediente;

public class ProxyEtiquetadoStub implements ProxyEtiquetadoInterface {
	
	Map<Ingrediente, Etiqueta> listado;
	
	public ProxyEtiquetadoStub() {
		this.listado = new HashMap<Ingrediente, Etiqueta>();
	}

	@Override
	public Etiqueta getEtiqueta(Object x) {
		return this.listado.get(x);
	}
}
