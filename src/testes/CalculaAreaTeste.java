package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ConcretsElements.Circulo;
import ConcretsElements.Retangulo;
import ConcretsElements.Trapezio;
import ConcretsElements.Triangulo;
import Visitors.CalcularArea;
import Visitors.VisitorIF;
import exceptions.NumeroNegativoException;

public class CalculaAreaTeste {
	CalcularArea calcularArea;
	Circulo circulo;
	Retangulo retangulo;
	Trapezio trapezio;
	Triangulo triangulo;
	VisitorIF visitorCalculaArea = new CalcularArea();;
	
	@Test
	public void visitaCirvulo() throws NumeroNegativoException {
		circulo = new Circulo(2);
		assertEquals(visitorCalculaArea.visitaCirculo(circulo), 12.56);
	}
	
	@Test
	public void visitaRetangulo() throws NumeroNegativoException {
		retangulo = new Retangulo(10, 5);
		assertEquals(visitorCalculaArea.visitaRetangulo(retangulo), 50);
	}
	
	@Test
	public void visitaTrapezio() throws NumeroNegativoException {
		trapezio = new Trapezio(5, 10, 15, 3);
		assertEquals(visitorCalculaArea.visitaTrapezio(trapezio), 112.5);
	}
	
	@Test
	public void visitaTriangulo() throws NumeroNegativoException {
		triangulo = new Triangulo(5, 10, 15);
		assertEquals(visitorCalculaArea.visitaTriangulo(triangulo), 75);
	}
}
