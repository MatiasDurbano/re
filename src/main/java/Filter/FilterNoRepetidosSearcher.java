package Filter;
import java.util.List;
import modelo.Plato;

public class FilterNoRepetidosSearcher 
{
	FilterNoRepetidosStub filterSource;
	
	public FilterNoRepetidosSearcher(FilterNoRepetidosStub filterSource)
	{
		this.filterSource = filterSource;
	}
	
	public List<Plato> updateList()
	{
		return filterSource.getFilterData();
	}
}
