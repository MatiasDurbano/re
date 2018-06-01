package Puntuador;

import java.util.List;
import java.util.Map;

import Analizador.CommentAnalyzer;
import Analizador.SearchEngineTweetsImp;
import modelo.Plato;

public class ManagerPuntuadores {
	
	PuntuadorTwitter puntuadorTwitter;
	
	public  ManagerPuntuadores() {
		puntuadorTwitter = new PuntuadorTwitter(new CommentAnalyzer(new SearchEngineTweetsImp()),10);
	}
	
	
	public double puntuarTwitter(Plato arg0) {
		
		return puntuadorTwitter.pedirPuntaje(arg0);
	
	}

}
