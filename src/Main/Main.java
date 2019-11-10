package Main;

public class Main {

	public static void main(String[] args) {
	
	System.out.println("Sanduiche 1");
	Sanduiche sanduiche1 = new FabricaSanduiche1().montaSanduiche();
	System.out.println(sanduiche1.toString());
	
	System.out.println("Sanduiche 2");
	Sanduiche sanduiche2 = new FabricaSanduiche2().montaSanduiche();
	System.out.println(sanduiche2.toString());
	
	System.out.println("Sanduiche 3");
	Sanduiche sanduiche3 = new FabricaSanduiche3().montaSanduiche();
	System.out.println(sanduiche3.toString());
	}
}
