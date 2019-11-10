/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import ConcretsElements.Circulo;
import ConcretsElements.Retangulo;
import ConcretsElements.Trapezio;
import ConcretsElements.Triangulo;
import Visitors.CalcularArea;
import Visitors.CalcularPerimetro;
import Visitors.Desenhar;
import Visitors.Maximizar;
import Visitors.VisitorIF;
import exceptions.NumeroNegativoException;

public class Main {

	public static void main(String[] args) throws NumeroNegativoException {
		// Instanciar Visitantes
		VisitorIF visitorDS = new Desenhar();
		VisitorIF visitorCA = new CalcularArea();
		VisitorIF visitorCP = new CalcularPerimetro();
		VisitorIF visitorMX = new Maximizar();

		// Instanciar Elementos Concretos
		Circulo circulo = new Circulo(5);
		Triangulo triangulo = new Triangulo(3, 4, 3);
		Retangulo retangulo = new Retangulo(2, 3);
		Trapezio trapezio = new Trapezio(2, 4, 3, 5);

		// Realizar Visitas
		System.out.println("Visitas em Circulo");
		circulo.Aceitarvisita(visitorDS);
		circulo.Aceitarvisita(visitorCA);
		circulo.Aceitarvisita(visitorCP);
		circulo.Aceitarvisita(visitorMX);
		System.out.println("\nVisitas em Triangulo");
		triangulo.Aceitarvisita(visitorDS);
		triangulo.Aceitarvisita(visitorCA);
		triangulo.Aceitarvisita(visitorCP);
		triangulo.Aceitarvisita(visitorMX);
		System.out.println("\nVisitas em Retangulo");
		retangulo.Aceitarvisita(visitorDS);
		retangulo.Aceitarvisita(visitorCA);
		retangulo.Aceitarvisita(visitorCP);
		retangulo.Aceitarvisita(visitorMX);
		System.out.println("\nVisitas em Trapezio");
		trapezio.Aceitarvisita(visitorDS);
		trapezio.Aceitarvisita(visitorCA);
		trapezio.Aceitarvisita(visitorCP);
		trapezio.Aceitarvisita(visitorMX);

	}
}
