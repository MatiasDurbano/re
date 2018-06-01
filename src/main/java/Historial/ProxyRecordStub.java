package Historial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Menu;
import modelo.Plato;
import modelo.Receta;

public class ProxyRecordStub implements ProxyRecordInterface {
	
	List<Menu> menues;
	
	public ProxyRecordStub() {
		this.menues = new ArrayList<Menu>();

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
		
		Menu menuPrueba1 = new Menu();
		menuPrueba1.agregarPlato(a);
		

		Ingrediente arroz = new Ingrediente("arroz");
		Cantidad dos = new Cantidad(Medicion.Kg, 2);
		Cantidad tres = new Cantidad(Medicion.Kg, 3);
		Map<Ingrediente, Cantidad> r2 = new HashMap<Ingrediente, Cantidad>();
		r2.put(tomate, dos);
		r2.put(arroz, tres);
		Receta re2 = new Receta(r2);
		String st2 = "arroz con tuco";
		Plato b = new Plato(st2,re2);
		
		Menu menuPrueba2 = new Menu();
		menuPrueba1.agregarPlato(b);
		

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
		
		Menu menuPrueba3 = new Menu();
		menuPrueba1.agregarPlato(c);
		
		this.menues.add(menuPrueba1);
		this.menues.add(menuPrueba2);
		this.menues.add(menuPrueba3);
	}

	@Override
	public List<Menu> getMenues() {
		return this.menues;
	}

	@Override
	public void writeMenues(List<Menu> x) {
		this.menues = x;
	}
}
