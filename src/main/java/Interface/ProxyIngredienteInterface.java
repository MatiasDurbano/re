package Interface;
import modelo.Cantidad;
import modelo.StockCantidad;

public interface ProxyIngredienteInterface 
{
	public  StockCantidad get();
	
	public Cantidad get(Object arg0);
}
