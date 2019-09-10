package Lab01;

import java.util.ArrayList;
import java.util.Collection;

public class ControleAcademico {
		ArrayList<Aluno> alunos;
		ArrayList<Professor> professores;
		ArrayList<Disciplina> disciplinas;
		
	public ControleAcademico() {
		this.alunos = new ArrayList<Aluno>();
		this.professores = new ArrayList<Professor>();
		this.disciplinas = new ArrayList<Disciplina>();
	}
	
	public boolean matricularAluno(Aluno aluno, Disciplina disciplina) {
		ArrayList<String> diasMatriculadosDoAluno = this.getDiasMatriculados(aluno);
		Collection<Integer> horariosDaDisciplina = disciplina.getHorario().horario.values();
		boolean condicao = true;
		
		if (diasMatriculadosDoAluno.isEmpty()) {
			disciplina.addAluno(aluno);
			aluno.addDisciplina(disciplina);
			return true;
		}
		if (condicao) {
			disciplina.addAluno(aluno);
			aluno.addDisciplina(disciplina);
			return true;
		} else {
			return false;
		}		
	}
	
	public boolean matricularProfessor(Professor professor, Disciplina disciplina) {
		ArrayList<String> diasMatriculadosDoProfessor = this.getDiasMatriculados(professor);
		Collection<Integer> horariosDaDisciplina = disciplina.getHorario().horario.values();
		boolean condicao = false;
		
		if (diasMatriculadosDoProfessor.isEmpty()) {
			if (!verificaSeTemOutroProfessorNaDisciplina(disciplina)) {
				for (int i = 0; i < diasMatriculadosDoProfessor.size(); i++) {
					condicao = this.disponibilidadeProfessor(professor, diasMatriculadosDoProfessor.get(i), horariosDaDisciplina.iterator().next());
				}
				professor.addDisciplina(disciplina);
				return true;
			}
		}else if (!diasMatriculadosDoProfessor.isEmpty()){
			if (!verificaSeTemOutroProfessorNaDisciplina(disciplina)) {
				for (int i = 0; i < diasMatriculadosDoProfessor.size(); i++) {
					condicao = this.disponibilidadeProfessor(professor, diasMatriculadosDoProfessor.get(i), horariosDaDisciplina.iterator().next());
				}
				professor.addDisciplina(disciplina);
				return true;
			}
		}
		
		return false;				
	}

