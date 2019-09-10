package Lab02;

import java.util.ArrayList;
import java.util.List;

public class ControleAcademico {
	
	private List<MatriculaAluno> matriculasAlunos;
	private List<MatriculaProfessor> matriculasProfessores;
	private List<Aluno> alunos;
	private List<Professor> professores;
	private List<Disciplina> disciplinas;
	private int idAluno;
	private int idProfessor;
	private int idDisciplina;
	
	public ControleAcademico() {
		matriculasAlunos = new ArrayList<MatriculaAluno>();
		matriculasProfessores = new ArrayList<MatriculaProfessor>();
		alunos = new ArrayList<Aluno>();
		professores = new ArrayList<Professor>();
		disciplinas = new ArrayList<Disciplina>();
		idAluno = 0;
		idProfessor = 0;
		idDisciplina = 0;		
		
	}
	
	public void addMatriculaDeAluno(Aluno aluno, Disciplina disciplina) {
		matriculasAlunos.add(new MatriculaAluno(aluno, disciplina));
	}
	
	public void addMatriculaDeProfessor(Professor professor, Disciplina disciplina) {
		matriculasProfessores.add(new MatriculaProfessor(professor, disciplina));
	}
	
	public void addAluno(String nome) {
		idAluno++;
		alunos.add(new Aluno(idAluno, nome));
	}
	
	public void addProfessor(String nome) {
		idProfessor++;
		professores.add(new Professor(idProfessor, nome));
	}
	
	public void addDisciplina(String nome, int horasTotais, String dia1, int hora1, String dia2, int hora2) {
		idDisciplina++;
		disciplinas.add(new Disciplina(idDisciplina, nome, horasTotais, dia1, hora1, dia2, hora2));
	}
	
	public void addDisciplina(String nome, int horasTotais, String dia1, int hora1) {
		idDisciplina++;
		disciplinas.add(new Disciplina(idDisciplina, nome, horasTotais, dia1, hora1));
	}
	
	public void addDisciplina(String nome, int horasTotais) {
		idDisciplina++;
		disciplinas.add(new Disciplina(idDisciplina, nome, horasTotais));
	}
	
	public void mostraDisciplinasCadastradas() {
		for (Disciplina disciplinas : this.getDisciplinas()) {
			System.out.println(disciplinas);
		}
	}
	
	public void mostraAlunosCadastrados() {
		for (Aluno alunos : this.getAlunos()) {
			System.out.println(alunos);
		}
	}
	
	public void mostraProfessoresCadastrados() {
		for (Professor professores : this.getProfessores()) {
			System.out.println(professores);
		}
	}
	
	public void MostraDisciplinasDeUmAluno(String nome) {
		for (MatriculaAluno matriculas : this.getMatriculasAlunos()) {
			if (matriculas.getAluno().getNome() == nome) {
				System.out.println("Aluno: " + nome + " matriculado na disciplina: " + matriculas.getDisciplina().getNome() + " " + matriculas.getDisciplina().getHorario());
				
			}
		}
	}
	
	//Remove matriculas que estão com o status igual a false
	public void removeMatriculasComChoqueDeHorario() {
		for (int i = 0; i < this.getMatriculasAlunos().size(); i++) {
			if (this.getMatriculasAlunos().get(i).isStatus() == false) {
				this.getMatriculasAlunos().remove(i);
			}
		}	
	}
	
	public void MostraDisciplinasDeUmProfessor(String nome) {
		for (MatriculaProfessor matriculas : this.getMatriculasProfessores()) {
			if (matriculas.getProfessor().getNome() == nome) {
				System.out.println("Professor(a) " + nome + " ministrando a disciplina: " + matriculas.getDisciplina().getNome() + " " + matriculas.getDisciplina().getHorario());
			}
		}
	}
	
	public void RDM(String nome) {
		System.out.println("Aluno: " + nome);
		for (MatriculaAluno matriculas : this.getMatriculasAlunos()) {
			if (matriculas.getAluno().getNome() == nome) {
				System.out.println("disciplina: " + matriculas.getDisciplina().getNome() + "\n"
								+ "Horarios " + matriculas.getDisciplina().getHorario());
				
			}
		}
	}
		
	public List<MatriculaAluno> getMatriculasAlunos() {
		return matriculasAlunos;
	}

	public void setMatriculasAlunos(List<MatriculaAluno> matriculasAlunos) {
		this.matriculasAlunos = matriculasAlunos;
	}

	public List<MatriculaProfessor> getMatriculasProfessores() {
		return matriculasProfessores;
	}

	public void setMatriculasProfessores(List<MatriculaProfessor> matriculasProfessores) {
		this.matriculasProfessores = matriculasProfessores;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	public static void main(String[] args) {
		ControleAcademico ca = new ControleAcademico();
		
		ca.addAluno("Rodrigo");
		ca.addAluno("Aline");
		
		ca.addProfessor("Onildo");
		ca.addProfessor("Sabrina");
		
		ca.addDisciplina("Calculo2", 60, "Terça", 7, "Quinta", 9);
		ca.addDisciplina("Calculo1", 60, "Terça", 9, "Quinta", 7);
		ca.addDisciplina("MAP", 60, "Segunda", 11, "Sexta", 11);
		ca.addDisciplina("Algebra Linear", 60, "Terça", 7, "Sexta", 7);
		
		//indice corresponde id - 1
		ca.addMatriculaDeAluno(ca.getAlunos().get(0), ca.getDisciplinas().get(0));
		ca.addMatriculaDeAluno(ca.getAlunos().get(0), ca.getDisciplinas().get(2));
		ca.addMatriculaDeAluno(ca.getAlunos().get(0), ca.getDisciplinas().get(3)); //Não adiciona, Choque de horario
		
		ca.addMatriculaDeProfessor(ca.getProfessores().get(0), ca.getDisciplinas().get(0));
		ca.addMatriculaDeProfessor(ca.getProfessores().get(0), ca.getDisciplinas().get(1));
		ca.addMatriculaDeProfessor(ca.getProfessores().get(1), ca.getDisciplinas().get(2));
		
		ca.removeMatriculasComChoqueDeHorario();
		
		System.out.println("\n--------------------Alunos do sistema--------------------");
		ca.mostraAlunosCadastrados();
		System.out.println("\n--------------------Professores do sistema--------------------");
		ca.mostraProfessoresCadastrados();
		System.out.println("\n--------------------Disciplinas do sistema--------------------");
		ca.mostraDisciplinasCadastradas();		
		System.out.println("\n--------------------Disciplinas de um aluno--------------------");
		ca.MostraDisciplinasDeUmAluno("Rodrigo");
		System.out.println("\n--------------------Disciplinas de um professor--------------------");
		ca.MostraDisciplinasDeUmProfessor("Onildo");
		System.out.println("\n--------------------Disciplinas de um professor--------------------");
		ca.MostraDisciplinasDeUmProfessor("Sabrina");
		System.out.println("\n--------------------RDM de um aluno--------------------");
		ca.RDM("Rodrigo");
		
	}
}
