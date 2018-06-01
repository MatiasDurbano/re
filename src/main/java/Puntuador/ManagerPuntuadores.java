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
	
	
	public Map <Plato,Double> puntuarTwitter(List<Plato> arg0) {
		for(Plato platos : arg0) {
			puntuadorTwitter.pedirPuntaje(platos);
		}
		
		return puntuadorTwitter.getMap();
	}

}
