package modelo;
import java.util.List;
import Interface.ProxyCacheInterface;
import Interface.ProxyIngredienteInterface;
import Interface.ProxyPlatoInterface;
import Proxy.ProxyCache;
import Proxy.ProxyIngrediente;
import Proxy.ProxyPlato;
import Validadores.ValidadorCantidad;

public class DataColector 
{
	private ProxyIngredienteInterface proxyIngrediente;
	private ProxyPlatoInterface proxyPlato;
	private ProxyCacheInterface proxyCache;
	
	public DataColector(ProxyIngrediente proxyIngrediente, ProxyPlato proxyPlato) 
	{
		proxyIngrediente = new ProxyIngrediente(proxyIngrediente);
		proxyPlato = new ProxyPlato(proxyPlato);
		proxyCache = new ProxyCache(this.proxyIngrediente,this.proxyPlato);
	}
	
	public StockCantidad getStockIngredientes(){
		StockCantidad ret;
		ret = proxyCache.getCantidad();
		return ValidadorCantidad.SacaRepetido(ret);
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
