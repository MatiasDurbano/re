package modelo;

import java.util.List;

public class Collector implements DataCollector{
	
	ApiDB apiDB;
	
	public Collector(ApiDB arg0) {
		this.apiDB = arg0;
	}
	
	public List<Plato> getPlatos(){
		return apiDB.get();
	}

}
