package Validadores;
import modelo.Ingrediente;
import modelo.StockCantidad;

public class ValidadorCantidad 
{
	public static StockCantidad quitarMalStock(StockCantidad arg0) 
	{
		StockCantidad ret = new StockCantidad();
		
		for(Ingrediente ing : arg0.getIngredientes()) 
		{
			System.out.println(ing.getNombre() + " en validador");
			if( arg0.getCantidad(ing).getValor()>=0)
			{
				
				ret.addStock(ing, arg0.getCantidad(ing));
			}	
		}
		return ret; 
	}
}
