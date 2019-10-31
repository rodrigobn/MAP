package Singleton;

public class Quadrado {
	private double lado;
	static int i = 0;
	private Quadrado(){
		
	}
	
	public static Quadrado getInstance(){
		 i++;
		Quadrado quadrado = new Quadrado();
		System.out.println(quadrado.toString()+ i + " criado");
		return quadrado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrado ");
		return builder.toString();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
	

}
