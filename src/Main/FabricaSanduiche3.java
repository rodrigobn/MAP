package Main;

import interfaces.ISanduiche;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;
import produtoConcreto.OvoGranja;
import produtoConcreto.PaoBola;
import produtoConcreto.PresuntoFrango;
import produtoConcreto.QueijoMussarela;
import produtoConcreto.Tomate;

public class FabricaSanduiche3  implements ISanduiche {

	@Override
	public Pao addPao() {
		// TODO Auto-generated method stub
		return new PaoBola();
	}

	@Override
	public Queijo addQueijo() {
		// TODO Auto-generated method stub
		return new QueijoMussarela();
	}

	@Override
	public Presunto addPresunto() {
		// TODO Auto-generated method stub
		return new PresuntoFrango();
	}

	@Override
	public Ovo addOvo() {
		// TODO Auto-generated method stub
		return new OvoGranja();
	}

	@Override
	public Tomate addTomate() {
		// TODO Auto-generated method stub
		return new Tomate();
	}

	@Override
	public Sanduiche montaSanduiche() {
		
		Pao fatiaPao1 = addPao();
		Pao fatiaPao2 = addPao();
		Queijo fatiaQueijo = addQueijo();
		Presunto presunto = addPresunto();
		Ovo ovo = addOvo();
		Tomate tomate = addTomate();
		
		return new Sanduiche(fatiaPao1, fatiaPao2, fatiaQueijo, presunto, ovo, tomate);
	}

}
