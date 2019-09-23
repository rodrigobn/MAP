package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import excecoes.NumeroNegativoException;
import excecoes.StringVaziaEsception;
import interfaces.Funcionario;
import models.Ator;

public class testAtor {
	Funcionario funcionario;
	
	@Test
	void testConstrutor() throws NumeroNegativoException, StringVaziaEsception {
		try {
			funcionario = new Ator("Rodrigo", -123);
		}
		catch (NumeroNegativoException e) {			
			e.getMessage();
		}
		try {

			funcionario = new Ator("", 123);
			funcionario = new Ator(null, 123);
		} catch (StringVaziaEsception e) {
			e.getMessage();
		}
		
		assertEquals(funcionario, null);
		
		Ator funcAtor = new Ator("Aline", 456);
		assertTrue(funcAtor instanceof Funcionario);
	}
	
	@Test
	void testCompareTo() throws NumeroNegativoException, StringVaziaEsception {
		funcionario = new Ator("Rodrigo", 123);
		Ator funcAtor = new Ator("Aline", 123);
		
		assertEquals(funcAtor.compareTo(funcAtor), 0);
		
	}
	
	@Test
	void testSetFuncao() throws NumeroNegativoException, StringVaziaEsception {
		funcionario = new Ator("Rodrigo", 123);		
		assertEquals(funcionario.getFuncao(), "Ator");
		try {
			funcionario.setFuncao("");
			funcionario.setFuncao(null);
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(funcionario.getFuncao(), "Ator");
		
		assertTrue(funcionario.setFuncao("Diretor"));
		assertEquals(funcionario.getFuncao(), "Diretor");
	}
	
	@Test
	void testSetSalario() throws NumeroNegativoException, StringVaziaEsception {
		funcionario = new Ator("Rodrigo", 123);
		try {
			funcionario.setSalario(-1000);
		} catch (Exception e) {
			e.getMessage();
		}
		assertEquals(funcionario.getSalario(), 0);
		
		assertTrue(funcionario.setSalario(1000));
		assertEquals(funcionario.getSalario(), 1000);
	}

}
