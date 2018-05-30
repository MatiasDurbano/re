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
		for (int i = 0; i < list.size(); i++) 
		{
			Plato platoAUX = list.get(i);
			if(!needFiltering (platoAUX))
				aux.add(platoAUX);
		}
		return aux;
	}
	private void actualizarFilters()
	{
		for (int i = 0; i < filters.size(); i++) 
		{
			filters.get(i).updateFilterData();
		}
	}
	private boolean needFiltering(Plato plato) 
	{
		boolean acumulator = false;
		for (int i = 0; i < this.filters.size(); i++) 
			acumulator = acumulator || filters.get(i).isFiltered(plato);
		return acumulator;
	}
}
