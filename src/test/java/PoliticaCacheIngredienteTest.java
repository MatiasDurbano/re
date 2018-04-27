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
		Assert.assertEquals(3, politica.getCantidadMaximia());
		Ingrediente aEliminar = politica.analizar(pera);
		Assert.assertTrue(politica.isPrimeraVuelta());
		ingredientesEsperados.add(pera);
		Assert.assertEquals(ingredientesEsperados, politica.getIngredientes());
		vidasEsperadas.add(Boolean.TRUE);
		Assert.assertEquals(vidasEsperadas, politica.getVidas());
		Assert.assertEquals(null, aEliminar);
		
		politica.analizar(banana);
		Assert.assertTrue(politica.isPrimeraVuelta());
		ingredientesEsperados.add(banana);
		Assert.assertEquals(ingredientesEsperados, politica.getIngredientes());
		vidasEsperadas.add(Boolean.TRUE);
		Assert.assertEquals(vidasEsperadas, politica.getVidas());
		Assert.assertEquals(null, aEliminar);
		
		politica.analizar(manzana);
		Assert.assertFalse(politica.isPrimeraVuelta());
		ingredientesEsperados.add(manzana);
		Assert.assertEquals(ingredientesEsperados, politica.getIngredientes());
		vidasEsperadas.add(Boolean.TRUE);
		Assert.assertEquals(vidasEsperadas, politica.getVidas());
		Assert.assertEquals(null, aEliminar);
	}
	
	@Test
	public void siguientesVueltas() {
		List<Ingrediente> ingredientesEsperados = new ArrayList<Ingrediente>();
		List<Boolean> vidasEsperadas = new ArrayList<Boolean>();
		
		Ingrediente pera = new Ingrediente("pera");
		Ingrediente banana = new Ingrediente("banana");
		Ingrediente manzana = new Ingrediente("manzana");
		
		PoliticaCacheIngrediente politica = new PoliticaCacheIngrediente(3);
		politica.analizar(pera);
		politica.analizar(banana);
		politica.analizar(manzana);
		
		Ingrediente uva = new Ingrediente("uva");
		politica.analizar(uva);
		
		ingredientesEsperados.add(uva);
		ingredientesEsperados.add(banana);
		ingredientesEsperados.add(manzana);
		
		vidasEsperadas.add(Boolean.TRUE);
		vidasEsperadas.add(Boolean.FALSE);
		vidasEsperadas.add(Boolean.FALSE);
		
		Assert.assertEquals(ingredientesEsperados, politica.getIngredientes());
		Assert.assertEquals(vidasEsperadas, politica.getVidas());
		Assert.assertEquals(1, politica.getPuntero());
		
		politica.actualizar(banana);
		
		vidasEsperadas.clear();
		vidasEsperadas.add(Boolean.TRUE);
		vidasEsperadas.add(Boolean.TRUE);
		vidasEsperadas.add(Boolean.FALSE);
		
		Assert.assertEquals(vidasEsperadas, politica.getVidas());
		
		Ingrediente mandarina = new Ingrediente("mandarina");
		politica.analizar(mandarina);
		
		ingredientesEsperados.clear();
		ingredientesEsperados.add(uva);
		ingredientesEsperados.add(banana);
		ingredientesEsperados.add(mandarina);
		
		Assert.assertEquals(ingredientesEsperados, politica.getIngredientes());
		
		vidasEsperadas.clear();
		vidasEsperadas.add(Boolean.TRUE);
		vidasEsperadas.add(Boolean.FALSE);
		vidasEsperadas.add(Boolean.TRUE);
		
		Assert.assertEquals(vidasEsperadas, politica.getVidas());
	}
}
