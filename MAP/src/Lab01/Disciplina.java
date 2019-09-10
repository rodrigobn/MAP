package Lab01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class Disciplina {
	
	private int ID;
	private String nome;
	private ArrayList<Integer> turma;
	private Horario horarios;
	private int capacidadeAlunos;
	private int quantidadeNotas;
	
	
	public Disciplina (int id, String nome, int capacidade, int quantidadeNotas, String diadasemana, int hora) 
	{		
		this.ID = id;
		this.nome = nome;
		this.turma = new ArrayList<Integer>();
		this.horarios = new Horario();
		this.getHorario().addHorario(diadasemana, hora);
		this.capacidadeAlunos = capacidade;
		this.quantidadeNotas = quantidadeNotas;
	}
	
	public boolean addAluno(Aluno aluno) {
		try {
			if (this.tamanhoDaTurma() <= this.getCapacidadeAlunos()) {
				if (!this.getTurma().contains(aluno.getID())) {
					this.getTurma().add(aluno.getID());
					return true;
				}			
			}
		} catch (Exception e) {
			return false;
		}
		
		return false;				
	}
	
	public int tamanhoDaTurma() {
		return this.getTurma().size();		
	}
	
	public boolean addHorario(String diaDaSemana, int hora) {
		try {
			this.getHorario().addHorario(diaDaSemana, hora);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean removeHorario(String diaDaSemana, int hora) {
		try {
			this.getHorario().removeHorario(diaDaSemana, hora);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public ArrayList<Integer> getTurma() {
		return turma;
	}


	public void setTurma(ArrayList<Integer> turma) {
		this.turma = turma;
	}


	public Horario getHorario() {
		return horarios;
	}


	public int getCapacidadeAlunos() {
		return capacidadeAlunos;
	}


	public void setCapacidadeAlunos(int capacidadeAlunos) {
		this.capacidadeAlunos = capacidadeAlunos;
	}
	

	public int getQuantidadeNotas() {
		return quantidadeNotas;
	}


	public void setQuantidadeNotas(int quantidadeNotas) {
		this.quantidadeNotas = quantidadeNotas;
	}
	

	@Override
	public String toString() {
		return "Disciplina [ID=" + ID + ", nome=" + nome + ", turma=" + turma
				+ ", horario=" + horarios.toString() + ", capacidadeAlunos=" + capacidadeAlunos 
				+ ", quantidadeNotas=" + quantidadeNotas + "]";
	}

}
