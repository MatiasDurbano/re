package JsonTwitter;

import java.util.ArrayList;
import java.util.List;

public class DataJsonTwitter {
	List<String> jsons;
	
	public DataJsonTwitter() {
		jsons= new ArrayList<String>();
	}

	public void addJson(String arg0) {
		jsons.add(arg0);
		System.out.println(jsons.size());
	}
	
	public List<String> getJsons(){
		return jsons;
	}
}
