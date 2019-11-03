package Main;

import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;
import produtoConcreto.Tomate;

public class Sanduiche {
	
	private Pao fatia1;
	private Pao fatia2;
	private Queijo queijo;
	private Presunto presunto;
	private Ovo ovo;
	private Tomate tomate;
	
	
	public Sanduiche(Pao fatia1, Pao fatia2, Queijo queijo, Presunto presunto, Ovo ovo, Tomate tomate) {
		super();
		this.fatia1 = fatia1;
		this.fatia2 = fatia2;
		this.queijo = queijo;
		this.presunto = presunto;
		this.ovo = ovo;
		this.tomate = tomate;
	}
	
	
	public Pao getFatia1() {
		return fatia1;
	}
	public void setFatia1(Pao fatia1) {
		this.fatia1 = fatia1;
	}
	public Pao getFatia2() {
		return fatia2;
	}
	public void setFatia2(Pao fatia2) {
		this.fatia2 = fatia2;
	}
	public Queijo getQueijo() {
		return queijo;
	}
	public void setQueijo(Queijo queijo) {
		this.queijo = queijo;
	}
	public Presunto getPresunto() {
		return presunto;
	}
	public void setPresunto(Presunto presunto) {
		this.presunto = presunto;
	}
	public Ovo getOvo() {
		return ovo;
	}
	public void setOvo(Ovo ovo) {
		this.ovo = ovo;
	}
	public Tomate getTomate() {
		return tomate;
	}
	public void setTomate(Tomate tomate) {
		this.tomate = tomate;
	}
	
	
	

}
