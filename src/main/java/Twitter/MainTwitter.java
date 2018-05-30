package Twitter;

import twitter4j.TwitterException;

public class MainTwitter {

	public static void main(String[] args) throws TwitterException {
		ProxyTwitter proxy = new ProxyTwitterImp();
		proxy.getTweet();
		
	}

}
