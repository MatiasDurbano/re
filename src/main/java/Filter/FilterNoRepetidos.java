package Filter;
import java.util.ArrayList;
import java.util.List;
import modelo.Plato;

public class FilterNoRepetidos implements GenericFilter
{
	List<Plato> noPermitidos;
	FilterNoRepetidosSearcher searcher;
	
	public FilterNoRepetidos(FilterNoRepetidosSearcher searcher)
	{
		this.noPermitidos = new ArrayList<Plato>();
		this.searcher = searcher;
	}
	
	@Override
	public boolean isFiltered(Plato p) 
	{
		if(p.equals(null))
		{
			throw new NullPointerException("FilterNoRepetidos/isFiltered = No se pueden filtra el plato porque es null");
		}
		if(platoNoPermitido(p))
			return true;
	return false;
	}

	private boolean platoNoPermitido(Plato p) 
	{
		for (int i = 0; i < noPermitidos.size(); i++)
		{
			Plato aux = noPermitidos.get(i);
			if (p.equals(aux))
				return true;
		}
		return false;
	}

	@Override
	public void updateFilterData() 
	{
		this.noPermitidos = searcher.updateList();
	}
}