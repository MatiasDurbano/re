package Validadores;
import modelo.Menu;
import modelo.Plato;

public class ValidadorMenu {

	public static Menu SacaRepetido(Menu menu) 
	{
		Menu ret = new Menu();
		
		for(Plato p : menu.getPlatos()) {
			if(!(ret.getPlatos().contains(p))){
				ret.agregarPlato(p);
			}	
		}
		return ret;
	}
	public static boolean MenuVacio(Menu menu) 
	{
		return menu.getPlatos().isEmpty();
	}	
}
