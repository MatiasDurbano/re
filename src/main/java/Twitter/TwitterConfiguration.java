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

	final private String ConsumerKey = "PbyHTI9dAwJLY3WZY3ITLgt9i";
	final private String ConsumerSecret ="euIqLIT3HzHoXfpsCAht8evh7saQGgPytn1Yznx4A3O50jLvVK";
	final private String OAuthAccessToken ="489600798-0FsdR9M4oT2Imd9uaQWQryzNFESEsOSBa6Rfa0Tw";
	final private String AccessTokenSecret = "bFs1J80brFYaPsvVv2f6c6lFudlYVuFKfUuNKUrcEGN0Z";
	
	public TwitterConfiguration(String usuario) throws TwitterException{
		config  = new ConfigurationBuilder();
		config.setDebugEnabled(true)
		  .setOAuthConsumerKey(ConsumerKey)
		  .setOAuthConsumerSecret(ConsumerSecret)
		  .setOAuthAccessToken(OAuthAccessToken)
		  .setOAuthAccessTokenSecret(AccessTokenSecret);
		tf = new TwitterFactory(config.build());
		twitter = tf.getInstance();
		this.user = usuario;
	}
	
	public Twitter getTwitter() {
		return this.twitter;
	}
	
	public String getUser() {
		return user;
	}
	
}
