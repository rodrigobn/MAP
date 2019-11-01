package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Singleton.Equilatero;
import Singleton.Triangulo;

public class testEquilatero {

	@Test
	void testeEquilatero() {
		Triangulo equilatero1 = Equilatero.getInstance();
		Triangulo equilatero2 = Equilatero.getInstance();
		
		assertEquals(equilatero1, equilatero2);
		
		assertEquals(equilatero1.getAltura(), equilatero2.getAltura());
		assertEquals(equilatero1.getBase(), equilatero2.getBase());
						
		assertEquals(equilatero1.getAltura(), 0);
		assertEquals(equilatero1.getBase(), 0);
		
		equilatero1.setAltura(10);
		equilatero1.setBase(10);
		
		assertEquals(equilatero1, equilatero2);
		
		assertEquals(equilatero1.getAltura(), equilatero2.getAltura());
		assertEquals(equilatero1.getBase(), equilatero2.getBase());
		
		assertEquals(equilatero1.toString(), "Triangulo Equilatero");
		assertEquals(equilatero2.toString(), "Triangulo Equilatero");
	}
}
