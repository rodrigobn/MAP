package produtoConcreto;

import interfaces.Presunto;

public class PresuntoPeru implements Presunto {
	
	private static Presunto instancia;
	
	public PresuntoPeru() {
		// TODO Auto-generated constructor stub
	}
	
	public static Presunto getInstance() {
		if(instancia == null) {
			instancia = new PresuntoPeru();
		}
		return instancia;
		
	}

	@Override
	public String getTipo() {		
		return "Peru";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Presunto de " + getTipo());
		return builder.toString();
	}
}
