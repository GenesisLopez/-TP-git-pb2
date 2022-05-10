package ar.edu.unlam.pb2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FiguraTest {

	@Test
	public void hacerQueElColorDelRectanguloSeaBlanco () {
		
		Rectangulo rectangulo = new Rectangulo("Blanco", 2.0, 4.0);
		
		String valorEsperado = "Blanco";
		String valorObtenido = rectangulo.getColor();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void calcularElPerimetroDeUnRectangulo () {
		
		Rectangulo rectangulo = new Rectangulo("blanco", 2.0, 4.0);
		
		Double valorEsperado = 12.0;
		Double valorObtenido = rectangulo.calcularPerimetro();
		
		assertEquals(valorEsperado, valorObtenido);
		
	}

	@Test
	public void calcularElAreaDelRectangulo () {
		
		Rectangulo rectangulo = new Rectangulo("Blanco", 2.0, 4.0);
		
		Double valorEsperado = 8.0;
		Double valorObtenido = rectangulo.calcularArea();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	
	@Test
	public void hacerQueElColorDelCirculoSeaVerde () {
		
		Circulo circulo = new Circulo ("Verde",4.0);
		
		String valorEsperado = "Verde";
		String valorObtenido = circulo.getColor();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void calcularElPerimetroDelCirculo() {
		
		Circulo circulo = new Circulo("Verde",4.0);
		
		Double valorEsperado = 25.1327412287;
		Double valorObtenido = circulo.calcularPerimetro();
		
		assertEquals(valorEsperado, valorObtenido, 0.1);
	}
	
	@Test
	public void calcularElAreaDelCirculo() {
		
		Circulo circulo = new Circulo("Verde",4.0);
		
		Double valorEsperado = 50.2654824574;
		Double valorObtenido = circulo.calcularArea();
		
		assertEquals( valorEsperado, valorObtenido, 0.1);
	}
}
