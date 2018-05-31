package TwitterJsonTests;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Analizador.CommentAnalyzer;
import Analizador.Informant;
import JsonTwitter.ReaderJsontTwitter;
import Twitter.ProxyTwitter;
import Twitter.ProxyTwitterImp;
import baterias_test.BateriaDeTest;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterObjectFactory;

public class CommnetAnalizeTest {
	List<String> jsons;
	List<Status> test1;
	List<Status> test2;
	@Before
	public void before() throws TwitterException {
		ReaderJsontTwitter reader = new ReaderJsontTwitter();
		reader.setAdress("src/main/java/JsonTwitter/AnalizadorJsonTest.properties");
		jsons=reader.getData().getJsons();
		test1 = new ArrayList<Status>();
		test1.add( TwitterObjectFactory.createStatus(jsons.get(0)));
		test1.add( TwitterObjectFactory.createStatus(jsons.get(1)));
		
		test2 = new ArrayList<Status>();
		test2.add( TwitterObjectFactory.createStatus(jsons.get(2)));
		test2.add( TwitterObjectFactory.createStatus(jsons.get(3)));	
	}
	
	@Test
	public void test() {
		CommentAnalyzer comment = new CommentAnalyzer(BateriaDeTest.damePlatos());
		List<Informant> informants= comment.analizarComentarios(test1);
		
		assertEquals(true,informants.size()==1); 
		assertEquals(true,informants.get(0).getPuntaje()==3.0);
		assertEquals(true,informants.get(0).getPlato().getNombre().equals("Fideos con tuco"));
	}
	@Test
	public void test2() {
		CommentAnalyzer comment = new CommentAnalyzer(BateriaDeTest.damePlatos());
		List<Informant> informants= comment.analizarComentarios(test2);
		
		assertEquals(true,informants.size()==1); 
		assertEquals(true,informants.get(0).getPuntaje()==-0.5);
		assertEquals(true,informants.get(0).getPlato().getNombre().equals("Fideos con tuco"));
	}
	
	

}
