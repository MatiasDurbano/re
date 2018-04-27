package main;

import modelo.ApiDB;
import modelo.Cantidad;
import modelo.Collector;
import modelo.ControllerDB;
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
		//Creacion de cache
		Cache<Ingrediente, Cantidad> cache = new Cache<Ingrediente,Cantidad>();
		ProxyIngredienteStub stub = new ProxyIngredienteStub();
		int tamanoBufferCache = 10;
		APICacheIngredientes apiCache = new APICacheIngredientes(cache, stub, tamanoBufferCache);
		
		//creacion DB interna
		InternalDB db= new InternalDB();
		ApiDB api = new ApiDB(db);
		ControllerDB controller = new ControllerDB(api,new ProxyPlatoStub());
		
		//creacion de Collector
		DataColectorInterface colector = new Collector(api, apiCache);
		
		Solverfetcher fetcher = new Solverfetcher(colector);
		Solver solver = new Solver();
		MenuCreator menuCreator = new MenuCreator();
		App app = new App(colector,fetcher,solver,menuCreator);
		
		return app;
	}
}
