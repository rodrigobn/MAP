package Singleton;

public class Equilatero extends Triangulo {

	private static Triangulo instanciaUnica = null;
	private Equilatero() {

	}
	
	public static Triangulo getInstance() {
		if (instanciaUnica == null) {
			instanciaUnica = new Equilatero();
			System.out.println("�nico " + instanciaUnica.toString() + " criado");
		}
		return instanciaUnica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangulo Equilatero");
		return builder.toString();
	}
	
	


}
