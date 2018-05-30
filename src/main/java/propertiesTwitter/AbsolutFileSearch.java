package propertiesTwitter;

import java.io.FileNotFoundException;
import java.io.FileReader;

import properties.PropertiesFileSearch;

public class AbsolutFileSearch implements PropertiesFileSearch {
	
	private String ruta = "src/main/java/propertiesTwitter/archivo.properties";
	
	public AbsolutFileSearch() {
	}			
	
	public FileReader getFileAddress() throws FileNotFoundException	{
		FileReader ret = new FileReader(ruta);
		return ret;
	}
	public void setAddress(String nuevaRuta) {
		this.ruta = nuevaRuta;
	}
}
