package properties;

public class DataConfig {
	
	private String filter;
	private Integer cachesize;
	
	public DataConfig() {
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public Integer getCachesize() {
		return cachesize;
	}

	public void setCachesize(String cachesize) {
        try {
            this.cachesize = Integer.parseInt(cachesize);
        } catch (NumberFormatException excepcion) {
            this.cachesize = 5;
        }
	}
	
}
