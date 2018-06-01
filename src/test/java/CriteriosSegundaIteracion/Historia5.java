package CriteriosSegundaIteracion;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Twitter.ProxyTwitter;
import Twitter.ProxyTwitterImp;
import Twitter.TwitterApi;
import Twitter.TwitterConfiguration;
import propertiesTwitter.PropertiesLoader;
import twitter4j.TwitterException;

public class Historia5 {

	PropertiesLoader properties;
	
	@Before
	
	public void before() {
		properties = new PropertiesLoader();
	}
	
	@Test
	public void test() throws TwitterException {
		
		TwitterApi twitter = new TwitterApi(new TwitterConfiguration(properties));
		assertEquals( 2 ,twitter.obtenerTwitters().size()); 
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test(expected = TwitterException.class)
	public void test2() {
	
		properties.setAdress("src/main/java/propertiesTwitter/archivo2.properties");
		TwitterApi twitter = new TwitterApi(new TwitterConfiguration(properties));
		assertEquals(0,twitter.obtenerTwitters().size());
		thrown.expectMessage("Expected exception: twitter4j.TwitterException");
		
	}
}
