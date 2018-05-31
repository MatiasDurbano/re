package baterias_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;
import Filter.FilterAplicator;
import Filter.FilterCeliacos;
import Filter.FilterCeliacosSearcher;
import Filter.FilterCeliacosStub;
import Filter.FilterNoRepetidos;
import Filter.FilterNoRepetidosSearcher;
import Filter.FilterNoRepetidosStub;

public class BFilter 
{
	public static FilterAplicator FilterCombinado()
	{
		FilterAplicator filterApli;
		ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();
		listaIngredientes.add(new Ingrediente("tomate"));
		ArrayList<Plato> listaPlatos = new ArrayList<Plato>();
		listaPlatos.add(fideosConTuco());
		
		FilterNoRepetidosStub stubNoRepetidos = new FilterNoRepetidosStub(listaPlatos);
		FilterNoRepetidosSearcher searcher = new FilterNoRepetidosSearcher(stubNoRepetidos);
		FilterNoRepetidos filterNoRepetidos = new FilterNoRepetidos(searcher);

		FilterCeliacosStub stub = new FilterCeliacosStub(listaIngredientes);
		FilterCeliacosSearcher searcher2 = new FilterCeliacosSearcher(stub);
		FilterCeliacos filterCeliacos = new FilterCeliacos(searcher2);
		
		filterApli = new FilterAplicator();
		filterApli.addFilter(filterCeliacos);
		filterApli.addFilter(filterNoRepetidos);
		return filterApli;
	}
	
	public static FilterAplicator FilterAplicatorCeliacos(String ingrediente)
	{
		FilterAplicator filterApli;
		
		filterApli = new FilterAplicator();
		filterApli.addFilter(FilterCeliacos(ingrediente));
		return filterApli;
	}
	
	public static FilterCeliacos FilterCeliacos(String ingrediente)
	{
		ArrayList<Ingrediente> listaIngredientes = new ArrayList<Ingrediente>();
		listaIngredientes.add(new Ingrediente(ingrediente));
		
		FilterCeliacosStub stub = new FilterCeliacosStub(listaIngredientes);
		FilterCeliacosSearcher searcher2 = new FilterCeliacosSearcher(stub);
		FilterCeliacos filterCeliacos = new FilterCeliacos(searcher2);
		
		return filterCeliacos;
	}
	public static FilterNoRepetidos FilterNoRepetidos()
	{
		ArrayList<Plato> listaPlatos = new ArrayList<Plato>();
		listaPlatos.add(fideosConTuco());
		
		FilterNoRepetidosStub stubNoRepetidos = new FilterNoRepetidosStub(listaPlatos);
		FilterNoRepetidosSearcher searcher = new FilterNoRepetidosSearcher(stubNoRepetidos);
		FilterNoRepetidos filterNoRepetidos = new FilterNoRepetidos(searcher);
		return filterNoRepetidos;
	}
	public static FilterAplicator filterAplicatorVacio()
	{
		FilterAplicator filterApli;
		filterApli = new FilterAplicator();
		return filterApli;
		
	}
	public static ArrayList<Plato> ListaPlatosVacia()
	{
		ArrayList<Plato> lista = new ArrayList<Plato>();
		return lista;
	}
	
	public static ArrayList<Plato> ListaPlatos()
	{
		ArrayList<Plato> listaPlatos = new ArrayList<Plato>();
		listaPlatos.add(fideosConTuco());
		listaPlatos.add(polloConPapas());
		
		return listaPlatos;
	}
	
