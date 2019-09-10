package Lab01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class DisciplinaTeste extends TestCase {
	
	Disciplina d = new Disciplina(0, "Calculo 2", 10, 3, "Segunda", 7);
	Aluno a = new Aluno(0, "Rodrigo");
	Aluno a2 = new Aluno(1, "Aline");
	
	
	@Test
	void testConstructor() {		
		assertEquals(d.getID(), 0);
		assertEquals(d.getNome(), "Calculo 2");
		assertEquals(d.getCapacidadeAlunos(), 10);
		assertEquals(d.getQuantidadeNotas(), 3);
	}
	
	@Test
	void testAddAluno() {
		d.addAluno(a);
		
		assertEquals(d.tamanhoDaTurma(), 1);
		assertEquals(d.getTurma().get(0).intValue(), 0);
		
		assertFalse(d.addAluno(a));
		assertTrue(d.addAluno(a2));
		
		for (int i = 2; i < d.getCapacidadeAlunos(); i++) {
			Aluno a = new Aluno(i, "i");
			d.addAluno(a);
		}
		
		assertEquals(d.tamanhoDaTurma(), d.getCapacidadeAlunos());
	}
	
	@Test
	void testTamanhoDaTurma () {
		assertEquals(d.tamanhoDaTurma(), 0);
		
		d.addAluno(a);		
		assertEquals(d.tamanhoDaTurma(), 1);
		
		for (int i = 0; i < d.getCapacidadeAlunos(); i++) {
			Aluno a = new Aluno(i, "i");
			d.addAluno(a);
		}
		
		assertEquals(d.tamanhoDaTurma(), d.getCapacidadeAlunos());
	}
	
	@Test
	void testAddHorario() {
		d.addHorario("terça", 7);
		assertTrue(d.getHorario().horario.containsKey("TERÇA"));
		assertTrue(d.getHorario().horario.containsValue(7));
		
		assertEquals(d.getHorario().horario.size(), 2);
		d.addHorario(null, 0);
		assertEquals(d.getHorario().horario.size(), 2);
	}
	
	@Test
	void testRemoveHorario() {
		d.removeHorario("segunda", 7);
		assertTrue(d.getHorario().horario.isEmpty());
		assertTrue(d.getHorario().horario.isEmpty());
		
		d.removeHorario(null, 0);
		assertEquals(d.getHorario().horario.size(), 0);
		
	}
}
