package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import excecoes.NumeroNegativoException;
import excecoes.StringVaziaEsception;
import interfaces.Funcionario;
import models.Ator;
import models.Filme;
import models.Rh;

public class testRh {
	Funcionario funcionario;
	Filme filme;
	Rh rh = new Rh();
	
	@Test
	void testDelegaFilme() throws NumeroNegativoException, StringVaziaEsception {
		funcionario = new Ator("Rodrigo", 123);
		filme = new Filme("MIB", 2019);
		
		assertEquals(filme.getFuncionarios().size(), 0);
		
		rh.delegaFilme(filme, funcionario);
		assertEquals(filme.getFuncionarios().size(), 1);
		
		assertEquals(filme.getFuncionarios().get(0).getNome(), funcionario.getNome());
		
		rh.delegaFilme(filme, funcionario);
		assertEquals(filme.getFuncionarios().size(), 1);
	}
	
	@Test
	void testDefiniSalario() throws NumeroNegativoException, StringVaziaEsception {
		funcionario = new Ator("Rodrigo", 123);
		filme = new Filme("MIB", 2019);
		
		assertEquals(funcionario.getSalario(), 0);
		
		rh.definiSalario(funcionario, 2000);
		assertEquals(funcionario.getSalario(), 2000);
	}
}
