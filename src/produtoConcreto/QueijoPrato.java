package produtoConcreto;

import interfaces.Queijo;

public class QueijoPrato implements Queijo {
	
	private static Queijo instancia;
	
	public QueijoPrato() {
	}
	
	public static Queijo getInstance() {
		if(instancia == null) {
			instancia = new QueijoPrato();
		}
		return instancia;
		
	}

	@Override
	public String getTipo() {		
		return "Prato";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Queijo " + getTipo());
		return builder.toString();
	}
}
