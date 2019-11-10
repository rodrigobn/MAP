/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcretsElements;

import Visitors.VisitorIF;
import exceptions.NumeroNegativoException;

public class Triangulo implements ElementoConcretoIF {
	private double base;
	private double altura;
	private double lado;

	public Triangulo(double lado, double base, double altura) throws NumeroNegativoException {
		
		if(lado <0 || base <0 || altura < 0) {
			throw new NumeroNegativoException();
		}
		this.lado = lado;
		this.base = base;
		this.altura = altura;
	}

	public double getLado() {
		return lado;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public void Aceitarvisita(VisitorIF v) {
		v.visitaTriangulo(this);
	}

	

}
