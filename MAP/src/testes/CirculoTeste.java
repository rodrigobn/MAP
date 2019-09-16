package testes;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exceptions.NumeroNegativoException;
import interfaces.FiguraGeometricaTeste;
import models.Circulo;

public class CirculoTeste implements FiguraGeometricaTeste{
	
	Circulo c1;
	
	@Test
	@Override
	public void isNull() {	
		// TODO Auto-generated method stub
		try {
			c1 = new Circulo(-1);
		} catch (Exception e) {
			// TODO: handle exception
			assertNull(c1);
		}		
	}
	@Test
	@Override
	public void isFiguraComplete() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		c1 = new Circulo(10);
		assertEquals(c1.getRaio(), 10);		
		c1.setRaio(20);
		assertEquals(c1.getRaio(), 20);
		
		try {
			c1.setRaio(-10);
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals(c1.getRaio(), 20);
		}		
	}
	@Test
	@Override
	public void figuraComParametroInvalido() {
		// TODO Auto-generated method stub
		try {
			c1 = new Circulo(-10);
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals(e.getMessage(), "Valor informado e invalido");
			assertNull(c1);
		}	
	}
	@Test
	@Override
	public void area() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		c1 = new Circulo(2);
		assertEquals(c1.area(), 12.56);
		
		c1.setRaio(3);
		assertEquals(c1.area(), 18.84);
	}
	@Test
	@Override
	public void perimetro() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		c1 = new Circulo(2);
		assertEquals(c1.perimetro(), 6.28);
		
		c1.setRaio(3);
		assertEquals(c1.perimetro(), 9.42);
	}

}
