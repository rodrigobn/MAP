package Lab02;

import java.util.ArrayList;
import java.util.List;

public class Professor{
	private int ID;
	private String nome;
	private List<Horario> horario = new ArrayList<Horario>();

	public Professor(int id, String nome){
		this.setID(id);
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void addHorario(Horario horario) {
		if (disponivel(horario)) {
			this.getHorario().add(horario);
		}		
	}
	
	public boolean disponivel(Horario horario) {
		for (Horario horarios : this.getHorario()) {
			if (horarios.getDia() == horario.getDia() && horarios.getHora() == horario.getHora()) {
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

	@Override
	public String toString() {
		return "Professor [ID=" + ID + " nome=" + nome + ", horario=" + horario + "]";
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}



}