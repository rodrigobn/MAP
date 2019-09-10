package Lab01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProfessorTeste {

	Disciplina d = new Disciplina(0, "Calculo 2", 10, 3, "segunda", 7);
	Disciplina d2 = new Disciplina(1, "Calculo 1", 10, 3, "Quarta", 7);
	Professor p = new Professor(0, "Onildo");
	
	
	@Test
	void testConstructor() {
		assertEquals(p.getID(), 0);
		assertEquals(p.getNome(), "Onildo");
		assertEquals(p.getDisciplinas().size(), 0);
				
	}
	
	@Test
	void testaAddDisciplina() {
		assertTrue(p.addDisciplina(d));		
		assertFalse(p.addDisciplina(d));		
		assertFalse(p.addDisciplina(null));
	}

}
