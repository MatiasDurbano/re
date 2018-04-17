package Validadores;
import java.util.Map;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Menu;
import modelo.Plato;

public class ValidadorMenu {

	public static Menu SacaRepetidoYCeros(Menu menu) 
	{
		Menu ret = new Menu();
		
		for(Map.Entry<Plato, Integer> entry: menu.getPlatos().entrySet()) {
			if(!(ret.getPlatos().containsKey(entry.getKey())) && entry.getValue()>=0){
				ret.getPlatos().put(entry.getKey(), entry.getValue());
			}	
		}
		return ret;
	}
	public static boolean MenuVacio(Menu menu) 
	{
		return menu.getPlatos().isEmpty();
	}	
}
