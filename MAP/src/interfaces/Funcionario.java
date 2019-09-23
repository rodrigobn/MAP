package interfaces;

import excecoes.NumeroNegativoException;
import excecoes.StringVaziaEsception;

public interface Funcionario {
	
	public Double getSalario();
	public Boolean setSalario(double salario) throws NumeroNegativoException;
	public Boolean setFuncao(String funcao) throws StringVaziaEsception;
	public String getFuncao();
	public String getNome();
	public int getCpf();
	
	
}
