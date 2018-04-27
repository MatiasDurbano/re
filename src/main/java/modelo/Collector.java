package modelo;

import java.util.List;
import Cache2.APICacheIngredientes;
import Interface.DataColectorInterface;

public class Collector implements DataColectorInterface
{
	ApiDB apiDB;
	APICacheIngredientes apiCache;
	
	public Collector(ApiDB apiDB, APICacheIngredientes apiCache) 
	{
		this.apiDB = apiDB;
		this.apiCache =  apiCache;
	}

	@Override
	public Cantidad getCantidad(Ingrediente arg0) 
	{
		return this.apiCache.get(arg0);
	}

	@Override
	public List<Plato> getPlato() 
	{
		return this.apiDB.get();
	}
}
