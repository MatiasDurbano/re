package filterTests;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import modelo.Ingrediente;
import Filter.FilterCeliacos;
import Filter.FilterCeliacosSearcher;
import Filter.FilterCeliacosStub;

public class FilterCeliacosSearcherTest 
{
	@Test
	public void updateListTest() 
	{
		ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();
		listaIngredientes.add(new Ingrediente("tomate"));
		
		FilterCeliacosStub stub = new FilterCeliacosStub(listaIngredientes);
		FilterCeliacosSearcher searcher = new FilterCeliacosSearcher(stub);
		
		assertEquals(listaIngredientes,searcher.updateList());
	}
		
}
