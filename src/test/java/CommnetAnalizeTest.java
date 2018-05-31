import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Analizador.CommentAnalyzer;
import Analizador.Informant;
import Twitter.ProxyTwitter;
import Twitter.ProxyTwitterImp;
import baterias_test.BateriaDeTest;
import twitter4j.Status;

public class CommnetAnalizeTest {
	List<Status> twitterStatus;
	
	@Before
	public void before() {
		ProxyTwitter twitter= new ProxyTwitterImp();
		twitterStatus=twitter.getTweet();
	}
	
	@Test
	public void test() {
		CommentAnalyzer comment = new CommentAnalyzer(BateriaDeTest.damePlatos());
		List<Informant> informants= comment.analizarComentarios(twitterStatus);
		assertEquals(true,informants.size()==1);
		assertEquals(true,informants.get(0).getPuntaje()==3.0);
		assertEquals(true,informants.get(0).getPlato().getNombre().equals("Fideos con tuco"));
	}

}
