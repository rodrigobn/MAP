package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Singleton.Retangulo;
import Singleton.Triangulo;

public class testRetangulo {
	
	@Test
	void testeIsosceles() {
		Retangulo retangulo1 = (Retangulo) Retangulo.getInstance();
		Triangulo retangulo2 = Retangulo.getInstance();
		
		assertEquals(retangulo1, retangulo2);
		
		assertEquals(retangulo1.getAltura(), retangulo2.getAltura());
		assertEquals(retangulo1.getBase(), retangulo2.getBase());
						
		assertEquals(retangulo1.getAltura(), 0);
		assertEquals(retangulo1.getBase(), 0);
		
		retangulo1.setAltura(10);
		retangulo2.setBase(10);
		
		retangulo1.setLargura(10);
		
		assertEquals(retangulo1, retangulo2);
		
		assertEquals(retangulo1.getAltura(), retangulo2.getAltura());
		assertEquals(retangulo1.getBase(), retangulo2.getBase());
		
		assertEquals(retangulo1.toString(), "Triangulo Retangulo");
		assertEquals(retangulo2.toString(), "Triangulo Retangulo");
	}
}
