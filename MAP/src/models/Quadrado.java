package models;

import exceptions.NumeroNegativoException;
import interfaces.FiguraGeometricaInterface;

public class Quadrado implements FiguraGeometricaInterface {

	private double lado;

	public Quadrado(double lado) throws NumeroNegativoException {
		if (lado < 0) {
			throw new NumeroNegativoException();
		}

		this.lado = lado;

	}

	@Override
	public double area() {
		return this.lado * 2;
	}

	@Override
	public double perimetro() {
		return this.lado * 4;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) throws Exception {
		if (lado < 0) {
			throw new NumeroNegativoException();
		}
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Quadrado [lado = " + lado + "]";
	}

}