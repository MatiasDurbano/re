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
	}
	
	public void readProperties() throws IOException {
		FileReader file = fileSercher.getFileAddress();
		properties.load(file);
		String cadena = properties.getProperty("filter");
		data.setFilter(cadena);
	}
		
	public DataConfig getDataConfig() {
		return data;
	}
	
}
