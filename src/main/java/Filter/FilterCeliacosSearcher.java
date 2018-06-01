package Filter;
import java.util.List;

import modelo.Ingrediente;
public class FilterCeliacosSearcher 
{
	FilterGateway filterSource;
	
	public FilterCeliacosSearcher(FilterGateway filterSource)
	{
		this.filterSource = filterSource;
	}
	
	public List<Ingrediente> updateList()
	{
		return filterSource.getFilterData();
	}
}
