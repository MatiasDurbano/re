package modelo;

import Proxy.ProxyIngrediente;
import Stub.ProxyCacheStub;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;

public class Main 
{
	public static void main(String[] args) 
	{
		ProxyIngredienteStub proxyIngrediente = new ProxyIngredienteStub();
		ProxyPlatoStub proxyPlato = new ProxyPlatoStub();
		ProxyCacheStub cache = new ProxyCacheStub(proxyIngrediente, proxyPlato);
		
		System.out.println(cache.getPlatos().toString());
		System.out.println(cache.getCantidad().toString());
		
	}
}
