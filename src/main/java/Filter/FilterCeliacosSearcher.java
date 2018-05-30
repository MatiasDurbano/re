package Filter;
import java.util.List;

import modelo.Ingrediente;
public class FilterCeliacosSearcher 
{
	FilterCeliacosStub filterSource;
	
	public FilterCeliacosSearcher()
	{
		filterSource = new FilterCeliacosStub();
	}
	
	public List<Ingrediente> updateList()
	{
		return filterSource.getFilterData();
	}
}
