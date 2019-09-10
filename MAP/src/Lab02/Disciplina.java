package Lab02;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	
	private int ID;
	private String nome;
	private int horasTotais;
	private List<Aluno> listaAlunos = new ArrayList<Aluno>();
	private List<Horario> horario = new ArrayList<Horario>();

	public Disciplina(int id, String nome, int horasTotais, String dia1, int hora1, String dia2, int hora2) {
		this.setID(id);
		this.nome = nome;
		this.horasTotais = horasTotais;
		this.horario.add(new Horario(dia1, hora1));
		this.horario.add(new Horario(dia2, hora2));
	}
	public Disciplina(int id, String nome, int horasTotais, String dia1, int hora1) {
		this.setID(id);
		this.nome = nome;
		this.horasTotais = horasTotais;
		this.horario.add(new Horario(dia1, hora1));
	}

	public Disciplina(int id, String nome, int horasTotais) {
		this.setID(id);
		this.nome = nome;
		this.horasTotais = horasTotais;
	} 

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void adicionaAluno(Aluno aluno){
		listaAlunos.add(aluno);
	}

	public int getHoras(){
		return this.horasTotais;
	}

	public void setHoras(int horasTotais){
		this.horasTotais = horasTotais;
	}

	public List<Horario> getHorario(){
		return this.horario;
	}

	public int getNumeroAlunos(){
		return this.listaAlunos.size();
	}
	@Override
	public String toString() {
		return "Disciplina [ID=" + ID + " nome=" + nome + ", horas=" + horasTotais + ", listaAlunos=" + listaAlunos + ", horario=" + horario + ", numeroAlunos=" + getNumeroAlunos() + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}

	

}