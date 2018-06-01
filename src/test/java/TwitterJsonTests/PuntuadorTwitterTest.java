package TwitterJsonTests;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Analizador.CommentAnalyzer;
import Analizador.SearchEngineTweetsMock;
import Puntuador.PuntuadorTwitter;
import baterias_test.BateriaDeTest;
import modelo.Plato;

public class PuntuadorTwitterTest {
	
	Plato fideo;
	Plato arroz;
	PuntuadorTwitter puntuador;
	@Before
	public void before()  {
		fideo = BateriaDeTest.damePlatos().get(0);
		arroz = BateriaDeTest.damePlatos().get(1);
		CommentAnalyzer comment= new CommentAnalyzer(new SearchEngineTweetsMock());
		puntuador = new PuntuadorTwitter(comment,10);
		
	} 
	
	@Test
	public void test() {
		assertEquals(true,puntuador.pedirPuntaje(fideo)==30);
		assertEquals(true,puntuador.getMap().get(fideo)==30);
		
	}
	
	@Test
	public void test2() {
		assertEquals(true,puntuador.pedirPuntaje(arroz)==-5.0);
		assertEquals(true,puntuador.getMap().get(arroz)==-5.0);
	}

}
