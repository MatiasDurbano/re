package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TextAnalyzer {
	
	public static boolean encontrar(String buscado, String texto) {
		boolean ret = false;
		int cantPalabras = cantPalabras(buscado);
		List<String> textoSeparado = separar(texto.toLowerCase());
		List<String> textoAgrupado = agrupar(textoSeparado, cantPalabras);
		for(String x: textoAgrupado) {
			if(distanciaHamming(x, buscado.toLowerCase()) <= 1) {
				ret = ret || true;
			}
		}
		return ret;
	}
	
	public static int cantPalabras(String x) {
		int ret = 0;
		StringTokenizer st = new StringTokenizer(x);
	    while (st.hasMoreTokens()) {
	    	st.nextToken();
	        ret++;
	    }
	    return ret;
	}
	
	public static List<String> separar(String x){
		List<String> ret = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(x);
	    while (st.hasMoreTokens()) {
	    	if(!(st.nextToken().contains(".") || st.nextToken().contains(",") || st.nextToken().contains("!")
	    			|| st.nextToken().equals("/")))
	        ret.add(st.nextToken());
	    }
	    return ret;
	}
	
	public static List<String> agrupar(List<String> x, int cantidad){
		List<String> ret = new ArrayList<String>();
	    for(int i = 0; i < x.size()- cantidad + 1; i++) {
	    	String auxiliar = "";
	    	for(int z = 0; z < cantidad; z++) {
	    		auxiliar = auxiliar + x.get(i+z) + " ";
	    	}
	    	ret.add(auxiliar.substring(0, auxiliar.length()-1));
	    }
	    return ret;
	}
	
	public static int distanciaHamming(String x, String y) {
		int ret = 0;
		if(x.length() != y.length()) {
			ret = Integer.MAX_VALUE; 
		}
		else {
			for (int i = 0; i < x.length(); i++) {
				if(x.charAt(i) != y.charAt(i)) {
					ret++;
				}
			}
		}
		return ret;
	}
	
	public static void eliminarSignos(String x) {
		//x.replaceAll(regex, replacement)
	}
}
