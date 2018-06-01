import java.io.FileNotFoundException;

import org.junit.Test;

import properties.AbsolutFileSearch;


public class LocalFileSearchTest 
{
	@Test
	public void test()
	{
		AbsolutFileSearch search = new AbsolutFileSearch();
		
		try 
		{
			String ruta = "src/main/java/properties/archivo.properties";
			search.getFileAddress();
			search.setAddress(ruta);
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
