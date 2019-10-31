package Singleton;

public class Main {

	public static void main(String[] args) {
		// Criando um único Triangulo Equilatero
		Equilatero.getInstance();
		// Criando um único Triangulo Isosceles
		Isosceles.getInstance();
		// Criando um único Triangulo Retangulo
		Retangulo.getInstance();
		// Criando um único Circulo
		Circulo.getInstance();
		
		System.out.println();
	
		
		// Tentando criar novos objetos sem sucesso... 
		// Note que não exibe novamente a mensagem contida no if...
		// Ou seja, o getInstance() só retorna o mesmo objeto já criado...
		Equilatero.getInstance();
		Isosceles.getInstance();
		Retangulo.getInstance();
		Circulo.getInstance();
		
		
		// Criando quantos quadrados quiser...
		// Nesse caso utilizarei um for para criar mais 5 quadrados...
		// O método getInstance() da classe Quadrado permite criar diversos objetos...
		for(int j = 0; j<=4; j++){
			Quadrado.getInstance();
		}
		
	}

}
