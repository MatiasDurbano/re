package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {
	
	private PropertiesFileSearch fileSercher;
	private Properties properties;
	private DataConfig data;
	
	public PropertiesLoader() {
		
		this.fileSercher = new AbsolutFileSearch();
		this.properties = new Properties();
		this.data = new DataConfig();
		this.readProperties();
	}
	
	public void readProperties() {
		try {
			FileReader file = fileSercher.getFileAddress();
		properties.load(file);
		String filtro = properties.getProperty("filter");
		if(filtro == null) {
			System.out.println("tipo de filtro no definido");
		}
		data.setFilter(filtro);
		String cache = properties.getProperty("cachesize");
		if(cache == null) cache = "5"; // si no encuentra el valor para el tamaño de la cache, setea por defecto 5
		data.setCachesize(cache);
		}
		catch (IOException e){
			System.out.println("no se puede leer el archivo properties");
		}
	}
		
	public DataConfig getDataConfig() {
		return data;
	}
	
}
