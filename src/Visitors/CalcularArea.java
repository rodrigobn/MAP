/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitors;

import ConcretsElements.Circulo;
import ConcretsElements.Retangulo;
import ConcretsElements.Trapezio;
import ConcretsElements.Triangulo;

public class CalcularArea implements VisitorIF {

	@Override
	public double visitaCirculo(Circulo c) {
		double area = 2 * 3.14 * c.getRaio();
		System.out.println("햞ea do Circulo: " + area);
		
		return area;
	}

	@Override
	public double visitaTriangulo(Triangulo t) {
		double area = t.getBase() * t.getAltura()/ 2;
		System.out.println("햞ea do Triangulo: " + area);
		return area; 
	}

	@Override
	public double visitaRetangulo(Retangulo r) {
		double area = r.getAltura()
				* r.getLargura();
		System.out.println("햞ea do Retangulo: " + area);
		return area;
	}

	@Override
	public double visitaTrapezio(Trapezio t) {
		double area =(t.getBaseMenor() + t.getBaseMaior()) * t.getAltura() / 2;
		System.out.println("햞ea do Trapezio: " + area
				);
		return area;
	}

}
