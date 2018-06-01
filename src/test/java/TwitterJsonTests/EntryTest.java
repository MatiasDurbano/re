package TwitterJsonTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import JsonTwitter.ReaderJsontTwitter;
import Twitter.Entry;
import baterias_test.BateriaDeTest;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterObjectFactory;

public class EntryTest {

	List<String> jsons;
	List<Status> test1;
	List<Status> test2;

	@Before
	public void before() throws TwitterException {
		ReaderJsontTwitter reader = new ReaderJsontTwitter();
		reader.setAdress("src/main/java/JsonTwitter/JsonTwitter.properties");
		jsons=reader.getData().getJsons();
		test1 = new ArrayList<Status>();
		test1.add( TwitterObjectFactory.createStatus(jsons.get(0)));
		test1.add( TwitterObjectFactory.createStatus(jsons.get(1)));
		
		test2 = new ArrayList<Status>();
		test2.add( TwitterObjectFactory.createStatus(jsons.get(2)));
		test2.add( TwitterObjectFactory.createStatus(jsons.get(3)));	
	}
	
	
	@Test
	public void test1() throws TwitterException {
		Entry entry = new Entry(BateriaDeTest.damePlatos());
		assertEquals(2,entry.verificadorDeFormato(test1).size());
		assertEquals(true,entry.verificadorDeFormato(test1).equals(test1));
			
	} 
	
	@Test
	public void test2() throws TwitterException {
		Entry entry = new Entry(BateriaDeTest.damePlatos());
		assertEquals(0,entry.verificadorDeFormato(test2).size());
		assertEquals(false,entry.verificadorDeFormato(test2).equals(test2));
			 
	} 

}
