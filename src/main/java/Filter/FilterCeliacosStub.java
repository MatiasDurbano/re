package Filter;
import java.util.ArrayList;
import java.util.List;
import modelo.Ingrediente;

public class FilterCeliacosStub implements FilterGateway
{
	List<Ingrediente> list;
	
	public FilterCeliacosStub(List<Ingrediente> list)
	{
		this.list = list;
	}
	
	@Override
	public List<Ingrediente> getFilterData() 
	{
		return list;
	}
}
