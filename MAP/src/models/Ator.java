package models;

import interfaces.Comparable;
import interfaces.Funcionario;
import interfaces.Pessoa;

public class Ator implements Comparable, Pessoa, Funcionario {
	
	private String nome;
	private int cpf;
	private double salario;
	
	public Ator(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = 0;
	}
	
	@Override
	public int compareTo(Comparable o) {
		if (this.getCpf() == ((Ator) o).getCpf()) {
			return 0;
		}
		return 1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public Double getSalario() {
		return this.salario;
	}

	@Override
	public String getFuncao() {
		return "Ator";
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
		return "Ator [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
	
}
