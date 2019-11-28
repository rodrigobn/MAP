package model;

public class Acento {

	private Boolean disponivel, reservado, ocupado;
	
	public Acento() {
		this.disponivel = true;
		this.reservado = false;
		this.ocupado = false;
	}

	public Boolean getReservado() {
		return reservado;
	}

	public void setReservado(Boolean reservado) {
		this.reservado = reservado;
	}

	public Boolean getOcupado() {
		return ocupado;
	}

	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}

	public Boolean getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public void status() {
		if (this.disponivel) {
			System.out.println("Acento disponivel");
		}
		if (this.ocupado) {
			System.out.println("Acento ocupado");
		}
		if (this.reservado) {
			System.out.println("Acento reservado");
		}
	}

	@Override
	public String toString() {
		return " [disponivel = " + disponivel + ", reservado = " + reservado + ", ocupado = " + ocupado + "]";
	}
	
	
}
