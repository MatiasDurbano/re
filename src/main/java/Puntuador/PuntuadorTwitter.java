package Puntuador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Analizador.CommentAnalyzer;
import Analizador.Informant;
import Analizador.SearchEngineTweets;
import Analizador.SearchEngineTweetsImp;
import modelo.Plato;

public class PuntuadorTwitter {
	
	private Map <Plato,Double> puntaje;
	private CommentAnalyzer analyzer ;
	private double cons;
	
	public PuntuadorTwitter(CommentAnalyzer arg0, double arg1) {
		puntaje = new HashMap<Plato,Double>();
		analyzer = arg0;
		cons = arg1;
	}
	
	public double pedirPuntaje(Plato arg0) {
		
		puntaje.clear();
		Informant informante = analyzer.analizarComentarios(arg0);	
		puntaje.put(informante.getPlato(), informante.getPuntaje()*cons);
		return puntaje.get(arg0);
		
	}
	
	public Map<Plato, Double> getMap(){
		return puntaje;
	}
	
	
	

}
