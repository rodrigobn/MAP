package Singleton;

public class Isosceles extends Triangulo {

	private static Triangulo instanciaUnica = null;
	
	private Isosceles() {

	}
	
	public static Triangulo getInstance() {
		if (instanciaUnica == null) {
			instanciaUnica = new Isosceles();
			System.out.println("Único " + instanciaUnica.toString() + " criado");
		}
		return instanciaUnica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangulo Isosceles");
		return builder.toString();
	}

}
