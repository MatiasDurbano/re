package Proxy;

import Interface.ProxyIngredienteInterface;
import modelo.Cantidad;

public  class ProxyIngrediente implements ProxyIngredienteInterface
{
	ProxyIngredienteInterface proxy;
	
	public ProxyIngrediente(ProxyIngredienteInterface proxy) 
	{
		this.proxy = proxy;
	}
	

	@Override
	public Cantidad get(Object arg0) {
		return proxy.get(arg0);
	}
}
