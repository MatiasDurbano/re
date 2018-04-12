package modelo;


import java.util.ArrayList;

public class DataColector {
	
	
	public static ArrayList<Ingrediente> getIngredientes(){
		return IdentyMap.getIngredientes();
	}
	
	
	//cambiarlo a array de ingredientes
	public static ArrayList<Plato> getPlatosPorIngrediente(Ingrediente arg){
		return IdentyMap.getPlatosPorIngrediente(arg);
	}
	

}
