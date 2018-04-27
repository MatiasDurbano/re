import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import Interface.DataCollector;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;
import modelo.ApiDB;
import modelo.Cantidad;
import modelo.Collector;
import modelo.ControllerDB;
import modelo.DB;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;

public class platosDBTest {

	@Test
	public void platosCorrecto() {
		
		DB db= new DB();
		ApiDB api = new ApiDB(db);
		
		DataCollector data = new Collector(api);
		ControllerDB controller = new ControllerDB(api,new ProxyPlatoStub());
		
		List<Plato>lista = new ArrayList<Plato>();
		//Plato fideos con tuco , Receta: tomate (10), fideos (8)
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente fideos = new Ingrediente("fideos");
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Map<Ingrediente, Cantidad> am = new HashMap<Ingrediente, Cantidad>();
		am.put(tomate, diez);
		am.put(fideos, ocho);
		Receta ar = new Receta(am);
		String as = "Fideos con tuco";
		Plato a = new Plato(as, ar);
		
		//carne al horno con papas , Receta: carne (5), papas (4)
		Ingrediente carne = new Ingrediente("carne");
		Ingrediente papas = new Ingrediente("papas");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad cuatro = new Cantidad(Medicion.Unidad, 4);
		Map<Ingrediente, Cantidad> bm = new HashMap<Ingrediente, Cantidad>();
		bm.put(carne, cinco);
		bm.put(papas, cuatro);
		Receta br = new Receta(am);
		String bs = "Carne al horno con papas";
		Plato b = new Plato(bs, br);
		
		lista.add(a);
		lista.add(b);
		
		assertEquals(true,lista.equals(data.getPlatos()));
			
	}
	
	@Test
	public void platoIncorrecto() {
		
		DB db= new DB();
		ApiDB api = new ApiDB(db);
		
		DataCollector data = new Collector(api);
		ControllerDB controller = new ControllerDB(api,new ProxyPlatoStub());
		
		
		List<Plato>lista = new ArrayList<Plato>();
		//Plato fideos con tuco , Receta: tomate (10), fideos (8)
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente fideos = new Ingrediente("fideos");
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Map<Ingrediente, Cantidad> am = new HashMap<Ingrediente, Cantidad>();
		am.put(tomate, diez);
		am.put(fideos, ocho);
		Receta ar = new Receta(am);
		String as = "Fideos con tuco";
		Plato a = new Plato(as, ar);
		 
		//carne al horno con papas , Receta: carne (5), papas (4)
		Ingrediente carne = new Ingrediente("carne");
		Ingrediente papas = new Ingrediente("papas");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad cuatro = new Cantidad(Medicion.Unidad, 4);
		Map<Ingrediente, Cantidad> bm = new HashMap<Ingrediente, Cantidad>();
		bm.put(carne, cinco);
		bm.put(papas, cuatro);
		Receta br = new Receta(am);
		String bs = "Carne al horno con papas";
		Plato b = new Plato(bs, br);
		
		
		Ingrediente fideo = new Ingrediente("fideo");
		//tuco
		Cantidad uno = new Cantidad(Medicion.Kg, 1);
		Cantidad dos = new Cantidad(Medicion.Unidad, 2);
		Map<Ingrediente, Cantidad> bm2 = new HashMap<Ingrediente, Cantidad>();
		bm.put(fideo, uno);
		bm.put(tomate, dos);
		Receta re = new Receta(am);
		String st = "Carne al horno con papas";
		Plato c = new Plato(st, re);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		 
		
		assertEquals(false,lista.equals(data.getPlatos()));
			
	}

}
