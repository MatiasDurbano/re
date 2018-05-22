package Twitter;
import java.util.ArrayList;
import java.util.List;

import modelo.Plato;
import twitter4j.Status;
public class Entry {
	
	List<Plato> platos;
	
	public Entry(List<Plato> arg0) {
		
		platos=arg0;
	}

	public List<Status> verificadorDeFormato(List<Status> arg0){
		List<Status> ret = new ArrayList<Status>();
		for(Status status: arg0) {
			String text = status.getText().toLowerCase();
			for(Plato plato : platos) {
				if(text.contains(plato.getNombre().toLowerCase()) && text.contains("muy bueno")
						|| text.contains("malo")) {
					ret.add(status); 
				}
			}
		}
		return ret;
		
	}
	
}