	public static Plato fideosConTuco()
	{
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente pera = new Ingrediente("fideos");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad seis = new Cantidad(Medicion.Kg, 6);
		Map<Ingrediente, Cantidad> ingredientes = new HashMap<Ingrediente, Cantidad>();
		ingredientes.put(tomate, cinco);
		ingredientes.put(pera, seis);
		Receta receta = new Receta(ingredientes);
		String nombre = "Fideos con tuco";
		Plato plato = new Plato(nombre, receta);
		return plato;
	}
	public static Plato polloConPapas()
	{
		Ingrediente pollo = new Ingrediente("pollo");
		Ingrediente papas = new Ingrediente("fideos");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad seis = new Cantidad(Medicion.Kg, 6);
		Map<Ingrediente, Cantidad> ingredientes2 = new HashMap<Ingrediente, Cantidad>();
		ingredientes2.put(pollo, cinco);
		ingredientes2.put(papas, seis);
		Receta receta2 = new Receta(ingredientes2);
		String nombre2 = "Pollo con papas";
		Plato plato2 = new Plato(nombre2, receta2);
		return plato2;
	}
	
	/*
	Escenario 1 (Vacío):
		FilterAplicator no posee cargado ningún Filter, se lo llamará FilterAplicatorVacio.
		Se posee la lista de Platos listaPlatos con los platos = <Fideos Con Tuco> y <Pollo con papas>

	1 - Llamo al método listFiltering(listaPlatos) usando el FilterAplicatorVacio, devolvera listaPlatos sin filtrado alguno.

	Escenario 2 (Filtrado):
	FilterAplicatorCeliacos posee activado el FilterCeliacos
	FilterCeliacos posee un FilterCeliacosStub = StubCeliacos1 el cual consiste de un ingrediente a filtrar “tomate”.

	2- Llamo al metodo listFiltering(listaPlatos) usando el FilterAplicatorCeliacos, me devuelve una lista con el plato <Pollo con papas>

	Escenario 3 (Sin Filtrado):
	FilterCeliacos posee ahora un FilterCeliacosStub = StubCeliacos2 el cual consiste de una lista con un  ingrediente “Pescado”.

	3- Llamo al metodo listFiltering(listaPlatos) usando el StubCeliacos2, me devuelve listaPlatos sin filtrado alguno.

	Escenario 4 (Null):
	Se tendrá un FilterAplicatorCeliacos = FilterAplicatorCeliacos , el cual poseerá un FilterNoRepetidosStub con una lista que contiene el plato <Pollo con papas>

	4.1-  Llamo al método listFiltering(Null) de FilterAplicatorCeliacos , se genera una excepción “NullPointerException”.

	4.2 Llamo al metodo isFiltered(Null) de FilterCeliacos, se genera una excepcion “NullPointerException”.

	Escenario 1 (Vacío):
		Se poseerá un plato = <Fideos Con Tuco>.
		Se tendra un FilterNoRepetidos = FilterNoRepetidosVacio, el cual poseerá un FilterNoRepetidosStub con una lista vacía de platos.

		1 - Llamo al método isFiltered(<Fideos con Tuco>) de FilterNoRepetidos y me devuelve False.

		Escenario 2 (Filtrado):
		Se tendra un FilterNoRepetidos = FilterNoRepetidosFiltrador, el cual poseerá un FilterNoRepetidosStub con una lista que contiene el plato <Fideos con Tuco>

		2-  Llamo al método isFiltered(<Fideos con Tuco>) de FilterNoRepetidos y me devuelve True.

		Escenario 3 (Sin Filtrado):
		Se tendra un FilterNoRepetidos = FilterNoRepetidosNoFiltrador, el cual poseerá un FilterNoRepetidosStub con una lista que contiene el plato <Pollo con papas>

		3-  Llamo al método isFiltered(<Fideos con Tuco>) de FilterNoRepetidosNoFiltrador y me devuelve False.

		Escenario 4 (Null):
		Se tendra un FilterNoRepetidos = FilterNoRepetidosNoFiltrador, el cual poseerá un FilterNoRepetidosStub con una lista que contiene el plato <Pollo con papas>

		4-  Llamo al método isFiltered(Null) de FilterNoRepetidosFiltrador, se genera una excepción “NullPointerException”.
*/
}
