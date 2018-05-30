package Twitter;


import java.util.ArrayList;
import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.User;

public class TwitterApi {
	private TwitterConfiguration configuration;
	private Twitter twitter;
	private Status status;
	
	
	public TwitterApi(TwitterConfiguration arg0) {
		configuration = arg0;
		twitter= configuration.getTwitter();

	}
	
	public void publicarTwit(String arg0) throws TwitterException {
		status = twitter.updateStatus(arg0);
	}
	
	
	
	@SuppressWarnings("finally")
	public List<Status> obtenerTwitters()  {
		
		List<Status> statuses = new ArrayList<Status>();
		try {
			
		String user;
        user = twitter.verifyCredentials().getScreenName();
        statuses = twitter.getUserTimeline();
     
         return statuses;
         
		} catch (TwitterException  e) {
			System.out.println("error, codigo: "+ e.getErrorCode()+ " usuario no existente");
		}
		finally {
			return statuses;
		}
	}
	
	

}
