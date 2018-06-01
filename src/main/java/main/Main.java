package main;

import java.util.HashMap;

public class Main 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException 
	{	
		App app = InyectorDependencias.crearAPP();
		app.iniciar();
	}
}
