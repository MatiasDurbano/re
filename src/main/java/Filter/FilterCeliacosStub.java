package Filter;
import java.util.ArrayList;
import java.util.List;
import modelo.Ingrediente;

public class FilterCeliacosStub implements FilterGateway
{
	List<Ingrediente> list;
	
	public FilterCeliacosStub()
	{
		list = new ArrayList<Ingrediente>();
		
		//INGREDIENTES HARDCODEADOS
		Ingrediente ing1 = new Ingrediente("tomate");
		list.add(ing1);
	}
	
	@Override
	public List<Ingrediente> getFilterData() 
	{
		return list;
	}
}
