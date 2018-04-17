package Interface;
import java.util.List;
import modelo.Plato;
import modelo.StockCantidad;

public interface ProxyCacheInterface
{
	public  StockCantidad getCantidad();
	
	public List<Plato> getPlatos();
	
	public void actualizar();
	
	public boolean estaActualizada();
}
