package Filter;
import java.util.ArrayList;
import java.util.List;

import modelo.AnalizadorPlatos;
import modelo.Ingrediente;
import modelo.Plato;

public class FilterCeliacos implements GenericFilter
{
	List<Ingrediente> noPermitidos;
	FilterCeliacosSearcher searcher;
	
	public FilterCeliacos(FilterCeliacosSearcher searcher)
	{
		this.noPermitidos = new ArrayList<Ingrediente>();
		this.searcher = searcher;
	}
	
	@Override
	public boolean isFiltered(Plato p) 
	{
		if(p.equals(null))
		{
			throw new NullPointerException("FilterCeliacos/isFiltered = No se pueden filtra el plato porque es null");
		}
		ArrayList<Ingrediente> listIngredientes = AnalizadorPlatos.dameIngredientes(p);
		for (Ingrediente ingrediente : listIngredientes)
		{
			if(poseeIngredienteNoPermitido(ingrediente))
				return true;
		}
		return false;
	}

	private boolean poseeIngredienteNoPermitido(Ingrediente ingrediente) 
	{
		for (Ingrediente noPermitido : noPermitidos)
		{
			if (ingrediente.equals(noPermitido))
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
