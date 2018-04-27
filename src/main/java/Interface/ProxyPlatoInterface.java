package Interface;
import java.util.List;

import modelo.Plato;
import modelo.Receta;

public interface ProxyPlatoInterface 
{	
	public Receta get(Object arg0);
	
	public List<Plato> getPlatos();
}
