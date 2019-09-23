package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import excecoes.NumeroNegativoException;
import excecoes.StringVaziaEsception;
import interfaces.Funcionario;
import models.Ator;
import models.Filme;
import models.WarnerBros;

public class testWarnerBros {
	
	WarnerBros wb = new WarnerBros();
	Funcionario funcionario;
	Filme filme;
	
	@Test
	void testAddFilmeNovo() throws StringVaziaEsception, NumeroNegativoException {
		assertEquals(wb.getFilmes().size(), 0);
		filme = new Filme("Liga da Justiça", 2017);
		wb.addFilmeNovo(filme);
		assertEquals(wb.getFilmes().size(), 1);		
		wb.addFilmeNovo(filme);
		assertEquals(wb.getFilmes().size(), 1);
	}
}
