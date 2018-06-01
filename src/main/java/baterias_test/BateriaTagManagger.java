package baterias_test;

import Etiquetado.ProxyEtiquetado;
import Etiquetado.ProxyEtiquetadoStub;
import Etiquetado.Tagger;
import modelo.Etiqueta;
import modelo.Ingrediente;

public class BateriaTagManagger {
	
	public static Tagger escenario1() {
		Tagger ret = new Tagger();
		return ret;
	}
	
	public static Tagger escenario2() {
		Tagger ret = new Tagger();
		ret.etiquetar(new Ingrediente("pan"), new Etiqueta("celiaco"));
		return ret;
	}
	
	public static ProxyEtiquetado escenario3() {
		return new ProxyEtiquetadoStub();
	}
	
	public static Tagger taggerExpectativa1() {
		Tagger ret = new Tagger();
		ret.etiquetar(new Ingrediente("pan"), new Etiqueta("celiaco"));
		return ret;
	}
}
