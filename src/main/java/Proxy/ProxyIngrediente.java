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
	ProxyIngredienteStub proxyStub;
	public ProxyIngrediente() 
	{
		proxyStub = new ProxyIngredienteStub();
	}
	
	@Override
	public StockCantidad get() 
	{
		return proxyStub.get();
	}
}
