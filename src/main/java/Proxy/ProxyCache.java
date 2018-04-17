package Proxy;
import java.util.ArrayList;
import java.util.List;

import modelo.Plato;
import modelo.StockCantidad;
import Interface.ProxyCacheInterface;
import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;
import Stub.ProxyIngredienteStub;

public class ProxyCache implements ProxyCacheInterface
{
	ProxyIngredienteInterface ingredienteInterfaz;
	ProxyPlatoInterface platoInterfaz;
	StockCantidad stockCantidadBuffer;
	List<Plato> listaPlatosBuffer;
	public ProxyCache(ProxyIngredienteInterface ingredienteInterfaz, ProxyPlatoInterface platoInterfaz) 
	{
		this.ingredienteInterfaz = ingredienteInterfaz;
		this.platoInterfaz = platoInterfaz;
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
		StockCantidad stockIngrediente = this.ingredienteInterfaz.get();
		List<Plato> listaPlatos = this.platoInterfaz.get();
		if(listaPlatosBuffer.isEmpty())
				this.listaPlatosBuffer = platoInterfaz.get();
		if(this.stockCantidadBuffer.isEmpty())
			this.stockCantidadBuffer = ingredienteInterfaz.get();
	}
	@Override
	public boolean estaActualizada() 
	{
		if(this.listaPlatosBuffer.isEmpty() || this.stockCantidadBuffer.isEmpty())
		{
			return false;
		}
		return true;
	}
}
