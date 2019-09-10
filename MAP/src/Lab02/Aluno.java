package Lab02;

import java.util.ArrayList;
import java.util.List;

public class Aluno{
	private int ID;
	private String nome;
	private List<Horario> horario = new ArrayList<Horario>();

	public Aluno(int id, String nome){
		this.ID = id;
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	
	//Se a disciplina tiver 1 horario
	public boolean addHorario(Horario horario) {
		if (disponivel(horario)) {
			this.getHorario().add(horario);
			return true;
		}
		return false;
	}
	
	public boolean disponivel(Horario horario) {
		for (Horario horarios : this.getHorario()) {
			if (horarios.getDia() == horario.getDia() && horarios.getHora() == horario.getHora()) {
				return false;
			}
		}
		return true;		
	}
	//Se a disciplina tiver 2 horarios
	public boolean addHorario(Horario horario1, Horario horario2) {
		if (disponivel(horario1, horario2)) {
			this.getHorario().add(horario1);
			this.getHorario().add(horario2);
			return true;
		}
		return false;
	}
	
	public boolean disponivel(Horario horario1, Horario horario2) {
		for (Horario horarios : this.getHorario()) {
			if (horarios.getDia() == horario1.getDia() && horarios.getHora() == horario1.getHora() || horarios.getDia() == horario2.getDia() && horarios.getHora() == horario2.getHora()) {
				return false;
			}
		}
		return true;		
	}
	
	public List<Horario> getHorario() {
		return horario;
	}

	public void setHorario(List<Horario> horario) {
		this.horario = horario;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public String toString() {
		return "Aluno [ID=" + ID + " nome=" + nome + ", horario=" + horario + "]";
	}



}