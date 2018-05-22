import static org.junit.Assert.*;

import org.junit.Test;

import Twitter.ProxyTwitter;
import Twitter.ProxyTwitterImp;
import twitter4j.TwitterException;

public class TwitterTest {

	@Test
	public void test() throws TwitterException {
		ProxyTwitter twitter= new ProxyTwitterImp("elconito94");
		assertEquals( 3 ,twitter.getTweet().size()); 
	}

}
