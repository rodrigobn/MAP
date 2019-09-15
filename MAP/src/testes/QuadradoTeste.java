package testes;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import exceptions.NumeroNegativoException;
import interfaces.FiguraGeometricaInterface;
import interfaces.FiguraGeometricaTeste;
import models.Quadrado;

class QuadradoTeste implements FiguraGeometricaTeste{

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

	@Override
	public void isNull() {
		Quadrado quadrado = null;
		
		assertNull(quadrado);
	
		
	}
	@Test
	@Override
	public void isFiguraComplete() throws NumeroNegativoException {
		Quadrado quadrado = new Quadrado(10);
		
		assertEquals(quadrado.getLado(), 10);
	}
	@Test
	@Override
	public void figuraComParametroInvalido() {
		
		try {
			Quadrado quadrado1 = new Quadrado(-1);
		} catch (NumeroNegativoException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(), "Valor informado e invalido");
		}
	}
	@Test
	@Override
	public void area() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		Quadrado quadrado1 = new Quadrado(10);
		assertEquals(quadrado1.area(), 20);
		
	}
	@Test
	@Override
	public void perimetro() throws NumeroNegativoException {
		Quadrado quadrado1 = new Quadrado(10);
		assertEquals(quadrado1.perimetro(), 40);
		
	}


}
