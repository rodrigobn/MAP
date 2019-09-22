package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.Comparable;
import interfaces.Funcionario;

public class Filme implements Comparable {
	
	private String nome;
	private int ano;
	private List<Funcionario> atores;
	private List<Funcionario> diretores;
	private List<Funcionario> roteristas;
	private List<Funcionario> cameras;
	private List<Funcionario> funcionarios;
	
	public Filme(
			String nome,
			int ano,
			List<Funcionario> atores,
			List<Funcionario> diretores,
			List<Funcionario> rotreristas,
			List<Funcionario> cameras,
			List<Funcionario> funcionarios
			) 
	{
		this.nome = nome;
		this.ano = ano;
		this.atores = new ArrayList<Funcionario>();
		this.diretores = diretores;
		this.roteristas = rotreristas;
		this.cameras = cameras;
		this.funcionarios = new ArrayList<Funcionario>();
	}	
	
	public boolean addFuncionario(Funcionario funcionario) {
		if (this.getAtores().contains(funcionario)) {
			return false;
		}
		this.getAtores().add(funcionario);
		return true;
	}
	
	
	
	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public int getAno() {
		return ano;
	}





	public void setAno(int ano) {
		this.ano = ano;
	}





	public List<Funcionario> getAtores() {
		return atores;
	}





	public List<Funcionario> getDiretores() {
		return diretores;
	}





	public List<Funcionario> getRoteristas() {
		return roteristas;
	}





	public List<Funcionario> getCameras() {
		return cameras;
	}





	@Override
	public int compareTo(Comparable c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	
	
}
