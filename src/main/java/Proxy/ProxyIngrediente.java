package Proxy;
import java.util.ArrayList;
import java.util.List;

import Interface.ProxyIngredienteInterface;
import Stub.ProxyIngredienteStub;
import modelo.Ingrediente;
import modelo.Plato;
import modelo.StockCantidad;

public  class ProxyIngrediente implements ProxyIngredienteInterface
{
	ProxyIngrediente proxy;
	public ProxyIngrediente(ProxyIngrediente proxy) 
	{
		this.proxy = proxy;
	}
	
	@Override
	public StockCantidad get() 
	{
		return proxy.get();
	}
}
