package produtoConcreto;

import interfaces.Pao;

public class PaoFrances implements Pao {

private static Pao instancia;
	
	public PaoFrances() {
		
	}
	
	public static Pao getInstance() {
		instancia = new PaoFrances();
		return instancia;
		
	}
	
	@Override
	public String getTipo() {
		return "Frances";		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pao" + getTipo());
		return builder.toString();
	}
}
