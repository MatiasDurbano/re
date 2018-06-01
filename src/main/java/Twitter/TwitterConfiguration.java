package Twitter;

import propertiesTwitter.DataConfig;
import propertiesTwitter.PropertiesLoaderTwitter;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterConfiguration {
	
	
	private ConfigurationBuilder config ;
	private TwitterFactory tf ;
	private Twitter twitter;

	PropertiesLoaderTwitter properties ;
		
	public TwitterConfiguration(PropertiesLoaderTwitter arg0) {
		properties = arg0;
		DataConfig data= properties.getDataConfig();
		
		config  = new ConfigurationBuilder();
		config.setDebugEnabled(true)
		.setOAuthConsumerKey(data.getConsumerKey())
        .setOAuthConsumerSecret(data.getConsumerSecret())
        .setOAuthAccessToken(data.getOAuthAccessToken())
        .setOAuthAccessTokenSecret(data.getAccessTokenSecret())
        .setJSONStoreEnabled(true);
		tf = new TwitterFactory(config.build());
		twitter = tf.getInstance();
		
	}
	
	public Twitter getTwitter() {
		return this.twitter;
	}
	
	
	
}
