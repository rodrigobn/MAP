package Lab01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ControleAcademicoTeste {
	
	ControleAcademico c = new ControleAcademico();
	
	Disciplina d1 = new Disciplina(0, "Calculo 1", 10, 3, "Segunda", 7);
	Disciplina d2 = new Disciplina(1, "Calculo 2", 10, 3, "Terça", 7);
	Disciplina d3 = new Disciplina(2, "MAP", 10, 3, "Quarta", 7);
	Disciplina d4 = new Disciplina(3, "Algebra Linear", 10, 3, "quinta", 7);
	Disciplina d5 = new Disciplina(4, "OAC", 10, 3, "sexta", 7);
	Disciplina d6 = new Disciplina(5, "LOAC", 10, 3, "segunda", 7);
	
	Professor p1 = new Professor(0, "Onildo");
	Professor p2 = new Professor(1, "Sabrina");
	
	Aluno a1 = new Aluno(0, "Rodrigo");
	Aluno a2 = new Aluno(1, "Aline");
	Aluno a3 = new Aluno(2, "João");
	
		
	@Test
	void testConstructor() {
		assertEquals(c.getAlunos().size(), 0);
		assertEquals(c.getProfessores().size(), 0);
		assertEquals(c.getDisciplinas().size(), 0);
	}
	@Test
	void testMatriculaAluno() {		
		c.matricularAluno(a1, d1);
		//teste para matricuas iguais
		c.matricularAluno(a2, d1);
		c.matricularAluno(a2, d1);
		
		assertEquals(d1.getTurma().size(), 2);
		assertEquals(d1.getTurma().get(0), 0);
		assertEquals(d1.getTurma().get(1), 1);
		
		//teste para matricular em outras disciplinas
		c.matricularAluno(a1, d2);
		
		assertEquals(d2.getTurma().size(), 1);
		assertEquals(d2.getTurma().get(0), 0);
		
		//teste para matricular aluno que tenha um horario indispoivel
		c.matricularAluno(a1, d6);
		assertEquals(d2.getTurma().size(), 1);
		assertEquals(d2.getTurma().get(0), 0);
		//assertEquals(a1.getDisciplinas().size(), 2);
	}
	@Test
	void testMatriculaProfessor() {
		c.professores.add(p1);
		c.professores.add(p2);
		
		c.disciplinas.add(d1);
		c.disciplinas.add(d2);
		c.disciplinas.add(d3);
		c.disciplinas.add(d4);
		c.disciplinas.add(d5);
		c.disciplinas.add(d6);
		
		//teste para matricuas iguais
		c.matricularProfessor(p1, d1);
		c.matricularProfessor(p1, d1);
		
		assertEquals(p1.getDisciplinas().size(), 1);
		
		//teste para matricuar dois professores na mesma disciplina
		c.matricularProfessor(p2, d1);
		assertEquals(p1.getDisciplinas().size(), 1);
		assertEquals(p2.getDisciplinas().size(), 0);
		
		//teste para matricular em outras disciplinas
		c.matricularProfessor(p1, d2);
		assertEquals(p1.getDisciplinas().size(), 2);
		
		//teste para matricular professore que tenha um horario indispoivel
		c.matricularProfessor(p1, d6);
		//assertEquals(p1.getDisciplinas().size(), 2);
	}
	
	@Test
	void testGetDiasMatriculados() {
		c.professores.add(p1);
		c.professores.add(p2);
		
		c.disciplinas.add(d1);
		c.disciplinas.add(d2);
		
		assertEquals(c.getDiasMatriculados(a1).size(), 0);
		c.matricularAluno(a1, d1);
		assertEquals(c.getDiasMatriculados(a1).size(), 1);
		c.matricularAluno(a1, d2);		
		assertEquals(c.getDiasMatriculados(a1).size(), 2);
	}
}
