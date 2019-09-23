package models;

import excecoes.NumeroNegativoException;
import excecoes.StringVaziaEsception;
import interfaces.Comparable;
import interfaces.Funcionario;

public class Ator implements Comparable, Funcionario {
	
	private String nome;
	private int cpf;
	private double salario;
	private String funcao;
	
	public Ator(String nome, int cpf) throws NumeroNegativoException, StringVaziaEsception {
		if (cpf < 0) {
			throw new NumeroNegativoException();
		}
		if (nome == null || nome == "") {
			throw new StringVaziaEsception();
		}
		this.nome = nome;
		this.cpf = cpf;
		this.salario = 0;
		this.funcao = "Ator";
	}
	
	@Override
	public int compareTo(Comparable o) {
		if (this.getCpf() == ((Ator) o).getCpf()) {
			return 0;
		}
		return 1;
	}
	@Override
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws StringVaziaEsception {
		if (nome == "" || nome == null) {
			throw new StringVaziaEsception();
		}
		this.nome = nome;
	}
	
	@Override
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) throws NumeroNegativoException {
		if (cpf < 0) {
			throw new NumeroNegativoException();
		}
		this.cpf = cpf;
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
	public Boolean setFuncao(String funcao) throws StringVaziaEsception {
		if (funcao == "" || funcao == null) {
			throw new StringVaziaEsception();
		}
		this.funcao = funcao;
		return true;
	}

	@Override
	public Boolean setSalario(double salario) throws NumeroNegativoException {
		if (salario < 0) {
			throw new NumeroNegativoException();	
		}
		this.salario = salario;
		return true;
	}

	@Override
	public String toString() {
		return "Ator [nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", Função=" + getFuncao() +"]";
	}
	
}
