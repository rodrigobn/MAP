package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Singleton.Circulo;

public class testeCirculo {

	@Test
	void testCirculo() {
		Circulo circulo1 = Circulo.getInstance();
		Circulo circulo2 = Circulo.getInstance();
		assertEquals(circulo1, circulo2);
		
		assertEquals(circulo1.getRaio(), circulo2.getRaio());
						
		assertEquals(circulo1.getRaio(), 0);
		assertEquals(circulo2.getRaio(), 0);
		
		circulo1.setRaio(10);
		
		assertEquals(circulo1.getRaio(), 10);
		assertEquals(circulo1.getRaio(), circulo2.getRaio());
		
		assertEquals(circulo1.toString(), "Circulo");
		
	}
}
