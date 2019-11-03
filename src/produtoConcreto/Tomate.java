package produtoConcreto;

public class Tomate {
	
	private static Tomate instancia;
	
	public Tomate() {
		// TODO Auto-generated constructor stub
	}
	
	public static Tomate getInstance() {
		instancia = new Tomate();
		return instancia;
	}
		
	@Override
	public String toString() {
		return "Tomate";
	}
}
