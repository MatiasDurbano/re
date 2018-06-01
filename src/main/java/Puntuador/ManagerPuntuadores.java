package Puntuador;
import java.util.List;
import java.util.Map;

import Analizador.CommentAnalyzer;
import Analizador.SearchEngineTweetsImp;
import modelo.Plato;
import modelo.StockCantidad;

public class ManagerPuntuadores 
{
	PuntuadorTwitter puntuadorTwitter;
	PuntuadorPorCantidad puntuadorCantidad;
	
	public  ManagerPuntuadores() 
	{
		puntuadorTwitter = new PuntuadorTwitter(new CommentAnalyzer(new SearchEngineTweetsImp()),10);
		puntuadorCantidad = new PuntuadorPorCantidad();
	}
	
	public double puntuarPlato(Plato arg0, StockCantidad stock) 
	{
		double aux =puntuadorTwitter.pedirPuntaje(arg0);
		aux = aux + puntuadorCantidad.pedirPuntaje(arg0,stock);
		
		return aux;
	}
}
