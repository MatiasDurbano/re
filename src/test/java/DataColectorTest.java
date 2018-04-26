import static org.junit.Assert.*;
import org.junit.Test;
import modelo.Cantidad;
import modelo.DataColector;
import modelo.Ingrediente;
import modelo.Medicion;


public class DataColectorTest {

	@Test
	public void test() 
	{
		DataColector data= new DataColector();
		Ingrediente a = new Ingrediente ("papa");
		
		Cantidad esp= new Cantidad(Medicion.Kg,2);
		
	
		assertEquals(true,esp.equals(data.getCantidad(a)));
	}
}
