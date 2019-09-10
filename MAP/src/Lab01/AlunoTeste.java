package Lab01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlunoTeste {

	Disciplina d = new Disciplina(0, "Calculo 2", 10, 3, "segunda", 7);
	Disciplina d2 = new Disciplina(1, "Calculo 1", 10, 3, "Quarta", 7);
	Aluno a = new Aluno(0, "Rodrigo");
	Aluno a2 = new Aluno(1, "Aline");
	
	@Test
	void testaConstructor() {
		assertEquals(a.getID(), 0);
		assertEquals(a.getNome(), "Rodrigo");
		assertEquals(a.getDisciplinas().size(), 0);
				
	}
	
	@Test
	void testaAddDisciplina () {
		/*Adiciona o ID da diciplina na lista do aluno*/
		assertTrue(a.addDisciplina(d));		
		assertFalse(a.addDisciplina(d));
		assertFalse(a.addDisciplina(null));
	}

}
