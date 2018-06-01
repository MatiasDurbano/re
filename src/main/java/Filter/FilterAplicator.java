package Filter;
import java.util.ArrayList;
import java.util.List;

import modelo.Plato;

public class FilterAplicator 
{
	List<GenericFilter> filters;
	
	public FilterAplicator()
	{
		filters = new ArrayList<GenericFilter>();
	}
	public void addFilter(GenericFilter filter)
	{
		filters.add(filter);
	}
	public List<Plato> listFiltering(List<Plato> list)
	{
		if(list.equals(null))
		{
			throw new NullPointerException("FilterAplicator/listFiltering = No se pueden filtrar porque la lista es null");
		}
		actualizarFilters();
		List<Plato> aux = new ArrayList<Plato>();
		for (Plato plato : list) 
		{
			if(!needFiltering (plato))
				aux.add(plato);
		}
		return aux;
	}
	private void actualizarFilters()
	{
		for (GenericFilter filter : filters) 
		{
			filter.updateFilterData();
		}
	}
	private boolean needFiltering(Plato plato) 
	{
		boolean acumulator = false;
		for (GenericFilter filter : filters) 
			acumulator = acumulator || filter.isFiltered(plato);
		return acumulator;
	}
}
