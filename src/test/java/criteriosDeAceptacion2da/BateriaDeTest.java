package criteriosDeAceptacion2da;





import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Historial.MenuRecord;
import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;
import Stub.ProxyPlatoStub;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Menu;
import modelo.Plato;
import modelo.Receta;

public class BateriaDeTest 
{
	public static List<Ingrediente> dameIngredientes()
	{
		Ingrediente a =new Ingrediente("papa");
		Ingrediente b =new Ingrediente("pera");
		Ingrediente c =new Ingrediente("manzana");
		Ingrediente d =new Ingrediente("fideo");
		Ingrediente e =new Ingrediente("carne picada");
		Ingrediente f =new Ingrediente("zanahoria");
		Ingrediente g =new Ingrediente("repollo");
		Ingrediente h =new Ingrediente("arroz");
		List<Ingrediente> ret= new ArrayList<Ingrediente>();
		ret.add(a);
		ret.add(b);
		ret.add(c);
		ret.add(d);
		ret.add(e);
		ret.add(f);
		ret.add(g);
		ret.add(h);
		return ret;
		
	}
	public static List<Plato> damePlatos()
	{
		//Plato fideos con tuco , Receta: tomate (10), fideos (8)
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente fideos = new Ingrediente("fideos");
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Map<Ingrediente, Cantidad> r = new HashMap<Ingrediente, Cantidad>();
		r.put(tomate, diez);
		r.put(fideos, ocho);
		Receta re = new Receta(r);
		String st = "Fideos con tuco";
		Plato a = new Plato(st,re);
		
		//List<Plato>lista = new ArrayList<Plato>();
		//Plato arroz con tuco , Receta: tomate (2), arroz (3)
		//Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente arroz = new Ingrediente("arroz");
		Cantidad dos = new Cantidad(Medicion.Kg, 2);
		Cantidad tres = new Cantidad(Medicion.Kg, 3);
		Map<Ingrediente, Cantidad> r2 = new HashMap<Ingrediente, Cantidad>();
		r2.put(tomate, dos);
		r2.put(arroz, tres);
		Receta re2 = new Receta(r2);
		String st2 = "arroz con tuco";
		Plato b = new Plato(st2,re2);
		
		Ingrediente repollo = new Ingrediente("repollo");
		Ingrediente zanahoria = new Ingrediente("zanahoria");
		Cantidad uno = new Cantidad(Medicion.Kg, 1);
		Cantidad cuatro = new Cantidad(Medicion.Kg,4);
		Map<Ingrediente, Cantidad> r3 = new HashMap<Ingrediente, Cantidad>();
		r3.put(repollo, uno);
		r3.put(zanahoria, cuatro);
		Receta re3 = new Receta(r3);
		String st3 = "ensalada";
		Plato c = new Plato(st3,re3);
		
		List<Plato> ret = new ArrayList<Plato>();
		
		ret.add(a);
		ret.add(b);
		ret.add(c);
		return ret;
	}
	public static List<Plato> dameProxyPlato()
	{
		ProxyPlatoInterface p = new ProxyPlatoStub();
		return p.getPlatos();
	}
	public static void dameProxyIngrediente()
	{
	
	}
	public static void dameProxyCache()
	{
		
	}
	public static void dameDataColector()
	{
		
	}
	
	public static Plato fideosConTuco() {
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente fideos = new Ingrediente("fideos");
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Map<Ingrediente, Cantidad> r = new HashMap<Ingrediente, Cantidad>();
		r.put(tomate, diez);
		r.put(fideos, ocho);
		Receta re = new Receta(r);
		String st = "Fideos con tuco";
		Plato a = new Plato(st,re);
		return a;
	}
	
	public static Plato arrozConTuco() {
		Ingrediente arroz = new Ingrediente("arroz");
		Ingrediente tomate = new Ingrediente("tomate");
		Cantidad dos = new Cantidad(Medicion.Kg, 2);
		Cantidad tres = new Cantidad(Medicion.Kg, 3);
		Map<Ingrediente, Cantidad> r2 = new HashMap<Ingrediente, Cantidad>();
		r2.put(tomate, dos);
		r2.put(arroz, tres);
		Receta re2 = new Receta(r2);
		String st2 = "arroz con tuco";
		Plato b = new Plato(st2,re2);
		return b;
	}
	
	public static Plato ensalada() {
		Ingrediente repollo = new Ingrediente("repollo");
		Ingrediente zanahoria = new Ingrediente("zanahoria");
		Cantidad uno = new Cantidad(Medicion.Kg, 1);
		Cantidad cuatro = new Cantidad(Medicion.Kg,4);
		Map<Ingrediente, Cantidad> r3 = new HashMap<Ingrediente, Cantidad>();
		r3.put(repollo, uno);
		r3.put(zanahoria, cuatro);
		Receta re3 = new Receta(r3);
		String st3 = "ensalada";
		Plato c = new Plato(st3,re3);
		return c;
	}
	
	public static Plato polloConPure() {
		Ingrediente pollo = new Ingrediente("pollo");
		Ingrediente papa = new Ingrediente("papa");
		Cantidad uno = new Cantidad(Medicion.Kg, 1);
		Cantidad tres = new Cantidad(Medicion.Kg,3);
		Map<Ingrediente, Cantidad> r3 = new HashMap<Ingrediente, Cantidad>();
		r3.put(pollo, uno);
		r3.put(papa, tres);
		Receta re3 = new Receta(r3);
		String st3 = "pollo con pure";
		Plato c = new Plato(st3,re3);
		return c;
	}
	
	public static Menu menuPrueba1() {
		Menu ret = new Menu();
		ret.agregarPlato(fideosConTuco());
		return ret;
	}
	
	public static Menu menuPrueba2() {
		Menu ret = new Menu();
		ret.agregarPlato(arrozConTuco());
		return ret;
	}
	
	public static Menu menuPrueba3() {
		Menu ret = new Menu();
		ret.agregarPlato(ensalada());
		return ret;
	}
	
	public static Menu menuPrueba4() {
		Menu ret = new Menu();
		ret.agregarPlato(polloConPure());
		return ret;
	}
	
	public static MenuRecord menuRecordExpectativa1() {
		MenuRecord ret = new MenuRecord(3);
		ret.agregar(BateriaDeTest.menuPrueba4());
		ret.agregar(BateriaDeTest.menuPrueba2());
		ret.agregar(BateriaDeTest.menuPrueba3());
		return ret;
	}
	
	public static MenuRecord menuRecordExpectativa2() {
		MenuRecord ret = new MenuRecord(3);
		ret.agregar(BateriaDeTest.menuPrueba1());
		return ret;
	}
}
