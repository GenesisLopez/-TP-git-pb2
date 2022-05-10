package ar.edu.unlam.pb2;

public class Circulo extends Figura{
	
	private Double radio;
	
	

	public Circulo(String color, Double radio) {
		super(color);
		this.radio = radio;
	}
	
	@Override
	public Double calcularArea() {
		
		Double resultado = (radio * radio) * Math.PI;
		return resultado;
	}
	@Override
	public Double calcularPerimetro() {
		Double resultado = Math.PI * radio * 2;
		return resultado;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

	
	
}
