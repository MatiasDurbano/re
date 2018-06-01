package Stub;
import java.util.ArrayList;
import java.util.List;

import Interface.ProxyIngredienteInterface;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;

import modelo.StockCantidad;


public class ProxyIngredienteStub implements ProxyIngredienteInterface
{
	StockCantidad stock;
	public ProxyIngredienteStub() 
	{
		stock = new StockCantidad();
		Ingrediente a= new Ingrediente ("papa");
		Cantidad a1= new Cantidad(Medicion.Kg,215.0);
		Ingrediente b= new Ingrediente ("fideos"); 
		Cantidad b1= new Cantidad(Medicion.Kg,563.5);
		Ingrediente c= new Ingrediente ("tomate");
		Cantidad c1= new Cantidad(Medicion.Kg,245.0);
		Ingrediente d= new Ingrediente ("pollo");
		Cantidad d1= new Cantidad(Medicion.Kg,158.0); 
		Ingrediente e= new Ingrediente ("papapapa");
		Cantidad e1= new Cantidad(Medicion.Kg,100.0); 
		
		stock.addStock(a, a1);
		stock.addStock(b, b1);
		stock.addStock(c, c1);
		stock.addStock(d, d1);
		stock.addStock(e, e1); 
		
		
		stock.addStock(new Ingrediente ("milanesa"), new Cantidad(Medicion.Kg, 10));
		stock.addStock(new Ingrediente ("zapallo"), new Cantidad(Medicion.Kg, 10));
	}
	public Cantidad get(Object arg0) {
		Ingrediente a = (Ingrediente) arg0;
		return stock.getCantidad(a);
		
	}
	
	 
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProxyIngredienteStub other = (ProxyIngredienteStub) obj;
		if (stock == null) {
			if (other.stock != null)
				return false;
		} else if (!stock.equals(other.stock))
			return false;
		return true;
	}
}
