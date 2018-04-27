package Cache2;
import java.util.HashMap;
import java.util.Map;

public class Cache<T,S> implements CacheInterface<T,S> {

	Map<T,S> resguardo;
	
	public Cache () {
		this.resguardo = new HashMap<T,S>();
	}

	@Override
	public S get(T dato) {
		return resguardo.get(dato);
	}

	@Override
	public void add(T clave, S valor) {
		this.resguardo.put(clave, valor);		
	}
	
	public void remove(T clave) {
		this.resguardo.remove(clave);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cache other = (Cache) obj;
		if (resguardo == null) {
			if (other.resguardo != null)
				return false;
		} else if (!resguardo.equals(other.resguardo))
			return false;
		return true;
	}
}
