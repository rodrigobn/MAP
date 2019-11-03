package Main;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;
import produtoConcreto.Tomate;

public class Sanduiche {

	public Sanduiche(Pao pao, Queijo queijo, Presunto presunto, Ovo ovo, Tomate tomate ) {
		System.out.println("Duas fatias de " + pao);
		System.out.println("Uma fatia de " + queijo);
		System.out.println("Uma fatia de " + presunto);
		System.out.println("Um " + ovo);
		System.out.println("e " + tomate);
	}
	
	
	

}
