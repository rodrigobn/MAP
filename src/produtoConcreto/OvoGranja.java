package produtoConcreto;

import interfaces.Ovo;

public class OvoGranja implements Ovo{

private static Ovo instancia;
	
	public OvoGranja() {
		// TODO Auto-generated constructor stub
	}
	
	public static Ovo getInstance() {
		if(instancia == null) {
			instancia = new OvoGranja();
		}
		return instancia;
		
	}

	@Override
	public String getTipo() {		
		return "Granja";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ovo de " + getTipo());
		return builder.toString();
	}

	
}
