package main;

public class Main 
{
	public static void main(String[] args) 
	{
		App app = InyectorDependencias.crearAPP();		
		app.iniciar();
	}
	
	public static boolean run()
	{
		//para coverage
		String[] args = new String[10];
		try 
		{
			main(args);
		} 
		catch (Exception e) 
		{
			return false;	
		}
		return true;
	}
}
