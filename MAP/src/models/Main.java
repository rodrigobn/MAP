package models;

import interfaces.FiguraGeometricaInterface;

public class Main {

	public static void main(String[] args) throws Exception {
		FiguraGeometricaInterface quadrado1 = new Quadrado(10);
		FiguraGeometricaInterface quadrado2 = new Quadrado(20);
		
		System.out.println("\nAreas das figuras geometricas:");
		System.out.println(quadrado1.toString() + " Area = " + quadrado1.area());
		System.out.println(quadrado2.toString() + " Area = " + quadrado2.area());
		
		System.out.println("\nPerimetros das figuras geometricas:");
		System.out.println(quadrado1.toString() + " Perimetro = " + quadrado1.perimetro());
		System.out.println(quadrado2.toString() + " Perimetro = " + quadrado2.perimetro());
		
		System.out.println("\nMedias entre duas figuras geometricas:");
		System.out.println("Media entre " + quadrado1.toString() + " e " + quadrado2.toString());
		System.out.println(quadrado1.calculaMedia(quadrado1, quadrado2));
		
		System.out.println("\nCompara��o entre dois quadrados: \n 0 -> n�o � igual \n-1 -> � igual");
		System.out.println(quadrado1.compareTo(quadrado2));

	}

}
