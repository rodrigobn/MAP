package Lab01;

import java.util.HashMap;

public class Horario {
	HashMap<String, Integer> horario;
	
	public Horario() {
		this.horario = new HashMap<String, Integer>();
	}
	
	public boolean addHorario(String diaDaSemana, int hora) {
		try {
			if (this.getHorario().size() < 2) {
				this.getHorario().put(diaDaSemana.toUpperCase(), hora);
				return true;
			}			
		} catch (Exception e) {
			return false;
		}
		return false;
	}
	
	public boolean removeHorario(String diaDaSemana, int hora) {
		try {
			return this.horario.remove(diaDaSemana.toUpperCase(), hora);
		} catch (Exception e) {
			return false;
		}
		
	}

	private HashMap<String, Integer> getHorario() {
		return horario;
	}

	@Override
	public String toString() {
		return "Horario [diaDaSemana=" + horario + "]";
	}
}
