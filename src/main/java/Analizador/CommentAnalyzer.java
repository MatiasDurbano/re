package Analizador;

import java.util.ArrayList;
import java.util.List;

import modelo.Plato;
import twitter4j.Status;

public class CommentAnalyzer {
	
	SearchEngineTweets buscador;
	
	public CommentAnalyzer(SearchEngineTweets arg0) {		
		buscador = arg0;
	} 
	
	public Informant analizarComentarios(Plato arg0){
		List<Informant> InformantIndividual = new ArrayList<Informant>();
		
		List<Status> twitts = buscador.getStatus();
		String nombrePlato= arg0.getNombre().toLowerCase();
		for(Status statues : twitts) {
			String text = statues.getText().toLowerCase();

			if(text.contains(nombrePlato)) {
				if(puntuador(text)!= null) {
					InformantIndividual.add(new Informant(arg0,puntuador(text)));
					}
				}
			}
		
		return new Informant(arg0,calcularPuntaje(InformantIndividual));
		}
		
	
	
	private Double calcularPuntaje(List<Informant> arg1) {
		double ret=0;
		int cantApar=0;
		for(Informant informants: arg1) {
				ret= ret+ informants.getPuntaje();
				cantApar++;
		} 
		return ret/cantApar;
	}
	
	
	private Double puntuador(String arg1) {
		if (arg1.contains("buenisimo")){
			return 3.0;
		}
		if (arg1.contains("rico")){
			return 2.0;
		}
		
		if (arg1.contains("feo")){
			return -2.0;
		}
		
		if (arg1.contains("horrible")){
			return -3.0;
		}
		else {
			return null;
		}
	}
	
}
