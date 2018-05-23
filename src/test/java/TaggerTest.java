import org.junit.Assert;
import org.junit.Test;

import Etiquetado.Tagger;
import modelo.Etiqueta;
import modelo.Ingrediente;

public class TaggerTest {
	
	@Test
	public void etiquetar() {
		Ingrediente pan = new Ingrediente("pan");
		Ingrediente fideos = new Ingrediente("fideos");
		Etiqueta celiaco = new Etiqueta("celiaco");
		
		Tagger tagger = new Tagger();
		tagger.etiquetar(pan, celiaco);
		
		Assert.assertEquals(celiaco, tagger.buscar(pan));
		Assert.assertEquals(null, tagger.buscar(fideos));
	}
}
