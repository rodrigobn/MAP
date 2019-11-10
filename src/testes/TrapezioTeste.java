package testes;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ConcretsElements.Trapezio;
import exceptions.NumeroNegativoException;

public class TrapezioTeste {
	
	Trapezio tr;
	
	@Test
	public void isNull() {
		try {
			tr = new Trapezio(-5, 15, 5, 5);
		} catch (NumeroNegativoException e) {
			// TODO Auto-generated catch block
			assertNull(tr);
		}
	}
	
	@Test
	public void isFiguraComplete() throws NumeroNegativoException {
		tr = new Trapezio(5, 15, 10, 5);
		assertEquals(tr.getAltura(), 10);
		assertEquals(tr.getBaseMaior(), 15);
		assertEquals(tr.getBaseMenor(), 5);
		assertEquals(tr.getLado(), 5);
		
	}
	
	@Test
	public void figuraComParametroInvalido() {
		// TODO Auto-generated method stub
		try {
			tr = new Trapezio(-5, 15, 5, 5);
		} catch (Exception e) {
			// TODO: handle exception
			assertEquals(e.getMessage(), "Valor informado e invalido");
			assertNull(tr);
		}	
	}

}
