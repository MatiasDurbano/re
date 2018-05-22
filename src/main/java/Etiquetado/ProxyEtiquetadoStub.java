package Etiquetado;

import java.util.Map;

import modelo.Etiqueta;
import modelo.Ingrediente;

public class ProxyEtiquetadoStub implements ProxyEtiquetadoInterface {
	
	Map<Ingrediente, Etiqueta> listado;
	
	public ProxyEtiquetadoStub() {
		
	}

	@Override
	public Etiqueta getEtiqueta(Object x) {
		return this.listado.get(x);
	}
}
