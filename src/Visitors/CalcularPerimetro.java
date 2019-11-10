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

public class CalcularPerimetro implements VisitorIF {

	@Override
	public double visitaCirculo(Circulo c) {
		double perimetro = 2 * 3.14 * c.getRaio();
		System.out.println("Perimetro do Circulo: " + perimetro);
		return perimetro;
	}

	@Override
	public double visitaTriangulo(Triangulo t) {
		double perimetro = 3*t.getLado();
		System.out.println("Perimetro do Triangulo: " + perimetro);
		
		return perimetro;
	}

	@Override
	public double visitaRetangulo(Retangulo r) {
		double perimetro =2 * (r.getAltura() + r.getLargura()); 
		System.out.println("Perimetro do Retangulo: " + perimetro);
		return perimetro;
	}

	@Override
	public double visitaTrapezio(Trapezio t) {
		double perimetro = (t.getBaseMenor() + t.getBaseMaior()+ 2*t.getLado());
		System.out.println("Perimetro do Trapezio: " + perimetro);
		return perimetro;
	}
}