	private boolean verificaSeTemOutroProfessorNaDisciplina(Disciplina disciplina) {
		for (Professor p : this.getProfessores()) {
			if (p.getDisciplinas().contains(disciplina.getID())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean disponibilidadeAluno(Aluno aluno, String diaDaSemana, int hora) {
		if (!aluno.getDisciplinas().isEmpty()) {
			for (Integer id_disciplinasDoAluno : aluno.getDisciplinas()) {
				for (Disciplina disciplinaDoSistema : this.getDisciplinas()) {
					if (disciplinaDoSistema.getID() == id_disciplinasDoAluno) {
						if (disciplinaDoSistema.getHorario().horario.containsKey(diaDaSemana.toUpperCase())) {
							if (disciplinaDoSistema.getHorario().horario.containsValue(hora)) {
								return false;
							}
						}
					}
				}				
			}
		}
		return true;
	}
	
	public ArrayList<String> getDiasMatriculados(Aluno aluno) {
		ArrayList<Integer> id_disciplinasDoAluno = aluno.getDisciplinas();
		ArrayList<String> diasDaSemana = new ArrayList<String>();
		for (Disciplina disciplinaDoSistema : this.getDisciplinas()) {
			if (id_disciplinasDoAluno.contains(disciplinaDoSistema.getID())) {
				diasDaSemana.addAll(disciplinaDoSistema.getHorario().horario.keySet());
			}			
		}
		return diasDaSemana;
	}
	
	public boolean disponibilidadeProfessor(Professor professor, String diaDaSemana, int hora) {
		if (!professor.getDisciplinas().isEmpty()) {
			for (Integer id_disciplinaDoProfessor : professor.getDisciplinas()) {
				for (Disciplina disciplinaDoSistema : this.getDisciplinas()) {
					if (disciplinaDoSistema.getID() == id_disciplinaDoProfessor) {
						if (disciplinaDoSistema.getHorario().horario.containsKey(diaDaSemana.toUpperCase())) {
							if (disciplinaDoSistema.getHorario().horario.containsValue(hora)) {
								return false;
							}
						}
					}
				}				
			}
		}
		return true;
	}
	
	public ArrayList<String> getDiasMatriculados(Professor professor) {
		ArrayList<Integer> id_disciplinasDoProfessor = professor.getDisciplinas();
		ArrayList<String> diasDaSemana = new ArrayList<String>();
		
		for (Disciplina disciplinaDoSistema : this.getDisciplinas()) {
			if (id_disciplinasDoProfessor.contains(disciplinaDoSistema.getID())) {
				diasDaSemana.addAll(disciplinaDoSistema.getHorario().horario.keySet());
			}			
		}
		return diasDaSemana;
	}
			
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	
	
	public static void main(String[] args) {
		ControleAcademico c = new ControleAcademico();
		
		Disciplina d1 = new Disciplina(0, "Calculo 2", 10, 3, "segunda", 9);
		Disciplina d2 = new Disciplina(1, "Calculo 1", 10, 3, "terça", 11);
		Disciplina d3 = new Disciplina(2, "MAP", 10, 3, "segunda", 9);
		
		Professor p1 = new Professor(0, "Onildo");
		Professor p2 = new Professor(1, "Sabrina");
		
		Aluno a1 = new Aluno(0, "Rodrigo");
		Aluno a2 = new Aluno(1, "Aline");
		
		

		c.alunos.add(a1);
		c.alunos.add(a2);
		
		c.professores.add(p1);
		c.professores.add(p2);
		
		c.disciplinas.add(d1);
		c.disciplinas.add(d2);
		c.disciplinas.add(d3);
		
		c.getDisciplinas().get(0).getHorario().addHorario("quarta", 7);
		c.getDisciplinas().get(1).getHorario().addHorario("quinta", 9);
		
		c.matricularProfessor(p1, d1);
		c.matricularProfessor(p1, d2);
		c.matricularProfessor(p2, d3);

		c.matricularAluno(a1, d1);
		c.matricularAluno(a1, d2);
		c.matricularAluno(a1, d3);
		c.matricularAluno(a2, d2);
		
		
		Professor professor = p1;
		Aluno aluno = a1;
		Disciplina disciplina = d2;
		
		
		System.out.println("---------- Disciplinas do Controle Academico -----------");
		for (Disciplina d : c.getDisciplinas()) {
			System.out.println(d);
		}
		
		System.out.println("\n---------- Professores do Controle Academico -----------");
		for (Professor p : c.getProfessores()) {
			System.out.println(p);
		}
		
		System.out.println("\n---------- Alunos do Controle Academico -----------");
		for (Aluno a : c.getAlunos()) {
			System.out.println(a);
		}
		
		
		
		
		System.out.println("\n---------- Disciplinas do(a) professor(a) "+ professor.getNome() +" -----------");
		System.out.println(professor.getDisciplinas());	
				
		System.out.println("\n---------- Horarios do(a) professor(a) "+ professor.getNome() +" -----------");
		System.out.println(c.getDiasMatriculados(professor));
		
		System.out.println("\n---------- ID dos Alunos da Disciplina "+ disciplina.getNome() +" -----------");
		if (c.getDisciplinas().size() != 0) {
			for (int i = 0; i < c.getDisciplinas().size(); i++) {
				if (c.getDisciplinas().get(i).getNome() == disciplina.getNome()) {
					System.out.println(c.getDisciplinas().get(i).getTurma());
				}
			}			
		}		
		
		System.out.println("\n---------- Disciplinas do(a) aluno(a) " + aluno.getNome() + " -----------");
		System.out.println(aluno.getDisciplinas());		
		
		System.out.println("\n---------- Horarios do(a) aluno(a) " + aluno.getNome() + " -----------");
		System.out.println(c.getDiasMatriculados(aluno));
		
		
		System.out.println("\n---------- Quantidade de alunos das disciplinas -----------");
		for (Disciplina umaDisciplinas : c.disciplinas) {
			System.out.println("Discipliona: " + umaDisciplinas.getNome() + ", quantidade de alunos = " + umaDisciplinas.tamanhoDaTurma());
		}
		
		
	}
}
