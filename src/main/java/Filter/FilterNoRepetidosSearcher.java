package Filter;
import java.util.List;
import modelo.Plato;

public class FilterNoRepetidosSearcher 
{
	FilterNoRepetidosStub filterSource;
	
	public FilterNoRepetidosSearcher()
	{
		filterSource = new FilterNoRepetidosStub();
	}
	
	public List<Plato> updateList()
	{
		return filterSource.getFilterData();
	}
}
