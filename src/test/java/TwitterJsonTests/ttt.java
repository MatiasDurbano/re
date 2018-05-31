package TwitterJsonTests;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Twitter.Entry;
import Twitter.ProxyTwitter;
import Twitter.ProxyTwitterImp;
import JsonTwitter.ReaderJsontTwitter;

import baterias_test.BateriaDeTest;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterObjectFactory;


public class ttt {
	List<String> jsons;
	Status status;
	Status status2;
	List<Status> statues;
	
	@Before
	public void before() throws TwitterException {
		jsons= new ArrayList<String>();
		ReaderJsontTwitter reader = new ReaderJsontTwitter();
		reader.setAdress("src/main/java/JsonTwitter/JsonTwitter.properties");
		jsons=reader.getData().getJsons();
		
		
		
		Status status = TwitterObjectFactory.createStatus(jsons.get(0));
		Status status2 = TwitterObjectFactory.createStatus(jsons.get(1));
		
		statues = new ArrayList<Status>();
		
		System.out.println(status.getText());
		System.out.println(status2.getText());
		
		statues.add(status);
		statues.add(status2);
		
	}
	
	@Test
	public void test() throws TwitterException {
		BateriaDeTest bateria = new BateriaDeTest();
		Entry entry = new Entry(bateria.damePlatos());
		assertEquals(2, entry.verificadorDeFormato(statues).size());
		
		
	/*	
		ProxyTwitter twitter= new ProxyTwitterImp();
		//Status status = TwitterObjectFactory.createStatus(jsonStatus); //no problem here
		
		String a ="{\"in_reply_to_status_id_str\":null,\"in_reply_to_status_id\":null,\"coordinates\":null,\"created_at\":\"Mon May 21 14:19:22 +0000 2018\",\"truncated\":false,\"in_reply_to_user_id_str\":null,\"source\":\"<a href=\\\"http://twitter.com\\\" rel=\\\"nofollow\\\">Twitter Web Client<\\/a>\",\"retweet_count\":0,\"retweeted\":false,\"geo\":null,\"in_reply_to_screen_name\":null,\"is_quote_status\":false,\"entities\":{\"urls\":[],\"hashtags\":[],\"user_mentions\":[],\"symbols\":[]},\"id_str\":\"998568938333265920\",\"in_reply_to_user_id\":null,\"favorite_count\":0,\"id\":998568938333265920,\"text\":\"fideos con tuco muy bueno - prueba de api\",\"place\":null,\"contributors\":null,\"lang\":\"es\",\"user\":{\"utc_offset\":null,\"friends_count\":14,\"profile_image_url_https\":\"https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"listed_count\":0,\"profile_background_image_url\":\"http://abs.twimg.com/images/themes/theme1/bg.png\",\"default_profile_image\":true,\"favourites_count\":0,\"description\":\"\",\"created_at\":\"Sat Feb 11 17:58:59 +0000 2012\",\"is_translator\":false,\"profile_background_image_url_https\":\"https://abs.twimg.com/images/themes/theme1/bg.png\",\"protected\":false,\"screen_name\":\"elconito94\",\"id_str\":\"489600798\",\"profile_link_color\":\"1DA1F2\",\"is_translation_enabled\":false,\"translator_type\":\"none\",\"id\":489600798,\"geo_enabled\":false,\"profile_background_color\":\"C0DEED\",\"lang\":\"es\",\"has_extended_profile\":false,\"profile_sidebar_border_color\":\"C0DEED\",\"profile_text_color\":\"333333\",\"verified\":false,\"profile_image_url\":\"http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png\",\"time_zone\":null,\"url\":null,\"contributors_enabled\":false,\"profile_background_tile\":false,\"entities\":{\"description\":{\"urls\":[]}},\"statuses_count\":2,\"follow_request_sent\":false,\"followers_count\":5,\"profile_use_background_image\":true,\"default_profile\":true,\"following\":false,\"name\":\"matias durbano\",\"location\":\"\",\"profile_sidebar_fill_color\":\"DDEEF6\",\"notifications\":false},\"favorited\":false}";
		
		String jsonUser = TwitterObjectFactory.getRawJSON(twitter.getTweet().get(0));

		Status status = TwitterObjectFactory.createStatus(a);
		
		//System.out.println(jsonUser.length() + " vs "+ a.length());
		//System.out.println(a);
		//System.out.println(jsonUser);
		//assertEquals(true,a.equals(jsonUser));
		System.out.println(status.getText());
		
		
		
		//{"in_reply_to_status_id_str":null,"in_reply_to_status_id":null,"coordinates":null,"created_at":"Mon May 21 14:19:22 +0000 2018","truncated":false,"in_reply_to_user_id_str":null,"source":"<a href=\"http://twitter.com\" rel=\"nofollow\">Twitter Web Client<\/a>","retweet_count":0,"retweeted":false,"geo":null,"in_reply_to_screen_name":null,"is_quote_status":false,"entities":{"urls":[],"hashtags":[],"user_mentions":[],"symbols":[]},"id_str":"998568938333265920","in_reply_to_user_id":null,"favorite_count":0,"id":998568938333265920,"text":"fideos con tuco muy bueno - prueba de api","place":null,"contributors":null,"lang":"es","user":{"utc_offset":null,"friends_count":14,"profile_image_url_https":"https://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png","listed_count":0,"profile_background_image_url":"http://abs.twimg.com/images/themes/theme1/bg.png","default_profile_image":true,"favourites_count":0,"description":"","created_at":"Sat Feb 11 17:58:59 +0000 2012","is_translator":false,"profile_background_image_url_https":"https://abs.twimg.com/images/themes/theme1/bg.png","protected":false,"screen_name":"elconito94","id_str":"489600798","profile_link_color":"1DA1F2","is_translation_enabled":false,"translator_type":"none","id":489600798,"geo_enabled":false,"profile_background_color":"C0DEED","lang":"es","has_extended_profile":false,"profile_sidebar_border_color":"C0DEED","profile_text_color":"333333","verified":false,"profile_image_url":"http://abs.twimg.com/sticky/default_profile_images/default_profile_normal.png","time_zone":null,"url":null,"contributors_enabled":false,"profile_background_tile":false,"entities":{"description":{"urls":[]}},"statuses_count":2,"follow_request_sent":false,"followers_count":5,"profile_use_background_image":true,"default_profile":true,"following":false,"name":"matias durbano","location":"","profile_sidebar_fill_color":"DDEEF6","notifications":false},"favorited":false}
	
	*/
	}

}
