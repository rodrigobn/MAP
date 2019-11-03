package produtoConcreto;

import interfaces.Presunto;

public class PresuntoFrango implements Presunto{

private static Presunto instancia;
	
	public PresuntoFrango() {
		// TODO Auto-generated constructor stub
	}
	
	public static Presunto getInstance() {
		if(instancia == null) {
			instancia = new PresuntoFrango();
		}
		return instancia;
		
	}

	@Override
	public String getTipo() {		
		return "Frango";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Presunto de " + getTipo());
		return builder.toString();
	}
}
