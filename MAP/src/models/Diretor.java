package models;

import interfaces.Comparable;
import interfaces.Funcionario;

public class Diretor implements Comparable, Funcionario{
	
	private String nome;
	private int cpf;
	private double salario;
	private String funcao;
	
	public Diretor(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = 0;
		this.funcao = "Diretor";
	}
	
	@Override
	public Double getSalario() {		
		return this.salario;
	}

	@Override
	public String getFuncao() {
		return funcao;
	}

	@Override
	public Boolean setFuncao(String funcao) {
		this.funcao = funcao;
		return true;
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
		return "Diretor [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", Função=" + getFuncao() + "]";
	}
	
	

}
