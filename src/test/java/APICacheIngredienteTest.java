import org.junit.Assert;
import org.junit.Test;

import Cache2.APICacheIngredientes;
import Cache2.Cache;
import Stub.ProxyIngredienteStub;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;

public class APICacheIngredienteTest {
	
	@Test
	public void get() {
		
		Cache<Ingrediente, Cantidad> cache = new Cache<Ingrediente,Cantidad>();
		ProxyIngredienteStub stub = new ProxyIngredienteStub();
		APICacheIngredientes apiCache = new APICacheIngredientes(cache, stub, 10);
		
		Cantidad resultado = new Cantidad(Medicion.Kg, 2);
		
		Assert.assertEquals(resultado, apiCache.get(new Ingrediente ("papa")));
		Assert.assertEquals(resultado, apiCache.get(new Ingrediente ("papa")));
	}
	
	@Test
	public void put() {
		Cache<Ingrediente, Cantidad> cacheEsperada = new Cache<Ingrediente,Cantidad>();
		cacheEsperada.add(new Ingrediente("pera"), new Cantidad(Medicion.Kg, 3));
		cacheEsperada.add(new Ingrediente("manzana"), new Cantidad(Medicion.Kg, 4));
		cacheEsperada.add(new Ingrediente("zanahoria"), new Cantidad(Medicion.Kg, 5));
		
		Cache<Ingrediente, Cantidad> cachePrueba = new Cache<Ingrediente,Cantidad>();
		cachePrueba.add(new Ingrediente("pera"), new Cantidad(Medicion.Kg, 3));
		cachePrueba.add(new Ingrediente("manzana"), new Cantidad(Medicion.Kg, 4));
		
		ProxyIngredienteStub stub = new ProxyIngredienteStub();
		APICacheIngredientes apiCache = new APICacheIngredientes(cachePrueba, stub, 10);
		apiCache.put(new Ingrediente("zanahoria"), new Cantidad(Medicion.Kg, 5));
		
		Assert.assertEquals(cacheEsperada, cachePrueba);
	}
	
	@Test
	public void remove() {
		Cache<Ingrediente, Cantidad> cacheEsperada = new Cache<Ingrediente,Cantidad>();
		cacheEsperada.add(new Ingrediente("pera"), new Cantidad(Medicion.Kg, 3));
		cacheEsperada.add(new Ingrediente("manzana"), new Cantidad(Medicion.Kg, 4));
		
		Cache<Ingrediente, Cantidad> cachePrueba = new Cache<Ingrediente,Cantidad>();
		cachePrueba.add(new Ingrediente("pera"), new Cantidad(Medicion.Kg, 3));
		cachePrueba.add(new Ingrediente("manzana"), new Cantidad(Medicion.Kg, 4));
		cachePrueba.add(new Ingrediente("zanahoria"), new Cantidad(Medicion.Kg, 5));
		
		ProxyIngredienteStub stub = new ProxyIngredienteStub();
		APICacheIngredientes apiCache = new APICacheIngredientes(cachePrueba, stub, 10);
		apiCache.remove(new Ingrediente("zanahoria"));
		
		Assert.assertEquals(cacheEsperada, cachePrueba);
	}
}
