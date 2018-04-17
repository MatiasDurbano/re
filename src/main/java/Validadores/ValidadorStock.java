package Validadores;
import modelo.Ingrediente;
import modelo.StockCantidad;

public class ValidadorStock 
{
	public static StockCantidad SacaRepetido(StockCantidad arg0) 
	{
		StockCantidad ret = new StockCantidad();
		
		for(Ingrediente ing : arg0.getIngredientes()) 
		{
			if(!(ret.contains(ing)) && arg0.getCantidad(ing).getValor()>=0)
			{
				ret.addStock(ing, arg0.getCantidad(ing));
			}	
		}
		return ret;
	}
}
