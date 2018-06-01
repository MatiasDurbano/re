package Filter;
import java.util.ArrayList;
import java.util.List;

import Historial.MenuLogger;
import modelo.Menu;
import modelo.Plato;

public class FilterNoRepetidosSearcher 
{
	MenuLogger filterSource;
	
	public FilterNoRepetidosSearcher(MenuLogger filterSource)
	{
		this.filterSource = filterSource;
	}
	
	public ArrayList<Plato> updateList()
	{
		ArrayList<Plato> aux = new ArrayList<Plato>();
		for (Menu menu : filterSource.obtenerMenus()) 
		{
			analizarMenu(aux,menu);
		}
		return aux;
	}

	private void analizarMenu(ArrayList<Plato> aux, Menu menu) 
	{
		for(Plato plato : menu.getPlatos())
		{
			if(!aux.contains(plato))
				aux.add(plato);
		}
	}
}
