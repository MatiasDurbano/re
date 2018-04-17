package modelo;

import Stub.ProxyCacheStub;

public class Main 
{
	public static void main(String[] args) 
	{
		ProxyCacheStub cache = new ProxyCacheStub();
		System.out.println(cache.getPlatos().toString());
		System.out.println(cache.getCantidad().toString());
		
	}
}
