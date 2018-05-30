package Filter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import modelo.Cantidad;
import modelo.Ingrediente;
import modelo.Medicion;
import modelo.Plato;
import modelo.Receta;

public class FilterNoRepetidosStub 
{
	List<Plato> list;
	
	public FilterNoRepetidosStub()
	{
		list = new ArrayList<Plato>();
		//INGREDIENTES HARDCODEADOS
		//FIDEOS CON TUCO
		Ingrediente tomate = new Ingrediente("tomate");
		Ingrediente pera = new Ingrediente("pera");
		Ingrediente cebolla = new Ingrediente("cebolla");
		Cantidad cinco = new Cantidad(Medicion.Kg, 5);
		Cantidad seis = new Cantidad(Medicion.Kg, 6);
		Cantidad cuatro = new Cantidad(Medicion.Kg, 4);
		Map<Ingrediente, Cantidad> ingredientes = new HashMap<Ingrediente, Cantidad>();
		ingredientes.put(tomate, cinco);
		ingredientes.put(pera, seis);
		ingredientes.put(cebolla, cuatro);
		Receta receta = new Receta(ingredientes);
		String nombre = "Fideos con tuco";
		Plato plato = new Plato(nombre, receta);
		
		list.add(plato);
	}
	public List<Plato> getFilterData() 
	{
		return list;
	}
}
