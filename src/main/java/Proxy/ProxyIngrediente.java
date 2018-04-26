package Proxy;
import java.util.ArrayList;
import java.util.List;

import Interface.ProxyIngredienteInterface;
import Stub.ProxyIngredienteStub;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Plato;
import modelo.StockCantidad;

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
