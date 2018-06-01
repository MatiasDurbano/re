package criteriosDeAceptacion_2da;
import static org.junit.Assert.*;
import java.util.List;
import modelo.Plato;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import baterias_test.BFilter;

public class Historia3 
{
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	//1 - Llamo al método listFiltering(listaPlatos) usando el FilterAplicatorVacio, devolvera listaPlatos sin filtrado alguno.
	@Test
	public void filterAplicatorVacio() 
	{
		List<Plato> listaFiltrada = BFilter.filterAplicatorVacio().listFiltering(BFilter.ListaPlatos());
		Assert.assertEquals(BFilter.ListaPlatos() , listaFiltrada);
	}
	
	//2- Llamo al metodo listFiltering(listaPlatos) usando el FilterAplicatorCeliacos, me devuelve una lista con el plato <Pollo con papas>
	@Test
	public void Filtrando() 
	{
		List<Plato> listaFiltrada = BFilter.FilterAplicatorCeliacos("tomate").listFiltering(BFilter.ListaPlatos());
		Assert.assertFalse(listaFiltrada.contains(BFilter.fideosConTuco()));
		Assert.assertTrue(listaFiltrada.contains(BFilter.polloConPapas()));
	}
	//3- Llamo al metodo listFiltering(listaPlatos) usando el StubCeliacos2, me devuelve listaPlatos sin filtrado alguno.
	@Test
	public void filterNoFiltrando() 
	{
		List<Plato> listaFiltrada = BFilter.FilterAplicatorCeliacos("pescado").listFiltering(BFilter.ListaPlatos());
		Assert.assertEquals(BFilter.ListaPlatos() , listaFiltrada);
	}
	//4.1-  Llamo al método listFiltering(Null) de FilterAplicatorCeliacos , se genera una excepción “NullPointerException”.
	@Test
	public void nullPointerFilterAplicator() throws NullPointerException
	{
		thrown.expect(NullPointerException.class);
		BFilter.FilterAplicatorCeliacos("algo").listFiltering(null);
	}
	//4.2 Llamo al metodo isFiltered(Null) de FilterCeliacos, se genera una excepcion “NullPointerException”.
	@Test
	public void nullPointerFilterCeliacos() throws NullPointerException
	{
		thrown.expect(NullPointerException.class);
		BFilter.FilterCeliacos("algo").isFiltered(null);
	}
}