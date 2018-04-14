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
		return medicion;
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
	

}
