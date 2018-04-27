import org.junit.Assert;
import org.junit.Test;

import Cache2.APICacheIngredientes;
import Cache2.Cache;
import Stub.ProxyIngredienteStub;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;

public class APICacheTest {
	
	@Test
	public void encontrado() {
		
		Cache<Ingrediente, Cantidad> cache = new Cache<Ingrediente,Cantidad>();
		APICacheIngredientes apiCache = new APICacheIngredientes(cache, new ProxyIngredienteStub());
		
		System.out.println(apiCache.get(new Ingrediente("papa")));
		Cantidad resultado = new Cantidad(Medicion.Kg, 2);
		System.out.println(resultado.toString());
		
		Assert.assertEquals(resultado, apiCache.get(new Ingrediente("papa")));;
	}
}
