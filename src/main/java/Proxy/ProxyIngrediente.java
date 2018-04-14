package Proxy;

import java.util.ArrayList;
import java.util.List;

import Interface.ProxyIngredienteInterface;
import modelo.Ingrediente;

public  class ProxyIngrediente implements ProxyIngredienteInterface{

	ProxyIngredienteStub proxyStub;
	
	
	public ProxyIngrediente() {
		proxyStub = new ProxyIngredienteStub();
	}
	
	@Override
	public List<Ingrediente> get() {
		return proxyStub.get();
	}


}
