import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import Cache2.PoliticaCacheIngrediente;
import modelo.Ingrediente;

public class PoliticaCacheIngredienteTest {
	
	@Test
	public void primeraVuelta() {
		
		// Se testea que se analize la primera vuelta
		List<Ingrediente> ingredientesEsperados = new ArrayList<Ingrediente>();
		List<Boolean> vidasEsperadas = new ArrayList<Boolean>();
		
		Ingrediente pera = new Ingrediente("pera");
		Ingrediente banana = new Ingrediente("banana");
		Ingrediente manzana = new Ingrediente("manzana");
		
		PoliticaCacheIngrediente politica = new PoliticaCacheIngrediente(3);
		politica.analizar(pera);
		Assert.assertTrue(politica.isPrimeraVuelta());
		ingredientesEsperados.add(pera);
		Assert.assertEquals(ingredientesEsperados, politica.getIngredientes());
		vidasEsperadas.add(Boolean.TRUE);
		Assert.assertEquals(vidasEsperadas, politica.getVidas());
		
		politica.analizar(banana);
		Assert.assertTrue(politica.isPrimeraVuelta());
		ingredientesEsperados.add(banana);
		Assert.assertEquals(ingredientesEsperados, politica.getIngredientes());
		vidasEsperadas.add(Boolean.TRUE);
		Assert.assertEquals(vidasEsperadas, politica.getVidas());
		
		politica.analizar(manzana);
		Assert.assertFalse(politica.isPrimeraVuelta());
		ingredientesEsperados.add(manzana);
		Assert.assertEquals(ingredientesEsperados, politica.getIngredientes());
		vidasEsperadas.add(Boolean.TRUE);
		Assert.assertEquals(vidasEsperadas, politica.getVidas());
	}
}
