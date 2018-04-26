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
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProxyPlatoStub other = (ProxyPlatoStub) obj;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		return true;
	}

	@Override
	public Receta get(Object arg0) {
		Receta ret = null;
		
		for(Plato a : lista) {
			if(arg0.equals(a)) return a.getReceta();
		}
		
		return ret;
		
	}

	@Override
	public List<Plato> load() {
		return lista;
	}
	
}
