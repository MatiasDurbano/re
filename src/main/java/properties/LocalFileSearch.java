package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LocalFileSearch implements PropertiesFileSearch{

	@Override
	public FileReader getFileAddress() throws FileNotFoundException 
	{
		//obtengo la ruta donde esta el jar en ejecucion
		String rutaLocal = this.getClass().getProtectionDomain().getCodeSource().getLocation().toString();
		rutaLocal = rutaLocal.substring(1); //borro una barra / que me deja al principio
		
		FileReader ret = new FileReader(rutaLocal);
		return ret;

	}
	

}
