package modelo;

import java.util.List;

import Interface.ProxyPlatoInterface;
import Validadores.ValidadorPlato;

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
		List<Plato> platos = getPlatos();
		
		for(Plato p : platos)
			if(ValidadorPlato.isRight(p))
				ApiPlatos.add(p);

	}
	
	
	

}
