package produtoConcreto;

import interfaces.Queijo;

public class QueijoMussarela implements Queijo {
	
	private static Queijo instancia;
	
	public QueijoMussarela() {
	}
	
	public static Queijo getInstance() {
		if(instancia == null) {
			instancia = new QueijoMussarela();
		}
		return instancia;
		
	}

	@Override
	public String getTipo() {		
		return "Mussarela";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Queijo " + getTipo());
		return builder.toString();
	}
}
