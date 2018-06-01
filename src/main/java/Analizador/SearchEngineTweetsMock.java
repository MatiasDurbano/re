package Analizador;

import java.util.ArrayList;
import java.util.List;

import JsonTwitter.ReaderJsontTwitter;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterObjectFactory;

public class SearchEngineTweetsMock implements SearchEngineTweets {

	List<String> jsons;
	List<Status> test1;
	List<Status> test2;
	public  SearchEngineTweetsMock() {
		
	}
	@Override
	public List<Status> getStatus() {
		ReaderJsontTwitter reader = new ReaderJsontTwitter();
		reader.setAdress("src/main/java/JsonTwitter/AnalizadorJsonTest.properties");
		jsons=reader.getData().getJsons();
		test1 = new ArrayList<Status>();
		try {
		test1.add( TwitterObjectFactory.createStatus(jsons.get(0)));	
		test1.add( TwitterObjectFactory.createStatus(jsons.get(1)));
		test1.add( TwitterObjectFactory.createStatus(jsons.get(2)));
		test1.add( TwitterObjectFactory.createStatus(jsons.get(3)));
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return test1;
	}

}
