import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;
import modelo.Solver;
import modelo.StockCantidad;

public class SolverTest {
	@Test
	public void test() {
		
		StockCantidad data= new StockCantidad();
		
		Ingrediente fideo = new Ingrediente("fideo");
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente cebolla = new Ingrediente("cebolla");
		Cantidad uno = new Cantidad(Medicion.Kg, 1);
		Cantidad tres = new Cantidad(Medicion.Kg, 3);
		Cantidad dos = new Cantidad(Medicion.Kg, 2);
		Map<Ingrediente, Cantidad> ingredientes = new HashMap<Ingrediente, Cantidad>();
		data.addStock(fideo, uno);
		data.addStock(tomate, tres);
		data.addStock(cebolla, dos);
		
		ingredientes.put(fideo, uno);
		ingredientes.put(tomate, tres);
		ingredientes.put(cebolla, dos);
		
		Receta receta = new Receta(ingredientes);
		String nombre = "fideos con tuco";
		
		Plato plato = new Plato(nombre, receta);
		
		List<Plato> p = new ArrayList<Plato>();
		p.add(plato);
		
		Solver solver = new Solver();
		
		solver.puntuarPlatos(p,data);
		
		Map<Plato,Integer> platosYcantidad = new HashMap<Plato,Integer>();
		platosYcantidad = solver.getPlatosYcantidad();
		
		Integer i = platosYcantidad.get(plato);
		assertTrue(i <= 1);		
	}

}
