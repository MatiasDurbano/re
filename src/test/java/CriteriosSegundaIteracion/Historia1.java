package CriteriosSegundaIteracion;


import org.junit.Assert;
import org.junit.Test;

import Etiquetado.ProxyEtiquetado;
import Etiquetado.ProxyEtiquetadoStub;
import Etiquetado.TagManager;
import Etiquetado.Tagger;
import bateriastest.BateriaTagManagger;
import modelo.Etiqueta;
import modelo.Ingrediente;

public class Historia1 {
	
	@Test
	public void test1() {
		Tagger tagger = BateriaTagManagger.escenario1();
		tagger.etiquetar(new Ingrediente("pan"), new Etiqueta("celiaco"));
		Assert.assertEquals(BateriaTagManagger.taggerExpectativa1(), tagger);
	}
	
	@Test
	public void test2() {
		Tagger tagger = BateriaTagManagger.escenario2();
		Assert.assertEquals(new Etiqueta("celiaco"), tagger.buscar(new Ingrediente("pan")));
	}
	
	@Test
	public void test3() {
		Tagger tagger = BateriaTagManagger.escenario2();
		Assert.assertEquals(null, tagger.buscar(new Ingrediente("fideos")));
	}
	
	@Test
	public void test4() {
		ProxyEtiquetado proxyEtiquetado = new ProxyEtiquetadoStub();
		Assert.assertEquals(new Etiqueta("celiaco"), proxyEtiquetado.getEtiqueta(new Ingrediente("fideos")));
	}
	
	@Test
	public void test5() {
		TagManager tagManager = new TagManager(BateriaTagManagger.escenario2(), BateriaTagManagger.escenario3());
		Assert.assertEquals(new Etiqueta("celiaco"), tagManager.buscar(new Ingrediente("fideos")));
		Assert.assertEquals(new Etiqueta("celiaco"), tagManager.buscar(new Ingrediente("pan")));
	}
}
