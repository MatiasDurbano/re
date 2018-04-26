package Interface;

import java.util.List;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Plato;

public interface DataColectorInterface {
	
	public Cantidad getCantidad(Ingrediente arg0);
	
	public List<Plato> getPlato() ;
}
