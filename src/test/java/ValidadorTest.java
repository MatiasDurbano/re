import static org.junit.Assert.*;

import org.junit.Test;
import Validadores.ValidadorCantidad;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.StockCantidad;

public class ValidadorTest 
{	
	@Test
	public void ingredienteRepetido() 
	{ 
		StockCantidad stock = new StockCantidad();
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
		 
		assertEquals(3,stock.getIngredientes().size());
	} 
	
	@Test
	public void ingredienteRepetido2() 
	{ 
		StockCantidad stock = new StockCantidad();
		Ingrediente a= new Ingrediente ("papa");
		Cantidad a1= new Cantidad(Medicion.Kg,2);
		Ingrediente b= new Ingrediente ("papa");
		Cantidad b1= new Cantidad(Medicion.Kg,5.5);
		Ingrediente c= new Ingrediente ("papa");
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
		 
		assertEquals(1,stock.getIngredientes().size());
	}
	
	@Test
	public void CantidadMal() 
	{ 
		StockCantidad stock = new StockCantidad();
		
		Ingrediente b= new Ingrediente ("pera");
		Cantidad b1= new Cantidad(Medicion.Kg,-5.5);
		Ingrediente c= new Ingrediente ("pollo");
		Cantidad c1= new Cantidad(Medicion.Kg,5.5);
		Ingrediente d= new Ingrediente ("tomate");
		Cantidad d1= new Cantidad(Medicion.Kg,3.5);
		Ingrediente f= new Ingrediente ("repollo");
		Cantidad f1= new Cantidad(Medicion.Kg,6.5);
		
		stock.addStock(b, b1);
		stock.addStock(c, c1);
		stock.addStock(d, d1);
		stock.addStock(f, f1);
	
		assertEquals(3, ValidadorCantidad.quitarMalStock(stock).getIngredientes().size());
	}
	
	
}
