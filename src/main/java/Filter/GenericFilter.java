package Filter;
import modelo.Plato;

public interface GenericFilter
{
	public boolean isFiltered(Plato p);
	
	public void updateFilterData();
}
