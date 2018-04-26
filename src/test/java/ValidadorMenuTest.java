

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import Validadores.ValidadorMenu;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Menu;
import modelo.Plato;
import modelo.Receta;

public class ValidadorMenuTest {

	@Test
	public void test() {
		Menu menu = new Menu();		
		assertTrue(ValidadorMenu.MenuVacio(menu));
		
		//---
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente fideos = new Ingrediente("fideos");
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Map<Ingrediente, Cantidad> am = new HashMap<Ingrediente, Cantidad>();
		am.put(tomate, diez);
		am.put(fideos, ocho);
		Receta ar = new Receta(am);
		String as = "Fideos con tuco";
		Plato a = new Plato(as, ar);
		
		Ingrediente carne = new Ingrediente("carne");
		Ingrediente papas = new Ingrediente("papas");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad cuatro = new Cantidad(Medicion.Unidad, 4);
		Map<Ingrediente, Cantidad> bm = new HashMap<Ingrediente, Cantidad>();
		bm.put(carne, cinco);
		bm.put(papas, cuatro);
		Receta br = new Receta(am);
		String bs = "Carne al horno con papas";
		Plato b = new Plato(bs, br);		
				
		//---
		
		menu.agregarPlato(a);
		menu.asignarFechaActual();
		assertTrue(menu.getFecha_de_Creacion() != null);		
		menu = ValidadorMenu.SacaRepetido(menu);			
	}
		
}
