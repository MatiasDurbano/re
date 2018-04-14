package modelo;
import java.util.List;


public interface StockGateway 
{
	public List<Ingrediente_Stock> getStock();
	
	public List<Plato> getPlatos();
	
	
}
