package Singleton;

public class Circulo {
	private double raio;
	private static Circulo instanciaUnica;
	private Circulo(){
		
	}
	
	public static Circulo getInstance(){
		if (instanciaUnica == null) {
			instanciaUnica = new Circulo();
			System.out.println("Único " + instanciaUnica.toString() + " criado");
		}
		return instanciaUnica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Circulo");
		return builder.toString();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	
	

}
