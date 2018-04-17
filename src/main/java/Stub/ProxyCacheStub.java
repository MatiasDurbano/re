package Stub;
import java.util.ArrayList;
import java.util.List;
import modelo.Plato;
import modelo.StockCantidad;
import Interface.ProxyCacheInterface;
import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;

public class ProxyCacheStub implements ProxyCacheInterface
{
	ProxyIngredienteInterface ingredienteInterfaz;
	ProxyPlatoInterface platoInterfaz;
	StockCantidad stockCantidadBuffer;
	List<Plato> listaPlatosBuffer;
	
	public ProxyCacheStub ()
	{
		this.ingredienteInterfaz = new ProxyIngredienteStub();
		this.platoInterfaz = new ProxyPlatoStub();
		this.stockCantidadBuffer = new StockCantidad();
		this.listaPlatosBuffer = new ArrayList<Plato>();
		actualizar();
	}
	@Override
	public StockCantidad getCantidad() 
	{
		return stockCantidadBuffer;
	}

	@Override
	public List<Plato> getPlatos() 
	{
		return listaPlatosBuffer;
	}

	@Override
	public void actualizar() 
	{
		this.stockCantidadBuffer = this.ingredienteInterfaz.get();
		this.listaPlatosBuffer = this.platoInterfaz.get();
	}

	@Override
	public boolean estaActualizada() 
	{
		if(stockCantidadBuffer.isEmpty() || listaPlatosBuffer.isEmpty())
			return false;
		return true;
	}
}
