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

public class Maximizar implements VisitorIF {

	@Override
	public double visitaCirculo(Circulo c) {
		System.out.println("Maximizando Raio do Circulo: " + 2 * c.getRaio());
		return 2 * c.getRaio();
	}

	@Override
	public double visitaTriangulo(Triangulo t) {
		System.out.println("Maximizando a Altura do Triangulo: " + 2 * t.getAltura());
		System.out.println("Maximizando a Base do Triangulo: " + 2 * t.getBase());
		System.out.println("Maximizando o Lado do Triangulo: " + 2 * t.getLado());
		return 0;
	}

	@Override
	public double visitaRetangulo(Retangulo r) {
		System.out.println("Maximizando a Altura do Retangulo: " + 2 * r.getAltura());
		System.out.println("Maximizando a Largura do Retangulo: " + 2 * r.getLargura());
		return 0;
	}

	@Override
	public double visitaTrapezio(Trapezio t) {
		System.out.println("Maximizando a Altura do Trapezio: " + 2 * t.getAltura());
		System.out.println("Maximizando a Base Menor do Trapezio: " + 2 * t.getBaseMenor());
		System.out.println("Maximizando a Base Maior do Trapezio: " + 2 * t.getBaseMaior());
		System.out.println("Maximizando o Lado do Trapezio: " + 2 * t.getLado());
		return 0;
	}

}
