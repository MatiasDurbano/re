import static org.junit.Assert.*;

import java.util.ArrayList;

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
		Ingrediente ingrediente = new Ingrediente("Papa", new Cantidad(Medicion.Unidad,2));
		Ingrediente ingrediente2 = new Ingrediente("Pera", new Cantidad(Medicion.Unidad,2));
		Ingrediente ingrediente3 = new Ingrediente("Pata de pollo", new Cantidad(Medicion.Unidad,2));
		ArrayList<Ingrediente> receta= new ArrayList<Ingrediente>();
		receta.add(ingrediente);
		receta.add(ingrediente3);
		
		Plato plato = new Plato ("papa con pollo",receta);
		ArrayList<Plato> platoBien = new ArrayList<Plato>();
		platoBien.add(plato);
		IdentyMap.addPlato(plato);
		IdentyMap.addIngrediente(ingrediente);
		IdentyMap.addIngrediente(ingrediente2);	
		IdentyMap.addIngrediente(ingrediente3);
		 //me trae 1 solo plato
		assertEquals(true, plato.equals(DataColector.getPlatosPorIngrediente(ingrediente).get(0)));
		
		
	}

}
