package modelo;

import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;
import Stub.ProxyIngredienteStub;

public class Seacher {

	
	ProxyIngredienteInterface proxyIngrediente;
	ProxyPlatoInterface proxyPlato;
	public Seacher() {
		proxyIngrediente =new ProxyIngredienteStub();
		
	}
	
	public Object get(Object arg0) {
		return proxyIngrediente.get(arg0);
	}
}
