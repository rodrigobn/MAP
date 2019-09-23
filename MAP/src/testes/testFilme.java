package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import excecoes.NumeroNegativoException;
import excecoes.StringVaziaEsception;
import interfaces.Funcionario;
import models.Ator;
import models.Filme;

public class testFilme {
	
	Filme filme;
	
	@Test
	void testConstrutor() throws StringVaziaEsception, NumeroNegativoException{
		try {
			filme = new Filme("MIB", -2019);
			filme = new Filme("", 2019);
			filme = new Filme(null, 2019);
		} catch (StringVaziaEsception | NumeroNegativoException e) {
			e.getMessage();
		}
		
		assertEquals(filme, null);
		
		filme = new Filme("MIB", 2019);
		assertNotEquals(filme, null);
	}
	
	@Test
	void testAddFuncionario() throws StringVaziaEsception, NumeroNegativoException {
		Funcionario funcionario = new Ator("Rodrigo", 123);
		filme = new Filme("MIB", 2019);
		assertEquals(filme.getFuncionarios().size(), 0);
		
		filme.addFuncionario(funcionario);
		assertEquals(filme.getFuncionarios().size(), 1);
		
		filme.addFuncionario(funcionario);
		assertEquals(filme.getFuncionarios().size(), 1);
	}
	
	@Test
	void testCompareTo() throws StringVaziaEsception, NumeroNegativoException {
		filme = new Filme("MIB", 2019);
		Filme filme2 = new Filme("Batman", 2019);
		Filme filme3 = new Filme("MIB", 2019);
		
		assertEquals(filme.compareTo(filme2), -1);
		assertEquals(filme.compareTo(filme3), 0);
	}
	
}
