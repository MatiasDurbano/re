package modelo;


public class Cantidad 
{
	private Medicion medicion;
	private double valor;
	
	public Cantidad(Medicion medicion, double valor){
		this.medicion = medicion;
		this.valor = valor;
		
	}

	public Medicion getMedicion() {
		return this.medicion;
	}

	public void setMedicion(Medicion medicion) {
		this.medicion = medicion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if(arg0 == null) return false;
		if(!(arg0 instanceof Cantidad)) return false;
		
		Cantidad cant= (Cantidad) arg0;
		
		if(valor == cant.getValor() && this.medicion.equals(cant.getMedicion())) return true;   
		 
		return false;
	}

	@Override
	public String toString() 
	{
		return valor + medicion.toString();
	}	
}
