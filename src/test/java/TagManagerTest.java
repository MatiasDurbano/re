import org.junit.Assert;
import org.junit.Test;

import Etiquetado.ProxyEtiquetado;
import Etiquetado.ProxyEtiquetadoStub;
import Etiquetado.TagManager;
import modelo.Etiqueta;
import modelo.Ingrediente;

public class TagManagerTest {
	
	@Test
	public void buscar() {
		ProxyEtiquetado proxyEtiquetado = new ProxyEtiquetadoStub();
		TagManager tagManager = new TagManager(proxyEtiquetado);
		Assert.assertEquals(new Etiqueta("celiaco"), tagManager.buscar(new Ingrediente("fideos")));
	}
}
