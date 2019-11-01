package testes;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Singleton.Quadrado;

public class testQuadrado {

	@Test
	void testeQuadrado() {
		Quadrado quadrado1 = Quadrado.getInstance();
		Quadrado quadrado2 = Quadrado.getInstance();
		
		assertNotEquals(quadrado1, quadrado2);
		
		assertEquals(quadrado1.getLado(), 0);
		quadrado1.setLado(10);
		assertEquals(quadrado1.getLado(), 10);
		
		assertEquals(quadrado1.toString(), "Quadrado ");
	}
}
