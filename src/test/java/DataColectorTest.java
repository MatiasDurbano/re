import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import modelo.Cantidad;
import modelo.DataColector;
import modelo.IdentyMap;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;

public class DataColectorTest {

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		DataColector data= new DataColector();
		List<Ingrediente> a = new ArrayList<Ingrediente> ();
		a = data.getIngredientes();
		
		assertEquals(4, a.size());
		 
	}
	
	

}
