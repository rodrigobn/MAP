package excecoes;

public class NumeroNegativoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5083994380908214150L;
	
	public NumeroNegativoException() {
		super("Valor informado e invalido");
	}

}
