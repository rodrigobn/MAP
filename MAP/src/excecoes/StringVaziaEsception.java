package excecoes;

public class StringVaziaEsception extends Exception{

	private static final long serialVersionUID = 1328891896439191331L;
	
	public StringVaziaEsception() {
		super("Nome informado e invalido");
	}

}
