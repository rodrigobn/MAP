package models;

import interfaces.Funcionario;

public class Rh {
	
	public Boolean definiSalario(Funcionario funcionario, double salario) {
		return funcionario.setSalario(salario);
	}
	
	public boolean delegaFilme(Filme filme, Funcionario funcionario) {
		filme.addFuncionario(funcionario);
		return true;
	}
	
	public static void main(String[] args) {
		Funcionario ator1 = new Ator("Rodrigo", 123);
		Ator ator2 = new Ator("Aline", 456);
		Diretor diretor1 = new Diretor("Pedro", 789);
		Filme filme1 = new Filme("MIB", 2010, null, null, null, null, null);
		Rh rh = new Rh();
		System.out.println(((Ator) ator1).getNome());
		rh.delegaFilme(filme1, ator1);
		rh.delegaFilme(filme1, diretor1);
		rh.definiSalario(diretor1, 5000);
		System.out.println(filme1.getAtores());
		System.out.println(((Ator) ator1).compareTo(ator2));
	}
}
