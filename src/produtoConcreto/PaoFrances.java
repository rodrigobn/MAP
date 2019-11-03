package produtoConcreto;

import interfaces.Pao;

public class PaoFrances implements Pao {

private static Pao instancia;
	
	private PaoFrances() {
		
	}
	
	public static Pao getInstance() {
		instancia = new PaoFrances();
		return instancia;
		
	}
	
	@Override
	public String getTipo() {
		return "Francês";		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pão " + getTipo());
		return builder.toString();
	}
}
