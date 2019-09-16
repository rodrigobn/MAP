package testes;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exceptions.NumeroNegativoException;
import interfaces.FiguraGeometricaTeste;
import models.Retangulo;

class RetanguloTeste implements FiguraGeometricaTeste{
	
	Retangulo r1;
	
	@Test
	@Override
	public void isNull() {
		// TODO Auto-generated method stub
		try {
			r1 = new Retangulo(-1, -1);
		} catch (Exception e) {
			// TODO: handle exception
			assertNull(r1);	
		}
			
	}
	@Test
	@Override
	public void isFiguraComplete() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		r1 = new Retangulo(2, 4);
		
		assertEquals(r1.getAlturaRetangulo(), 2);
		assertEquals(r1.getLarguraRetangulo(), 4);
		
		r1.setAlturaRetangulo(6);
		r1.setLarguraRetangulo(8);
		assertEquals(r1.getAlturaRetangulo(), 6);
		assertEquals(r1.getLarguraRetangulo(), 8);
		
		try {
			r1.setAlturaRetangulo(-1);
			r1.setLarguraRetangulo(-1);			
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals(r1.getAlturaRetangulo(), 6);
			assertEquals(r1.getLarguraRetangulo(), 8);			
		}		
	}
	@Test
	@Override
	public void figuraComParametroInvalido() {
		// TODO Auto-generated method stub
		try {
			r1 = new Retangulo(-1, 1);
			r1 = new Retangulo(1, -1);
			r1 = new Retangulo(-1, -1);
		} catch (Exception e) {
			// TODO: handle exception
			assertNull(r1);
		}
		
	}
	@Test
	@Override
	public void area() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		r1 = new Retangulo(1, 1);
		assertEquals(r1.area(), 1);
		
		r1.setAlturaRetangulo(2);
		assertEquals(r1.area(), 2);
		
		r1.setLarguraRetangulo(2);
		assertEquals(r1.area(), 4);
		
		r1 = new Retangulo(0, 0);
		assertEquals(r1.area(), 0);
		
		r1.setLarguraRetangulo(1);
		assertEquals(r1.area(), 0);
		
		r1.setAlturaRetangulo(0);
		assertEquals(r1.area(), 0);		
	}
	@Test
	@Override
	public void perimetro() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		r1 = new Retangulo(1, 1);
		assertEquals(r1.perimetro(), 4);
		
		r1.setAlturaRetangulo(2);
		assertEquals(r1.perimetro(), 6);
		
		r1.setLarguraRetangulo(2);
		assertEquals(r1.perimetro(), 8);		
	}

}
