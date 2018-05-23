package main;

import properties.PropertiesLoader;
import modelo.ApiDB;
import modelo.Cantidad;
import modelo.Collector;
import modelo.ControllerInternalDB;
import modelo.Ingrediente;
import modelo.InternalDB;
import modelo.MenuCreator;
import modelo.Solver;
import modelo.Solverfetcher;
import Cache2.APICacheIngredientes;
import Cache2.Cache;
import Interface.DataColectorInterface;
import Stub.ProxyIngredienteStub;
import Stub.ProxyPlatoStub;

public class InyectorDependencias 
{
	public static App crearAPP() 
	{
		PropertiesLoader propertyData = new PropertiesLoader();
		String filtroSeleccionado = propertyData.getDataConfig().getFilter();
		if (filtroSeleccionado == null)
		{
			//no Crear Filtro
		}
		else
		{
			//Crear Filtro Seleccionado
			//aca se usaria el Class.forname
		}
		
		//Creacion de cache
		Cache<Ingrediente, Cantidad> cache = new Cache<Ingrediente,Cantidad>();
		ProxyIngredienteStub stub = new ProxyIngredienteStub();
		
		int tamanoBufferCache = propertyData.getDataConfig().getCachesize();
		
		APICacheIngredientes apiCache = new APICacheIngredientes(cache, stub, tamanoBufferCache);
		
		//creacion DB interna
		InternalDB db= new InternalDB();
		ApiDB api = new ApiDB(db);
		ControllerInternalDB controller = new ControllerInternalDB(api,new ProxyPlatoStub());
		
		//creacion de Collector
		DataColectorInterface colector = new Collector(api, apiCache);
		
		Solverfetcher fetcher = new Solverfetcher(colector);
		Solver solver = new Solver();
		MenuCreator menuCreator = new MenuCreator();
		App app = new App(colector);
		
		return app;
	}
}
