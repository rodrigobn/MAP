package exceptions;

public class FigurasDiferentesException extends Exception{
	private static final long serialVersionUID = 1149241039409861914L;
	public FigurasDiferentesException(){
		super("As figuras n�o s�o da mesma instancia");
	}
}
