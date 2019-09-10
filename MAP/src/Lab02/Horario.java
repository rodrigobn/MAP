package Lab02;

public class Horario {
	private String dia;
	private int hora;
	
	public Horario(String dia, int hora) {
		this.dia = dia;
		this.hora = hora;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Horario [dia=" + dia + ", hora=" + hora + "]";
	}
	
	
}
