package modelo;

import java.util.List;

import Interface.ProxyPlatoInterface;

public class ControllerDB {
	
	private ApiDB ApiPlatos;
	private ProxyPlatoInterface proxyPlato;
	
	public ControllerDB(ApiDB arg0, ProxyPlatoInterface arg1) {
		ApiPlatos = arg0;
		proxyPlato = arg1;
		actualizar();
	}
	
	
	public List<Plato> getPlatos(){
		return proxyPlato.getPlatos();
	}
	
	private void actualizar() {
		List<Plato> platos = proxyPlato.getPlatos();
		
		for(Plato p : platos)
			ApiPlatos.add(p);
		
	}
	
	
	

}
