
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import baterias_test.BFilter;

public class Historia4 
{
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	//1 - Llamo al método isFiltered(<Fideos con Tuco>) de FilterNoRepetidos y me devuelve False.
	@Test
	public void filterAplicatorVacio() 
	{
		Assert.assertFalse(BFilter.FilterNoRepetidosVacio().isFiltered(BFilter.fideosConTuco()));
	}
	
	//2-  Llamo al método isFiltered(<Fideos con Tuco>) de FilterNoRepetidos y me devuelve True.
	@Test
	public void filterAplicatorFiltrando() 
	{
		Assert.assertTrue(BFilter.FilterNoRepetidos().isFiltered(BFilter.fideosConTuco()));
	}
	
	//3-  Llamo al método isFiltered(<Pollo con papas>) de FilterNoRepetidosNoFiltrador y me devuelve False.
	@Test
	public void filterAplicatorNoFiltrando() 
	{
		Assert.assertFalse(BFilter.FilterNoRepetidos().isFiltered(BFilter.polloConPapas()));
	}
	
	//4-  Llamo al método isFiltered(Null) de FilterNoRepetidosFiltrador, se genera una excepción “NullPointerException”.
	//@Test
	//public void filterNull() throws NullPointerException
	//{
	//	thrown.expect(NullPointerException.class);
	//	BFilter.FilterNoRepetidos().isFiltered(null);
	//}
}
