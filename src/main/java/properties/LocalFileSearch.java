package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LocalFileSearch implements PropertiesFileSearch{

	@Override
	public FileReader getFileAddress() throws FileNotFoundException 
	{
		//obtengo la ruta donde esta el jar en ejecucion
		String rutaLocal = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		rutaLocal = rutaLocal.substring(1); //borro una barra / que me deja al principio
		rutaLocal = rutaLocal + "archivo.properties"; //nombre archivo Propierties
		
		FileReader ret = new FileReader(rutaLocal);
		return ret;

	}

	@Override
	public void setAddress(String arg0) {
		try {
			FileReader ret = new FileReader(arg0);
		} catch (FileNotFoundException e) {
			System.out.println("error en el set del adress");
			e.printStackTrace();
		}
		 
	}
	

}
