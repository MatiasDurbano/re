package Filter;
import java.util.List;

import modelo.Ingrediente;
public class FilterCeliacosSearcher 
{
	FilterCeliacosStub filterSource;
	
	public FilterCeliacosSearcher(FilterCeliacosStub filterSource)
	{
		this.filterSource = filterSource;
	}
	
	public List<Ingrediente> updateList()
	{
		return filterSource.getFilterData();
	}
}
