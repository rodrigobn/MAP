package Lab01;

import java.util.ArrayList;
import java.util.HashMap;

public class Professor {
	private int ID;
	private String nome;
	private ArrayList<Integer> disciplinas;
	
	public Professor(int id, String nome) {
		this.ID = id;
		this.nome = nome;
		this.disciplinas = new ArrayList<Integer>();
	}	
	
	public boolean addDisciplina(Disciplina disciplina) {
		ArrayList<String> diasDaSemana = new ArrayList<String>();
		try {
			if (!this.getDisciplinas().contains(disciplina.getID())) {			
				if (!diasDaSemana.contains(disciplina.getHorario().horario.keySet())) {
					this.disciplinas.add(disciplina.getID());
					return true;
				}			
			}
		} catch (Exception e) {
			return false;
		}		
		return false;		
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

	public ArrayList<Integer> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Integer> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Professor [ID=" + ID + ", nome=" + nome + ", disciplinas=" + disciplinas + "]";
	}
	
	
}
