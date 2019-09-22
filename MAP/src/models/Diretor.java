package models;

import interfaces.Comparable;
import interfaces.Funcionario;
import interfaces.Pessoa;

public class Diretor implements Comparable, Pessoa, Funcionario{
	
	private String nome;
	private int cpf;
	private double salario;
	
	public Diretor(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = 0;
	}
	
	@Override
	public Double getSalario() {		
		return this.salario;
	}

	@Override
	public String getFuncao() {
		return "Diretor";
	}

	@Override
	public String getNome() {		
		return this.nome;
	}

	@Override
	public int getCpf() {		
		return this.cpf;
	}

	@Override
	public int compareTo(Comparable c) {
		if (this.cpf == ((Diretor) c).getCpf()) {
			return 0;
		}
		return -1;
	}

	@Override
	public Boolean setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Diretor [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
	
	

}
