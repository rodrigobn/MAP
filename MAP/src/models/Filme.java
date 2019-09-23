package models;

import java.util.ArrayList;
import java.util.List;

import excecoes.NumeroNegativoException;
import excecoes.StringVaziaEsception;
import interfaces.Comparable;
import interfaces.Funcionario;

public class Filme implements Comparable {
	
	private String nome;
	private int ano;
	private List<Funcionario> funcionarios;
	
	public Filme(String nome, int ano) throws StringVaziaEsception, NumeroNegativoException {
		if (nome == "" || nome == null) {
			throw new StringVaziaEsception();
		}
		if (ano < 0) {
			throw new NumeroNegativoException();
		}
		this.nome = nome;
		this.ano = ano;
		this.funcionarios = new ArrayList<Funcionario>();
	}	
	
	public boolean addFuncionario(Funcionario funcionario) {
		if (this.getFuncionarios().contains(funcionario)) {
			return false;
		}
		this.getFuncionarios().add(funcionario);
		return true;
	}	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws StringVaziaEsception {
		if (nome == "" || nome == null) {
			throw new StringVaziaEsception();
		}
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) throws NumeroNegativoException {
		if (ano < 0) {
			throw new NumeroNegativoException();
		}
		this.ano = ano;
	}

	@Override
	public int compareTo(Comparable c) {
		if (this.nome == ((Filme) c).getNome() && this.ano == ((Filme) c).getAno()) {
			return 0;
		}
		return -1;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", ano=" + ano + ", funcionarios=" + funcionarios + "]";
	}
	
	
}
