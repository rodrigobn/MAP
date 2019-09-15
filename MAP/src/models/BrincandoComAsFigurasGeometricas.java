package models;

import exceptions.PerimetroException;

public class BrincandoComAsFigurasGeometricas {

	public static void main(String[] args) throws PerimetroException {

		FigurasGeometricas figura = new FigurasGeometricas(10, 5, 7, 25);
		
		figura.imprimirPerimetroRetangulo();
		figura.imprimirPerimetroQuadrado();
		figura.imprimirPerimetroCirculo();
		
		figura.imprimirAreaQuadrado();
		figura.imprimirAreaRetangulo();
		figura.imprimirAreaCirculo();
		figura.imprimirAreaTodos();
		
		figura.imprimirToStringQuadrado();
		figura.imprimirToStringRetangulo();
		figura.imprimirToStringCirculo();
		figura.imprimirToStringTodos();
//		
	}

}
