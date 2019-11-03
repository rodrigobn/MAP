package Main;

import interfaces.ISanduiche;
import interfaces.Ovo;
import interfaces.Pao;
import interfaces.Presunto;
import interfaces.Queijo;
import produtoConcreto.OvoCapoeira;
import produtoConcreto.PaoFrances;
import produtoConcreto.PresuntoFrango;
import produtoConcreto.QueijoPrato;
import produtoConcreto.Tomate;

public class FabricaSanduiche1 implements ISanduiche{

	@Override
	public Pao addPao() {
		// TODO Auto-generated method stub
		return new PaoFrances();
	}

	@Override
	public Queijo addQueijo() {
		// TODO Auto-generated method stub
		return new QueijoPrato();
	}

	@Override
	public Presunto addPresunto() {
		// TODO Auto-generated method stub
		return new PresuntoFrango();
	}

	@Override
	public Ovo addOvo() {
		// TODO Auto-generated method stub
		return new OvoCapoeira();
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
