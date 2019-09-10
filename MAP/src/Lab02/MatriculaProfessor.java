package Lab02;

public class MatriculaProfessor {

	private Professor professor;
	private Disciplina disciplina;
	private boolean status;

	public MatriculaProfessor(Professor professor, Disciplina disciplina) {
		this.professor = professor;
		this.disciplina = disciplina;		

		for (int i = 0; i < disciplina.getHorario().size(); i++) {
			this.professor.addHorario(disciplina.getHorario().get(i));
		}
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean disponivel) {
		this.status = disponivel;
	}


	public static void main(String[] args) {
		Professor p = new Professor(1, "Onildo");
		Disciplina d = new Disciplina(1, "Calculo", 60, "terça", 7, "quinta", 9);
		Disciplina d2 = new Disciplina(2, "Calculo2", 60, "quinta", 11);

		MatriculaProfessor matricula = new MatriculaProfessor(p, d);
		MatriculaProfessor matricula2 = new MatriculaProfessor(p, d2);

		System.out.println(matricula.getProfessor());
		System.out.println(matricula.getDisciplina());
		System.out.println(matricula2.getDisciplina());

	}

}
