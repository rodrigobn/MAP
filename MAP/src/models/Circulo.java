package models;

import exceptions.NumeroNegativoException;
import interfaces.FiguraGeometricaInterface;

public class Circulo implements FiguraGeometricaInterface {

	private double raio;

	public Circulo(double raio) throws NumeroNegativoException {
		if (raio < 0) {
			throw new NumeroNegativoException();
		}
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) throws NumeroNegativoException {
		if (raio < 0) {
			throw new NumeroNegativoException();
		}
		this.raio = raio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * raio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		double perimetro = 3.14 * raio;

		return perimetro;
	}

}
