package exceptions;

public class NumeroNegativoException extends Exception {

	private static final long serialVersionUID = 1149241039409861914L;

	public NumeroNegativoException() {
		super("Valor informado e invalido");
	}
}
