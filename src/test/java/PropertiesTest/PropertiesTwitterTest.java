package PropertiesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import propertiesTwitter.DataConfig;
import propertiesTwitter.PropertiesLoader;

public class PropertiesTwitterTest {

	@Test
	public void test() {
		PropertiesLoader properties = new PropertiesLoader();
		DataConfig data= properties.getDataConfig();
		assertEquals(true,data.getAccessTokenSecret().equals("bFs1J80brFYaPsvVv2f6c6lFudlYVuFKfUuNKUrcEGN0Z"));
		assertEquals(true,data.getConsumerKey().equals("PbyHTI9dAwJLY3WZY3ITLgt9i"));
		assertEquals(true,data.getConsumerSecret().equals("euIqLIT3HzHoXfpsCAht8evh7saQGgPytn1Yznx4A3O50jLvVK"));
		assertEquals(true,data.getOAuthAccessToken().equals("489600798-0FsdR9M4oT2Imd9uaQWQryzNFESEsOSBa6Rfa0Tw"));
	}
	
	@Test
	public void test2() {
		PropertiesLoader properties = new PropertiesLoader();
		properties.setAdress("src/main/java/propertiesTwitter/archivo2.properties");	
		DataConfig data= properties.getDataConfig();
		
		assertEquals(true,data.getAccessTokenSecret().equals("bFs1J80brFYaPsvVv2f6c6lFudlYVuFKfUuNKUrcEGN0Z"));
		assertEquals(true,data.getConsumerKey().equals(""));
		assertEquals(true,data.getConsumerSecret().equals("euIqLIT3HzHoXfpsCAht8evh7saQGgPytn1Yznx4A3O50jLvVK"));
		assertEquals(true,data.getOAuthAccessToken().equals(""));
	}
  
}
