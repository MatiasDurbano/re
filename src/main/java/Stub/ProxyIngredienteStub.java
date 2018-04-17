package Stub;
import java.util.ArrayList;
import java.util.List;

import Interface.ProxyIngredienteInterface;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.StockCantidad;


public class ProxyIngredienteStub implements ProxyIngredienteInterface
{
	StockCantidad stock;
	
	public ProxyIngredienteStub(int i)
	{
		stock = new StockCantidad();
		Ingrediente a= new Ingrediente ("papa");
		Cantidad a1= new Cantidad(Medicion.Kg,2);
		Ingrediente b= new Ingrediente ("pera");
		Cantidad b1= new Cantidad(Medicion.Kg,5.5);
		Ingrediente c= new Ingrediente ("tomate");
		Cantidad c1= new Cantidad(Medicion.Kg,2.0);
		Ingrediente d= new Ingrediente ("cebolla");
		Cantidad d1= new Cantidad(Medicion.Kg,1.0); 
		Ingrediente e= new Ingrediente ("papa");
		Cantidad e1= new Cantidad(Medicion.Kg,4); 
		
		stock.addStock(a, a1);
		stock.addStock(b, b1);
		stock.addStock(c, c1);
		stock.addStock(d, d1);
		stock.addStock(e, e1);
		
	}

	public ProxyIngredienteStub() {
		stock = new StockCantidad();
		Ingrediente a= new Ingrediente ("papa");
		Cantidad a1= new Cantidad(Medicion.Kg,2);
		Ingrediente b= new Ingrediente ("pera"); 
		Cantidad b1= new Cantidad(Medicion.Kg,5.5);
		Ingrediente c= new Ingrediente ("tomate");
		Cantidad c1= new Cantidad(Medicion.Kg,2.0);
		Ingrediente d= new Ingrediente ("cebolla");
		Cantidad d1= new Cantidad(Medicion.Kg,1.0); 
		Ingrediente e= new Ingrediente ("papapapa");
		Cantidad e1= new Cantidad(Medicion.Kg,-4); 
		
		stock.addStock(a, a1);
		stock.addStock(b, b1);
		stock.addStock(c, c1);
		stock.addStock(d, d1);
		stock.addStock(e, e1);
		
	}
	
	@Override
	public StockCantidad get() 
	{
		return stock;
	}
}
