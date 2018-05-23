package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;

public interface PropertiesFileSearch {
	
	public FileReader getFileAddress() throws FileNotFoundException;
	
}
