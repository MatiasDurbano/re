import static org.junit.Assert.*;

import org.junit.Test;

import Twitter.Entry;
import Twitter.ProxyTwitter;
import Twitter.ProxyTwitterImp;
import twitter4j.Status;
import twitter4j.TwitterException;

public class EntryTest {

	@Test
	public void test() throws TwitterException {
		ProxyTwitter twitter= new ProxyTwitterImp("elconito94");
		BateriaDeTest bateria = new BateriaDeTest();
		Entry entry = new Entry(bateria.damePlatos());
		
		
		
		assertEquals(1,entry.verificadorDeFormato(twitter.getTweet()).size());
			
	}

}
