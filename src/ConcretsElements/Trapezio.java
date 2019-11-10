/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcretsElements;

import Visitors.VisitorIF;
import exceptions.NumeroNegativoException;

public class Trapezio implements ElementoConcretoIF {
	private double baseMenor;
	private double baseMaior;
	private double altura;
	private double lado;

	public Trapezio(double baseMenor, double baseMaior, double altura,
			double lado) throws NumeroNegativoException {
		if (altura < 0 || lado < 0 || baseMaior <0 || baseMaior < 0) {
			throw new NumeroNegativoException();
		}
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.altura = altura;
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public double getAltura() {
		return altura;
	}

	@Override
	public void Aceitarvisita(VisitorIF v) {
		v.visitaTrapezio(this);

	}

}
