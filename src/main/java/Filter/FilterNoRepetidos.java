package Filter;
import java.util.ArrayList;
import java.util.List;

import modelo.Menu;
import modelo.Plato;

public class FilterNoRepetidos implements GenericFilter
{
	ArrayList<Plato> noPermitidos;
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
		for (Plato noPermitido : noPermitidos)
		{
			if (p.equals(noPermitido))
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