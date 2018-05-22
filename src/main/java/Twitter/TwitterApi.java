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
	private User user;
	
	public TwitterApi(TwitterConfiguration arg0) throws TwitterException {
		configuration = arg0;
		twitter= configuration.getTwitter();
		user = twitter.showUser(arg0.getUser());
	}
	
	public void publicarTwit(String arg0) throws TwitterException {
		status = twitter.updateStatus(arg0);
	}
	
	
	
	public List<Status> obtenerTwitters() throws TwitterException {
		
		List<Status> statuses = new ArrayList<Status>();
		String user;
        user = twitter.verifyCredentials().getScreenName();
        statuses = twitter.getUserTimeline();
     
         System.out.println("Mostrando @" + user);
         for (Status status : statuses) {
             System.out.println("@" + status.getUser().getScreenName() + " - " + status.getText());
          }
         return statuses;
         
	}
	
	

}
