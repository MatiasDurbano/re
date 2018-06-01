package baterias_test;

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
import Filter.FilterAplicator;
import Filter.FilterCeliacos;
import Filter.FilterCeliacosSearcher;
import Filter.FilterCeliacosStub;
import Filter.FilterNoRepetidos;
import Filter.FilterNoRepetidosSearcher;
import Filter.FilterNoRepetidosStub;
import Historial.MenuLogger;
import Historial.ProxyRecordInterface;
import Historial.ProxyRecordStub;

public class BFilter 
{
	public static FilterAplicator FilterCombinado()
	{
		FilterAplicator filterApli= new FilterAplicator();
		filterApli.addFilter(FilterCeliacos("tomate"));
		filterApli.addFilter(FilterNoRepetidos());
		
		return filterApli;
	}
	
	public static FilterAplicator FilterAplicatorCeliacos(String ingrediente)
	{
		FilterAplicator filterApli= new FilterAplicator();
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
		int tamañoMaximo = 5;
		ArrayList<Plato> listaPlatos = new ArrayList<Plato>();
		listaPlatos.add(fideosConTuco());
		List<Menu> menues = new ArrayList<Menu>();
		menues.add(new Menu(listaPlatos));

		ProxyRecordStub proxyRecordStub = new ProxyRecordStub();
		proxyRecordStub.writeMenues(menues);
		MenuLogger stubNoRepetidos = new MenuLogger(tamañoMaximo, proxyRecordStub);
		FilterNoRepetidosSearcher searcher = new FilterNoRepetidosSearcher(stubNoRepetidos);
		FilterNoRepetidos filterNoRepetidos = new FilterNoRepetidos(searcher);
		
		return filterNoRepetidos;
	}
	public static FilterAplicator filterAplicatorVacio()
	{
		FilterAplicator filterApli= new FilterAplicator();
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
}
