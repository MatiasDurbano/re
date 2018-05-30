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
	
	public FilterNoRepetidosStub(List<Plato> list)
	{
		this.list = list;
	}
	public List<Plato> getFilterData() 
	{
		return list;
	}
}
