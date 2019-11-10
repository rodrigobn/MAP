package testes;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ConcretsElements.Triangulo;
import exceptions.NumeroNegativoException;

public class TrianguloTeste {
	
	Triangulo tri;
	
	@Test
	public void isNull() {
		try {
			tri = new Triangulo(-5, 10, 10);
		} catch (NumeroNegativoException e) {
			// TODO Auto-generated catch block
			assertNull(tri);
		}
	}
	
	@Test
	public void isFiguraComplete() throws NumeroNegativoException {
		tri = new Triangulo(5, 10, 10);
		assertEquals(tri.getLado(), 5);
		assertEquals(tri.getAltura(), 10);
		assertEquals(tri.getBase(), 10);
		
	}
	
	@Test
	public void figuraComParametroInvalido() {
		// TODO Auto-generated method stub
		try {
			tri = new Triangulo(-5, 10, 10);
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals(e.getMessage(), "Valor informado e invalido");
			assertNull(tri);
		}	
	}
}
