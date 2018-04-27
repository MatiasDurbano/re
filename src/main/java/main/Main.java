package main;

public class Main 
{
	public static void main(String[] args) 
	{
		App app = InyectorDependencias.crearAPP();
		app.iniciar();
	}
	
	public static boolean run(String[] args)
	{
		main(args);
		return true;
	}
}
