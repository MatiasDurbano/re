import org.junit.Assert;
import org.junit.Test;

import Etiquetado.ProxyEtiquetadoInterface;
import Etiquetado.ProxyEtiquetadoStub;
import modelo.Etiqueta;
import modelo.Ingrediente;

public class ProxyEtiquetaStubTest {
	
	@Test
	public void getEtiqueta() {
		ProxyEtiquetadoInterface proxyEtiquetado = new ProxyEtiquetadoStub();
		Assert.assertEquals(new Etiqueta("celiaco"), proxyEtiquetado.getEtiqueta(new Ingrediente("fideos")));
	}
}
