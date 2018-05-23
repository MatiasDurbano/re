package Twitter;
import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;

public interface ProxyTwitter {
	
	public List<Status> getTweet() throws TwitterException;
	
	public void publicarTweet(String arg0) throws TwitterException;
	

}
