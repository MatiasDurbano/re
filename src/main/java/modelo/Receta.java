package modelo;

import java.util.HashMap;
import java.util.Map;
public class Receta 
{
	private Map<Ingrediente, Cantidad> receta;
	
	public Receta() {
		this.receta = new HashMap();
	}
}
