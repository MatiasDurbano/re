import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import modelo.AnalizadorPlatos;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;

public class AnalizadorPlatosTest {

	@Test
	public void dameIngredienteCantidad() {
		
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
		
		Map<Ingrediente, Cantidad> ret = AnalizadorPlatos.dameIngredientesyCantidad(a);
		
		Assert.assertEquals(am, ret);
	}
	
	@Test
	public void dameIngredienteCantidadMal() {
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente fideos = new Ingrediente("fideos");
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Ingrediente queso = new Ingrediente("queso");
		Cantidad dos = new Cantidad(Medicion.Kg, 2);
		Map<Ingrediente, Cantidad> am = new HashMap<Ingrediente, Cantidad>();
		am.put(tomate, diez);
		am.put(fideos, ocho);
		Receta ar = new Receta(am);
		String as = "Fideos con tuco";
		Plato a = new Plato(as, ar);
		
		Map<Ingrediente, Cantidad> ret = AnalizadorPlatos.dameIngredientesyCantidad(a);
		
		Map<Ingrediente, Cantidad> ax = new HashMap<Ingrediente, Cantidad>();
		ax.put(tomate, diez);
		ax.put(fideos, ocho);
		ax.put(queso, dos);
		
		Assert.assertNotEquals(ax, ret);
	}
	
	@Test
	public void dameIngrediente() {
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente fideos = new Ingrediente("fideos");
		Ingrediente queso = new Ingrediente("queso");
		
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Cantidad dos = new Cantidad(Medicion.Kg, 2);
		
		Map<Ingrediente, Cantidad> am = new HashMap<Ingrediente, Cantidad>();
		am.put(tomate, diez);
		am.put(fideos, ocho);
		am.put(queso, dos);
		
		Receta ar = new Receta(am);
		String as = "Fideos con tuco";
		Plato a = new Plato(as, ar);
		
		ArrayList<Ingrediente> ret = AnalizadorPlatos.dameIngredientes(a);
		
		ArrayList<Ingrediente> prueba = new ArrayList<Ingrediente>();
		prueba.add(tomate);
		prueba.add(queso);
		prueba.add(fideos);
		
		Assert.assertEquals(prueba, ret);
	}
	
	@Test
	public void dameIngredienteMal() {
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente fideos = new Ingrediente("fideos");
		Ingrediente queso = new Ingrediente("queso");
		
		Cantidad diez = new Cantidad(Medicion.Kg, 10);
		Cantidad ocho = new Cantidad(Medicion.Kg, 8);
		Cantidad dos = new Cantidad(Medicion.Kg, 2);
		
		Map<Ingrediente, Cantidad> am = new HashMap<Ingrediente, Cantidad>();
		am.put(tomate, diez);
		am.put(fideos, ocho);
		am.put(queso, dos);
		
		Receta ar = new Receta(am);
		String as = "Fideos con tuco";
		Plato a = new Plato(as, ar);
		
		ArrayList<Ingrediente> ret = AnalizadorPlatos.dameIngredientes(a);
		
		ArrayList<Ingrediente> prueba = new ArrayList<Ingrediente>();
		prueba.add(tomate);
		prueba.add(fideos);
		
		Assert.assertNotEquals(prueba, ret);
	}
}
