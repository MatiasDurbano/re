package main;

import modelo.ApiDB;
import modelo.MenuCreator;
import modelo.Solver;
import modelo.Solverfetcher;
import Cache2.APICacheIngredientes;
import Interface.DataColectorInterface;

public class App 
{
	DataColectorInterface colector;
	Solverfetcher fetcher;
	Solver solver;
	MenuCreator menuCreator;
	
	public App(DataColectorInterface colector, Solverfetcher fetcher, Solver solver, MenuCreator menuCreator) 
	{
		this.colector = colector;
		this.fetcher = fetcher;
		this.solver = solver;
		this.menuCreator = menuCreator;
	}

	public void iniciar() 
	{
		
	}
}
