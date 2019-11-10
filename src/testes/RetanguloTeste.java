package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ConcretsElements.Retangulo;
import exceptions.NumeroNegativoException;


class RetanguloTeste {
	Retangulo r1;
	
	@Test
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
	public void isFiguraComplete() throws NumeroNegativoException {
		// TODO Auto-generated method stub
		r1 = new Retangulo(2, 4);
		
		assertEquals(r1.getAltura(), 2);
		assertEquals(r1.getLargura(), 4);
	}
	@Test
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
	

}
