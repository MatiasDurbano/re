import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import modelo.ApiDB;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.InternalDB;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;

public class ApiDBTest {

	@Test
	public void test() {
		InternalDB db= new InternalDB();
		ApiDB api = new ApiDB(db);
		
		List<Plato>lista = new ArrayList<Plato>();
		//Plato fideos con tuco , Receta: tomate (10), fideos (8)
		Ingrediente tomate = new Ingrediente("pollo");
		Ingrediente fideos = new Ingrediente("papa");
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Map<Ingrediente, Cantidad> am = new HashMap<Ingrediente, Cantidad>();
		am.put(tomate, diez);
		am.put(fideos, ocho);
		Receta ar = new Receta(am);
		String as = "papas con pollo";
		Plato a = new Plato(as, ar);
		
		//vacio
		assertEquals(true,api.get().size()==0);
		
		api.add(a);
		//con 1 elemento
		assertEquals(true,api.get().size()==1);
		api.add(a);
		//un solo elemento por repetido
		assertEquals(true,api.get().size()==1);
		
		assertEquals(true,api.get().get(0).equals(a));
		
	}

}
