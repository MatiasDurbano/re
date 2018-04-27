package Proxy;

import java.util.List;

import Interface.ProxyPlatoInterface;
import modelo.Plato;
import modelo.Receta;

public class ProxyPlato implements ProxyPlatoInterface 
{
	ProxyPlatoInterface proxy;
	
	public ProxyPlato(ProxyPlatoInterface proxy)
	{
		this.proxy = proxy;
	}
	
	@Override
	public Receta get(Object arg0) 
	{
		return proxy.get(arg0);
	}
	
	@Override
	public List<Plato> getPlatos(){
		return proxy.getPlatos();
	}
}
