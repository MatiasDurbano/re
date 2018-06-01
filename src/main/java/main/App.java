package main;

import mail.MailMessage;
import mail.MailSender;
import modelo.ApiDB;
import modelo.Menu;
import modelo.MenuCreator;
import modelo.Plato;
import modelo.Solver;
import modelo.Solverfetcher;

import java.util.ArrayList;
import java.util.List;

import Cache2.APICacheIngredientes;
import Filter.FilterAplicator;
import Interface.DataColectorInterface;

public class App 
{
	DataColectorInterface colector;
	Solverfetcher fetcher;
	FilterAplicator filterAplicator;
	Solver solver;
	MenuCreator menuCreator;
	MailSender sender;
	
	public App(DataColectorInterface colector,MenuCreator menuCreator,FilterAplicator filterAplicator, MailSender sender) 
	{
		this.colector = colector;
		this.fetcher = new Solverfetcher(colector);
		this.filterAplicator = filterAplicator;
		this.solver = new Solver();
		this.menuCreator = menuCreator;
		this.sender = sender;
	}

	public void iniciar() 
	{
		fetcher.obtenerPlatos();
		List<Plato> platos = fetcher.getPlatos();
		//System.out.println(platos.toString());
		List<Plato> x = filterAplicator.listFiltering(platos);
		
		fetcher.obtenerStock(x);
		solver.puntuarPlatos(fetcher.getPlatos(), fetcher.getStock());
		menuCreator.ordenar(solver.getPlatosYcantidad());
		
		Menu menu;
		menu = menuCreator.crearMenu(3);
		
		//System.out.println(menu);
		sender.SendMail("Recomendacion de Menu", MailMessage.crearMensaje(menu));
	}
}
