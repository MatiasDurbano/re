package Proxy;
import java.util.ArrayList;
import java.util.List;

import Interface.ProxyIngredienteInterface;
import modelo.Ingrediente;


public class ProxyIngredienteStub implements ProxyIngredienteInterface
{
	List<Ingrediente> ingredientes;
	
	public ProxyIngredienteStub()
	{

		Ingrediente a= new Ingrediente ("papa");
		Ingrediente b= new Ingrediente ("papa");
		Ingrediente c= new Ingrediente ("papa");
		Ingrediente d= new Ingrediente ("papa");
		
		ingredientes=new ArrayList<Ingrediente>();
		ingredientes.add(a);
		ingredientes.add(b);
		ingredientes.add(c);
		ingredientes.add(d);
		
	}


	@Override
	public List<Ingrediente> get() {
		return ingredientes;
	}

	

}
