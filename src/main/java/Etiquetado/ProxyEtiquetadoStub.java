package Etiquetado;

import java.util.HashMap;
import java.util.Map;

import modelo.Etiqueta;
import modelo.Ingrediente;

public class ProxyEtiquetadoStub implements ProxyEtiquetado {
	
	Map<Ingrediente, Etiqueta> listado;
	
	public ProxyEtiquetadoStub() {
		this.listado = new HashMap<Ingrediente, Etiqueta>();
		this.listado.put(new Ingrediente("fideos"), new Etiqueta("celiaco"));
	}

	@Override
	public Etiqueta getEtiqueta(Object x) {
		return this.listado.get(x);
	}
}
