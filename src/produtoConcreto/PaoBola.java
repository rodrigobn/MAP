package produtoConcreto;

import interfaces.Pao;

public class PaoBola implements Pao{
	
	private static Pao instancia;
	
	private PaoBola() {
		
	}
	
	public static Pao getInstance() {
		instancia = new PaoBola();
		return instancia;
		
	}
	
	@Override
	public String getTipo() {
		return "Bola";		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pão " + getTipo());
		return builder.toString();
	}

}
