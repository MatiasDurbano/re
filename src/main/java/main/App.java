package main;

import modelo.ApiDB;
import modelo.Menu;
import modelo.MenuCreator;
import modelo.Plato;
import modelo.Solver;
import modelo.Solverfetcher;

import java.util.List;

import Cache2.APICacheIngredientes;
import Interface.DataColectorInterface;

public class App 
{
	DataColectorInterface colector;
	Solverfetcher fetcher;
	Solver solver;
	MenuCreator menuCreator;
	
	public App(DataColectorInterface colector) 
	{
		this.colector = colector;
		this.fetcher = new Solverfetcher(colector);
		this.solver = new Solver();
		this.menuCreator = new MenuCreator();
	}

	public void iniciar() 
	{
		fetcher.obtenerPlatos();
		fetcher.obtenerStock(fetcher.getPlatos());
		
		solver.puntuarPlatos(fetcher.getPlatos(), fetcher.getStock());
		
		menuCreator.ordenar(solver.getPlatosYcantidad());
		
		Menu menu;
		menu = menuCreator.crearMenu(3);		
	}
}
