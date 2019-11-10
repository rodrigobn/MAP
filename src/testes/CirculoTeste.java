package testes;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import ConcretsElements.Circulo;
import exceptions.NumeroNegativoException;

public class CirculoTeste{
	Circulo c1;
	
	@Test
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
	public void isFiguraComplete() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		c1 = new Circulo(10);
		assertEquals(c1.getRaio(), 10);		
		
	}
	@Test
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
}
