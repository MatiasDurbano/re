package TwitterJsonTests;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import Analizador.CommentAnalyzer;
import Analizador.Informant;
import Analizador.SearchEngineTweetsMock;
import baterias_test.BateriaDeTest;
import modelo.Plato;
import twitter4j.TwitterException;


public class CommnetAnalizeTest {
	
	Plato fideo;
	Plato arroz;
	@Before
	public void before()  {
		fideo = BateriaDeTest.damePlatos().get(0);
		arroz = BateriaDeTest.damePlatos().get(1);
	}
	
	@Test
	public void test() {
		CommentAnalyzer comment = new CommentAnalyzer(new SearchEngineTweetsMock());
		Informant informants= comment.analizarComentarios(fideo);
		
		assertEquals(true,informants.getPuntaje()==3.0);
		assertEquals(true,informants.getPlato().getNombre().equals("Fideos con tuco"));
	}
	@Test
	public void test2() {
		CommentAnalyzer comment = new CommentAnalyzer(new SearchEngineTweetsMock());
		Informant informants= comment.analizarComentarios(arroz);
		
		assertEquals(true,informants.getPuntaje()==-0.5);
		assertEquals(true,informants.getPlato().getNombre().equals("arroz con tuco"));
	}
	
	

}
