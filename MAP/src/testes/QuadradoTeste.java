package testes;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import interfaces.FiguraGeometricaInterface;
import models.Quadrado;

class QuadradoTeste {

	@Test
	void testQuadrado() {
		Quadrado quadrado = null;
		
		try {
			quadrado = new Quadrado(-10);
			assertTrue(quadrado instanceof FiguraGeometricaInterface);
			assertTrue(quadrado instanceof Quadrado);
		} catch (Exception e) {
			e.getMessage();
		}
		
		assertNull(quadrado);
		
	}

	@Test
	void testArea() throws Exception {
		Quadrado quadrado1 = new Quadrado(10);
		assertEquals(quadrado1.area(), 20);
	}

	@Test
	void testPerimetro() throws Exception {
		Quadrado quadrado1 = new Quadrado(10);
		assertEquals(quadrado1.perimetro(), 40);
	}

	@Test
	void testGetLado() throws Exception {
		Quadrado quadrado1 = new Quadrado(10);
		assertEquals(quadrado1.getLado(), 10);
	}

	@Test
	void testSetLado() {
		Quadrado quadrado1 = null;
		try {
			quadrado1 = new Quadrado(10);
			quadrado1.setLado(20);
		} catch (Exception e) {
			e.getMessage();
		}		
		
		assertEquals(quadrado1.getLado(), 20);
		
		try {
			quadrado1.setLado(-10);
		} catch (Exception e) {
			e.getMessage();
		}
		
		assertEquals(quadrado1.getLado(), 20);
	}

	@Test
	void testCompareTo() throws Exception {
		Quadrado quadrado1 = new Quadrado(10);
		Quadrado quadrado2 = new Quadrado(20);
		assertEquals(quadrado1.compareTo(quadrado2), 0);
		
		quadrado2.setLado(10);
		assertEquals(quadrado1.compareTo(quadrado2), -1);
	}

	@Test
	void testCalculaMedia() throws Exception {
		Quadrado quadrado1 = new Quadrado(10);
		Quadrado quadrado2 = new Quadrado(20);
		assertEquals(quadrado1.calculaMedia(quadrado1, quadrado2), 30);
		
		quadrado2.setLado(10);
		assertEquals(quadrado1.calculaMedia(quadrado1, quadrado2), 20);
	}

}
