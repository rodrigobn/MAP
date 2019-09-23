package models;

import excecoes.NumeroNegativoException;
import interfaces.Funcionario;

public class Rh {
	
	public Boolean definiSalario(Funcionario funcionario, double salario) throws NumeroNegativoException {
		return funcionario.setSalario(salario);
	}
	
	public boolean delegaFilme(Filme filme, Funcionario funcionario) {
		return filme.addFuncionario(funcionario);
	}
}
