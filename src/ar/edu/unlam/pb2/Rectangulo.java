package ar.edu.unlam.pb2;

public class Rectangulo extends Figura {

	private Double lado1;
	private Double lado2;

	public Rectangulo(String color, Double lado1, Double lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public Double calcularArea() {

		Double resultado = lado1 * lado2;
		return resultado;
	}

	@Override
	public Double calcularPerimetro() {

		Double resultado = (lado1 + lado2) * 2;
		return resultado;
	}

	public Double getLado1() {
		return lado1;
	}

	public void setLado1(Double lado1) {
		this.lado1 = lado1;
	}

	public Double getLado2() {
		return lado2;
	}

	public void setLado2(Double lado2) {
		this.lado2 = lado2;
	}
}
