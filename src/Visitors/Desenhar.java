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

public class Desenhar implements VisitorIF {

	@Override
	public double visitaCirculo(Circulo c) {
		System.out.println("Circulo desenhado...");
		return 0;
	}

	@Override
	public double visitaTriangulo(Triangulo c) {
		System.out.println("Triangulo desenhado...");
		return 0;
	}

	@Override
	public double visitaRetangulo(Retangulo c) {
		System.out.println("Retangulo desenhado...");
		return 0;
	}

	@Override
	public double visitaTrapezio(Trapezio c) {
		System.out.println("Trapezio desenhado...");
		return 0;
	}
    
}
