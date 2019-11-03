package produtoConcreto;

import interfaces.Pao;

public class PaoIntegral implements Pao{

private static Pao instancia;
	
	private PaoIntegral() {
		
	}
	
	public static Pao getInstance() {
		instancia = new PaoIntegral();
		return instancia;
		
	}
	
	@Override
	public String getTipo() {
		return "Integral";		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pão " + getTipo());
		return builder.toString();
	}
}
