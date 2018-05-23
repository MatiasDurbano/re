package Twitter;
import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;

public class ProxyTwitterImp implements ProxyTwitter {
	
	TwitterApi twitter;
	
	public ProxyTwitterImp(String arg0) throws TwitterException{
		twitter = new TwitterApi(new TwitterConfiguration(arg0));
	}

	@Override
	public List<Status> getTweet() throws TwitterException {
		return twitter.obtenerTwitters();
	}

	@Override
	public void publicarTweet(String arg0) throws TwitterException {
		twitter.publicarTwit(arg0);
		
	}

}
