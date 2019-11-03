package produtoConcreto;

import interfaces.Ovo;

public class OvoCapoeira implements Ovo{

private static Ovo instancia;
	
	public OvoCapoeira() {
		// TODO Auto-generated constructor stub
	}
	
	public static Ovo getInstance() {
		if(instancia == null) {
			instancia = new OvoCapoeira();
		}
		return instancia;
		
	}

	@Override
	public String getTipo() {		
		return "Capoeira";
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ovo de " + getTipo());
		return builder.toString();
	}
}
