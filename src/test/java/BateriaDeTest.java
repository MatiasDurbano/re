import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
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
}
