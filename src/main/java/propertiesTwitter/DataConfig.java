package propertiesTwitter;

public class DataConfig {
	
	private String ConsumerKey;
	private String ConsumerSecret;
	private String OAuthAccessToken;
	private String AccessTokenSecret;
	
	
	public DataConfig() {
	}

	public String getConsumerKey() {
		return ConsumerKey;
	}

	public void setConsumerKey(String arg0) {
		this.ConsumerKey = arg0;
	}

	public String getConsumerSecret() {
		return ConsumerSecret;
	}

	public void setConsumerSecret(String arg0) {
            this.ConsumerSecret = arg0;
     }
	
	public String getOAuthAccessToken() {
		return OAuthAccessToken;
	}

	public void setOAuthAccessToken(String arg0) {
            this.OAuthAccessToken = arg0;
     }
	
	public String getAccessTokenSecret() {
		return AccessTokenSecret;
	}

	public void setAccessTokenSecret(String arg0) {
            this.AccessTokenSecret = arg0;
     }
	
}
