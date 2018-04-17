package modelo;
import java.util.List;
import Interface.ProxyCacheInterface;
import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;
import Proxy.ProxyCache;
import Proxy.ProxyIngrediente;
import Proxy.ProxyPlato;

public class DataColector 
{
	private ProxyIngredienteInterface proxyIngrediente;
	private ProxyPlatoInterface proxyPlato;
	private ProxyCacheInterface proxyCache;
	
	public DataColector() 
	{
		proxyIngrediente = new ProxyIngrediente();
		proxyPlato = new ProxyPlato();
		proxyCache = new ProxyCache(this.proxyIngrediente,this.proxyPlato);
	}
	
	public StockCantidad getStockIngredientes(){
		StockCantidad ret;
		ret = proxyCache.getCantidad();
		return ret;
	}
	
	public Cantidad getCantidad(Ingrediente arg0) 
	{
		return proxyCache.getCantidad().getCantidad(arg0);
	}
	
	public List<Plato> getPlatos()
	{
		List <Plato> ret;
		ret= proxyCache.getPlatos();
		return ret;
	}
}
