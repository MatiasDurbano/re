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
			this.readFilter();
			this.readCacheSize();
			}
		catch (IOException e) {
			System.out.println("no se puede leer el archivo properties");
		}
	}
	
	public void readFilter() {
		String filtro = properties.getProperty("filter");
		if(filtro == null) 	
			System.out.println("tipo de filtro no definido");				
		data.setFilter(filtro);
	}
	
	public void readCacheSize() {
		String charSize = properties.getProperty("cachesize");
		try {
            Integer cache = Integer.parseInt(charSize);
            data.setCachesize(cache);            
        } catch (NumberFormatException excepcion) {
            System.out.println("No se pudo cargar tamaño de cache");
        }
	}
	
	public DataConfig getDataConfig() {
		return data;
	}
	
}
