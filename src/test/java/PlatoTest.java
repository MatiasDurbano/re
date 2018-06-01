import java.util.HashMap;
import java.util.Map;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;

import org.junit.Assert;
import org.junit.Test;
public class PlatoTest 
{
	@Test
	public void test()
	{
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente pera = new Ingrediente("fideos");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad seis = new Cantidad(Medicion.Kg, 6);
		Map<Ingrediente, Cantidad> ingredientes = new HashMap<Ingrediente, Cantidad>();
		ingredientes.put(tomate, cinco);
		ingredientes.put(pera, seis);
		Receta receta = new Receta(ingredientes);
		String nombre = "Fideos con tuco";
		Plato plato = new Plato(nombre, receta);
		
		Assert.assertEquals(plato.toString(),plato.toString());
		Assert.assertFalse(plato.equals(null));
		Assert.assertFalse(plato.equals(tomate));
		Plato platoNull = new Plato(null,receta);
		Assert.assertFalse(platoNull.equals(plato));
		Plato platoNull2 = new Plato(nombre,null);
		Assert.assertFalse(platoNull2.equals(plato));
	}
}
