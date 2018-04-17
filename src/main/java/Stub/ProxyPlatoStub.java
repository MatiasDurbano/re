package Stub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Interface.ProxyPlatoInterface;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;

public class ProxyPlatoStub implements ProxyPlatoInterface
{
	List<Plato> lista;
	public ProxyPlatoStub ()
	{
		lista = new ArrayList<Plato>();
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
		this.lista = lista;
	}
	
	@Override
	public List<Plato> get() 
	{
		return lista;
	}
}
