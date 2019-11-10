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

/**
 *
 * @author usuario
 */
public interface VisitorIF {

public double visitaCirculo(Circulo c);
 
public double visitaTriangulo(Triangulo c);

public double visitaRetangulo(Retangulo c);

public double visitaTrapezio(Trapezio c);
}
