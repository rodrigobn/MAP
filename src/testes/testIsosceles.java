package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Singleton.Isosceles;
import Singleton.Triangulo;

public class testIsosceles {
	
	@Test
	void testeIsosceles() {
		Triangulo isosceles1 = Isosceles.getInstance();
		Triangulo isosceles2 = Isosceles.getInstance();
		
		assertEquals(isosceles1, isosceles2);
		
		assertEquals(isosceles1.getAltura(), isosceles2.getAltura());
		assertEquals(isosceles1.getBase(), isosceles2.getBase());
						
		assertEquals(isosceles1.getAltura(), 0);
		assertEquals(isosceles1.getBase(), 0);
		
		isosceles1.setAltura(10);
		isosceles1.setBase(10);
		
		assertEquals(isosceles1, isosceles2);
		
		assertEquals(isosceles1.getAltura(), isosceles2.getAltura());
		assertEquals(isosceles1.getBase(), isosceles2.getBase());
		
		assertEquals(isosceles1.toString(), "Triangulo Isosceles");
		assertEquals(isosceles2.toString(), "Triangulo Isosceles");
	}

}
