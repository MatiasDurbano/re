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
			
			this.readJson3();
			this.readJson4();
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
	
	public void readJson3() {
		String json3 = properties.getProperty("json3");
		if(json3 == null) 	
			System.out.println("json3 no definido");
		System.out.println(json3);
        data.addJson(json3);   
	}
	public void readJson4() {
		String json4 = properties.getProperty("json4");
		if(json4 == null) 	
			System.out.println("json4 no definido");
		System.out.println(json4);
        data.addJson(json4);   
	}
	
	public DataJsonTwitter getData() {
		return data;
	}
	 
	public void setAdress(String arg0) {
		fileSercher.setAddress(arg0);
		readProperties();
	}
}
