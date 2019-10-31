package Singleton;

public class Retangulo extends Triangulo {
	private double largura;
	private static Triangulo instanciaUnica = null;
	private Retangulo(){
		
	}

	
	public static Triangulo getInstance(){
	
		if (instanciaUnica == null) {
			instanciaUnica = new Retangulo();
			System.out.println( "Único " + instanciaUnica.toString() + " criado");
		}
		
		return instanciaUnica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Triangulo Retangulo");
		return builder.toString();
	}


	public double getLargura() {
		return largura;
	}


	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	


}
