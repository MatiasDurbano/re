package modelo;

import java.util.List;

import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;
import Proxy.ProxyIngrediente;
import Proxy.ProxyPlato;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;

public class Seacher {

	ProxyIngredienteInterface proxyIngrediente;
	ProxyPlatoInterface proxyPlato;
	
	public Seacher() {
		proxyIngrediente =new ProxyIngrediente(new ProxyIngredienteStub());
		proxyPlato = new ProxyPlato(new ProxyPlatoStub());
		
	}
	
	public Object get(Object arg0) {
	
		if(arg0 instanceof Ingrediente)
			return proxyIngrediente.get(arg0);
		
		else { 
			return proxyPlato.get(arg0);
		}
		
	}
	
	public List<Plato> getPlatos(){
		return proxyPlato.getPlatos();
	}

}
