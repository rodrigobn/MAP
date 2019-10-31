package Singleton;

public class Main {

	public static void main(String[] args) {
		// Criando um �nico Triangulo Equilatero
		Equilatero.getInstance();
		// Criando um �nico Triangulo Isosceles
		Isosceles.getInstance();
		// Criando um �nico Triangulo Retangulo
		Retangulo.getInstance();
		// Criando um �nico Circulo
		Circulo.getInstance();
		
		System.out.println();
	
		
		// Tentando criar novos objetos sem sucesso... 
		// Note que n�o exibe novamente a mensagem contida no if...
		// Ou seja, o getInstance() s� retorna o mesmo objeto j� criado...
		Equilatero.getInstance();
		Isosceles.getInstance();
		Retangulo.getInstance();
		Circulo.getInstance();
		
		
		// Criando quantos quadrados quiser...
		// Nesse caso utilizarei um for para criar mais 5 quadrados...
		// O m�todo getInstance() da classe Quadrado permite criar diversos objetos...
		for(int j = 0; j<=4; j++){
			Quadrado.getInstance();
		}
		
	}

}
