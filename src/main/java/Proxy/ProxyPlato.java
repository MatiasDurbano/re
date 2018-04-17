package Proxy;

import java.util.List;

import Interface.ProxyPlatoInterface;
import modelo.Plato;

public class ProxyPlato implements ProxyPlatoInterface 
{
	ProxyPlatoInterface proxy;
	public ProxyPlato(ProxyPlatoInterface proxy)
	{
		this.proxy = proxy;
	}
	@Override
	public List<Plato> get() 
	{
		return proxy.get();
	}
}
