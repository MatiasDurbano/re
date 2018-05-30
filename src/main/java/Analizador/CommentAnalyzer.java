package Analizador;

import java.util.ArrayList;
import java.util.List;

import modelo.Plato;
import twitter4j.Status;

public class CommentAnalyzer {

	List<Plato> platos;	
	public CommentAnalyzer(List<Plato> arg0) {
		platos = arg0;
	}
	
	public List<Informant> analizarComentarios(List<Status> arg0){
		List<Informant> InformantIndividual = new ArrayList<Informant>();
		
		List<Informant> InformantGrupal = new ArrayList<Informant>();
		
		for(Status statues : arg0) {
			String text = statues.getText();
			for(Plato plat : platos ) {
				if(text.contains(plat.getNombre().toLowerCase())) {
					if(puntuador(plat,text)!= null) {
						InformantIndividual.add(new Informant(plat,puntuador(plat,text)));
					}
				}
			}
		
		}
		
		for( Informant informants : InformantIndividual) {
			if(!InformantGrupal.contains(informants)) {
				InformantGrupal.add(new Informant(informants.getPlato(),calcularPuntaje(informants,InformantIndividual)));
			}
		}
		
		return InformantGrupal;
		
	}
	
	private Double calcularPuntaje(Informant arg0, List<Informant> arg1) {
		double ret=0;
		int cantApar=0;
		for(Informant informants: arg1) {
			if(informants.equals(arg0)) {
				ret= ret+ informants.getPuntaje();
				cantApar++;
			}
		}
		return ret/cantApar;
		
		
	}
	
	
	private Double puntuador(Plato arg0,String arg1) {
		if (arg1.contains("muy bueno")){
			return 3.0;
		}
		if (arg1.contains("bueno")){
			return 2.0;
		}
		
		if (arg1.contains("malo")){
			return -2.0;
		}
		
		if (arg1.contains("muy malo")){
			return -3.0;
		}
		else {
			return null;
		}
	}
	
}
