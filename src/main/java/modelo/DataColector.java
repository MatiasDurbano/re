package modelo;

import java.util.List;

import Cache2.Cache;
import Interface.DataColectorInterface;

public class DataColector implements DataColectorInterface 
{
	private  Cache cache;
	
	public DataColector() 
	{
		cache = new Cache();
	}
	

	@Override
	public Cantidad getCantidad(Ingrediente arg0) {
		return (Cantidad)cache.get(arg0);

	}

	@Override
	public List<Plato> getPlato() {
		// TODO Auto-generated method stub
		return null;
	}
}
