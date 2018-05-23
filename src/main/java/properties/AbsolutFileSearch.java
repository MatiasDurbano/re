package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class AbsolutFileSearch implements PropertiesFileSearch {
	
	public AbsolutFileSearch() {
	}			
	
	public FileReader getFileAddress() throws FileNotFoundException	{
		FileReader ret = new FileReader("src/main/java/properties/archivo.properties");
		return ret;
	}	

}
