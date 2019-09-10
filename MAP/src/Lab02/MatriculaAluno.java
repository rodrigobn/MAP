package Lab02;

public class MatriculaAluno {

	private Aluno aluno;
	private Disciplina disciplina;
	private boolean status;

	public MatriculaAluno(Aluno aluno, Disciplina disciplina) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		
		//Se a disciplina tiver 1 horario chama o metodo com 1 parametro
		if (disciplina.getHorario().size() == 1) {
			status = this.aluno.addHorario(disciplina.getHorario().get(0));
			
		}
		
		//Se a disciplina tiver 2 horarios chama o metodo com 2 parametros
		if (disciplina.getHorario().size() == 2) {
			status = this.aluno.addHorario(disciplina.getHorario().get(0), disciplina.getHorario().get(1));
			
		}
		if (status) {
			this.disciplina.adicionaAluno(aluno);
		}
				
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
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
		Aluno a = new Aluno(1, "Rodrigo");
		Disciplina d = new Disciplina(1, "Calculo1", 60, "terça", 7, "quinta", 9);
		Disciplina d2 = new Disciplina(2, "Calculo2", 60, "quinta", 9);
		Disciplina d3 = new Disciplina(3,"MAP", 60, "Segunda", 11, "Sexta", 11);
		Disciplina d4 = new Disciplina(4,"Algebra Linear", 60, "Terça", 7, "Sexta", 7);

		MatriculaAluno matricula = new MatriculaAluno(a, d);
		MatriculaAluno matricula2 = new MatriculaAluno(a, d2);
		MatriculaAluno matricula3 = new MatriculaAluno(a, d3);
		MatriculaAluno matricula4 = new MatriculaAluno(a, d4);

		System.out.println(matricula.getAluno());
		System.out.println(matricula.getDisciplina());
		System.out.println(matricula2.getDisciplina());
		System.out.println(matricula3.getDisciplina());
		System.out.println(matricula4.getDisciplina());

	}

}
