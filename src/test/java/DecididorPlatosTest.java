import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import Stub.ProxyCacheStub;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;
import modelo.AnalizadorPlatos;
import modelo.Cantidad;
import modelo.DataColector;
import modelo.DecididorPlatos;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;

public class DecididorPlatosTest {

	@Test
	public void cantidadIngredientes() {
		ProxyIngredienteStub proxyIngrediente = new ProxyIngredienteStub();
		ProxyPlatoStub proxyPlato = new ProxyPlatoStub();
		ProxyCacheStub proxyCache = new ProxyCacheStub(proxyIngrediente,proxyPlato);
		
		DataColector data= new DataColector(proxyCache);
		
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente pera = new Ingrediente("pera");
		Ingrediente cebolla = new Ingrediente("cebolla");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad seis = new Cantidad(Medicion.Kg, 6);
		Cantidad cuatro = new Cantidad(Medicion.Kg, 4);
		Map<Ingrediente, Cantidad> ingredientes = new HashMap<Ingrediente, Cantidad>();
		ingredientes.put(tomate, cinco);
		ingredientes.put(pera, seis);
		ingredientes.put(cebolla, cuatro);
		Receta receta = new Receta(ingredientes);
		String nombre = "Fideos con tuco";
		Plato plato = new Plato(nombre, receta);
		
		Map<Ingrediente, Cantidad> ret = DecididorPlatos.cantidadIngredientes(plato, data);
		
		Cantidad cincoycinco = new Cantidad(Medicion.Kg, 5.5);
		Cantidad dos = new Cantidad(Medicion.Kg, 2);
		Cantidad uno = new Cantidad(Medicion.Kg, 1);
		Map<Ingrediente, Cantidad> prueba = new HashMap<Ingrediente, Cantidad>();
		prueba.put(pera, cincoycinco);
		prueba.put(tomate, dos);
		prueba.put(cebolla, uno);
		
		Assert.assertEquals(prueba, ret);
	}
	
	@Test
	public void cantidadIngredientesMal() {
		ProxyIngredienteStub proxyIngrediente = new ProxyIngredienteStub();
		ProxyPlatoStub proxyPlato = new ProxyPlatoStub();
		ProxyCacheStub proxyCache = new ProxyCacheStub(proxyIngrediente,proxyPlato);
		
		DataColector data= new DataColector(proxyCache);
		
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente pera = new Ingrediente("pera");
		Ingrediente cebolla = new Ingrediente("cebolla");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad seis = new Cantidad(Medicion.Kg, 6);
		Cantidad cuatro = new Cantidad(Medicion.Kg, 4);
		Map<Ingrediente, Cantidad> ingredientes = new HashMap<Ingrediente, Cantidad>();
		ingredientes.put(tomate, cinco);
		ingredientes.put(pera, seis);
		ingredientes.put(cebolla, cuatro);
		Receta receta = new Receta(ingredientes);
		String nombre = "Fideos con tuco";
		Plato plato = new Plato(nombre, receta);
		
		Map<Ingrediente, Cantidad> ret = DecididorPlatos.cantidadIngredientes(plato, data);
		
		Cantidad cincoycinco = new Cantidad(Medicion.Kg, 5.5);
		Cantidad dos = new Cantidad(Medicion.Kg, 2);
		Cantidad uno = new Cantidad(Medicion.Kg, 1);
		Map<Ingrediente, Cantidad> prueba = new HashMap<Ingrediente, Cantidad>();
		prueba.put(pera, cincoycinco);
		prueba.put(tomate, seis);
		prueba.put(cebolla, uno);
		
		
		Assert.assertNotEquals(prueba, ret);
	}
	
	@Test
	public void armarBien() {
		ProxyIngredienteStub proxyIngrediente = new ProxyIngredienteStub();
		ProxyPlatoStub proxyPlato = new ProxyPlatoStub();
		ProxyCacheStub proxyCache = new ProxyCacheStub(proxyIngrediente,proxyPlato);
		
		DataColector dataColector= new DataColector(proxyCache);
		
		Map<Ingrediente, Cantidad> ingredientes = new HashMap<Ingrediente, Cantidad>();
		ingredientes.put(new Ingrediente("milanesa"), new Cantidad(Medicion.Kg, 1));
		ingredientes.put(new Ingrediente("zapallo"), new Cantidad(Medicion.Kg, 2));
		Receta receta = new Receta(ingredientes);
		
		Plato plato = new Plato("Milanesa con Zapallo", receta);
		
		int cantidad = DecididorPlatos.esPosibleArmar(plato, dataColector);
		
		Assert.assertEquals(5, cantidad);
	}
	
	@Test
	public void armarMal() {
		ProxyIngredienteStub proxyIngrediente = new ProxyIngredienteStub();
		ProxyPlatoStub proxyPlato = new ProxyPlatoStub();
		ProxyCacheStub proxyCache = new ProxyCacheStub(proxyIngrediente,proxyPlato);
		
		DataColector dataColector= new DataColector(proxyCache);
		
		Map<Ingrediente, Cantidad> ingredientes = new HashMap<Ingrediente, Cantidad>();
		ingredientes.put(new Ingrediente("milanesa"), new Cantidad(Medicion.Kg, 1));
		ingredientes.put(new Ingrediente("zapallo"), new Cantidad(Medicion.Kg, 2));
		Receta receta = new Receta(ingredientes);
		
		Plato plato = new Plato("Milanesa con Zapallo", receta);
		
		int cantidad = DecididorPlatos.esPosibleArmar(plato, dataColector);
		
		Assert.assertFalse(10==cantidad);
	}
}
