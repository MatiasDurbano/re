package propertiesTwitter;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import propertiesTwitter.AbsolutFileSearch;
import propertiesTwitter.DataConfig;
import properties.PropertiesFileSearch;

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
			this.readConsumerKey();
			this.readConsumerSecret();
			this.readOAuthAccessToken();
			this.readAccessTokenSecret();
			}
		catch (IOException e) {
			System.out.println("no se puede leer el archivo properties");
		}
	}
	
	public void readConsumerKey() {
		String ConsumerKey = properties.getProperty("ConsumerKey");
		if(ConsumerKey == null) 	
			System.out.println("ConsumerKey no definido");				
		data.setConsumerKey(ConsumerKey);
		
	}
	
	public void readConsumerSecret() {
		String ConsumerSecret = properties.getProperty("ConsumerSecret");
		if(ConsumerSecret == null) 	
			System.out.println("ConsumerSecret no definido");
        data.setConsumerSecret(ConsumerSecret);   
      
      
	}
	
	public void readOAuthAccessToken() {
		String OAuthAccessToken = properties.getProperty("OAuthAccessToken");
		if(OAuthAccessToken == null) 	
			System.out.println("OAuthAccessToken no definido");
        data.setOAuthAccessToken(OAuthAccessToken);
     
      
	}
	
	public void readAccessTokenSecret() {
		String AccessTokenSecret = properties.getProperty("AccessTokenSecret");
		if(AccessTokenSecret == null) 	
			System.out.println("AccessTokenSecret no definido");
        data.setAccessTokenSecret(AccessTokenSecret);            
     
	}
	 
	public DataConfig getDataConfig() {
		return data;
	}
	
	public void setAdress(String arg0) {
		fileSercher.setAddress(arg0);
		readProperties();
	}
	
}
