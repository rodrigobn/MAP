package interfaces;

import Main.Sanduiche;
import produtoConcreto.Tomate;

public interface ISanduiche {
	
	public Pao addPao();
	
	public Queijo addQueijo() ;
	
	public Presunto addPresunto() ;
	
	public Ovo addOvo();
	
	public Tomate addTomate();
	
	public Sanduiche montaSanduiche();

}
