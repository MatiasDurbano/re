package Twitter;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterConfiguration {
	
	
	private ConfigurationBuilder config ;
	private TwitterFactory tf ;
	private Twitter twitter;
	private String user;

	
	
	public TwitterConfiguration(String arg0) throws TwitterException{
		config  = new ConfigurationBuilder();
		config.setDebugEnabled(true)
		  .setOAuthConsumerKey("PbyHTI9dAwJLY3WZY3ITLgt9i")
		  .setOAuthConsumerSecret("euIqLIT3HzHoXfpsCAht8evh7saQGgPytn1Yznx4A3O50jLvVK")
		  .setOAuthAccessToken("489600798-0FsdR9M4oT2Imd9uaQWQryzNFESEsOSBa6Rfa0Tw")
		  .setOAuthAccessTokenSecret("bFs1J80brFYaPsvVv2f6c6lFudlYVuFKfUuNKUrcEGN0Z");
		tf = new TwitterFactory(config.build());
		twitter = tf.getInstance();
		this.user = arg0;
	}
	
	public Twitter getTwitter() {
		return this.twitter;
	}
	
	public String getUser() {
		return user;
	}
	
}
