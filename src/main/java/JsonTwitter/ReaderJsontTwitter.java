package JsonTwitter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import properties.PropertiesFileSearch;
import propertiesTwitter.AbsolutFileSearch;
import propertiesTwitter.DataConfig;

public class ReaderJsontTwitter {
	private PropertiesFileSearch fileSercher;
	private Properties properties;
	private DataJsonTwitter data;
	
	public ReaderJsontTwitter() {
		
		this.fileSercher = new AbsolutFileSearch();
		this.properties = new Properties();
		this.data = new DataJsonTwitter();
		//this.readProperties();
	}
	
	public void readProperties() {
		try {
			FileReader file = fileSercher.getFileAddress();
			properties.load(file);			
			this.readJson1();
			this.readJson2();
			}
		catch (IOException e) {
			System.out.println("no se puede leer el archivo properties");
		}
	}
	
	public void readJson1() {
		String json1 = properties.getProperty("json1");
		if(json1 == null) 	
			System.out.println("json1 no definido");	
		
		System.out.println(json1);
		data.addJson(json1);
		
	}
	
	public void readJson2() {
		String json2 = properties.getProperty("json2");
		if(json2 == null) 	
			System.out.println("json2 no definido");
		System.out.println(json2);
        data.addJson(json2);   
      
      
	}
	
	public DataJsonTwitter getData() {
		return data;
	}
	 
	public void setAdress(String arg0) {
		fileSercher.setAddress(arg0);
		readProperties();
	}
}
