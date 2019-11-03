package produtoConcreto;

import interfaces.Queijo;

public class QuejoCheddar implements Queijo {
	
	private static Queijo instancia;
	
	public QuejoCheddar() {
	}
	
	public static Queijo getInstance() {
		if(instancia == null) {
			instancia = new QuejoCheddar();
		}
		return instancia;
		
	}

	@Override
	public String getTipo() {		
		return "Cheddar";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Queijo " + getTipo());
		return builder.toString();
	}
}
