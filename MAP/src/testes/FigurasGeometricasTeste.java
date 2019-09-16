package testes;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import exceptions.FigurasDiferentesException;
import exceptions.NumeroNegativoException;
import interfaces.FiguraGeometricaTeste;
import models.Circulo;
import models.FigurasGeometricas;
import models.Quadrado;
import models.Retangulo;

public class FigurasGeometricasTeste implements FiguraGeometricaTeste {
	
	FigurasGeometricas figura;
	
	@Test
	@Override
	public void isNull() {
		assertNull(figura);
	}

	@Override
	public void isFiguraComplete() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		figura = new FigurasGeometricas(1, 1, 1, 1);
		assertTrue(figura.getCirculo() instanceof Circulo);
		assertTrue(figura.getQuadrado() instanceof Quadrado);
		assertTrue(figura.getRetangulo() instanceof Retangulo);
		
	}
	@Test
	@Override
	public void figuraComParametroInvalido() {
		// TODO Auto-generated method stub
		try {
			figura = new FigurasGeometricas(-1, -1, -1, -1);
		} catch (NumeroNegativoException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(), "Valor informado e invalido");
			assertNull(figura);
		}
		
	}
	@Test
	@Override
	public void area() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		figura = new FigurasGeometricas(1, 1, 1, 1);
		assertEquals(figura.getCirculo().area(), 6.28);
		assertEquals(figura.getQuadrado().area(), 1);
		assertEquals(figura.getRetangulo().area(), 1);
		
	}
	@Test
	@Override
	public void perimetro() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		figura = new FigurasGeometricas(1, 1, 1, 1);
		assertEquals(figura.getCirculo().perimetro(), 3.14);
		assertEquals(figura.getQuadrado().perimetro(), 4);
		assertEquals(figura.getRetangulo().perimetro(), 4);
		
	}
	@Test
	public void calculaMedia() throws NumeroNegativoException, FigurasDiferentesException {
		Quadrado quadrado = new Quadrado(10);
		Retangulo retangulo = new Retangulo(10, 10);
		figura = new FigurasGeometricas(1, 1, 1, 1);
		
		assertEquals(figura.calculaMedia(figura.getQuadrado(), quadrado), 50.5);
		
		try {			
			figura.calculaMedia(quadrado, retangulo);
		} catch (FigurasDiferentesException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(), "As figuras n�o s�o da mesma instancia");
		}
	}	
}
