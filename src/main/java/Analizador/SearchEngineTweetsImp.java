package Analizador;

import java.util.ArrayList;
import java.util.List;

import Twitter.ProxyTwitter;
import Twitter.ProxyTwitterImp;
import twitter4j.Status;


public class SearchEngineTweetsImp implements SearchEngineTweets {
	
	List<Status> statues;
	ProxyTwitter twitter;
	public SearchEngineTweetsImp(){
		twitter = new ProxyTwitterImp();	
		statues= twitter.getTweet();
		
	}
	
	public List<Status> getStatus(){
		return statues;
	}

}
