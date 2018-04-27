import static org.junit.Assert.assertEquals;
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
		
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente pera = new Ingrediente("pera");
		Ingrediente cebolla = new Ingrediente("cebolla");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad seis = new Cantidad(Medicion.Kg, 6);
		Cantidad cuatro = new Cantidad(Medicion.Kg, 4);
		Map<Ingrediente, Cantidad> ingredientes = new HashMap<Ingrediente, Cantidad>();
		data.addStock(tomate, cinco);
		data.addStock(pera, seis);
		data.addStock(cebolla, cuatro);
		
		ingredientes.put(tomate, cinco);
		ingredientes.put(pera, seis);
		ingredientes.put(cebolla, cuatro);
		
		Receta receta = new Receta(ingredientes);
		String nombre = "Fideos con tuco";
		
		Plato plato = new Plato(nombre, receta);
		
		List<Plato> p = new ArrayList<Plato>();
		p.add(plato);
		
		Solver solver = new Solver();
		
		solver.puntuarPlatos(p,data);
		
		Map<Plato,Integer> platosYcantidad = solver.getPlatosYcantidad();
		
		assertTrue(platosYcantidad.get("fideos con tuco").intValue()<10);		
		
	}

}
