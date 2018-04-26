package Cache2;

public interface CacheInterface<T,S> {
	
	public S get(T dato);
	
	public void add(T clave, S valor);
}
