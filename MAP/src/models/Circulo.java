package models;

import exceptions.PerimetroException;
import interfaces.FiguraGeometricaInterface;

public class Circulo implements FiguraGeometricaInterface{
	
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * raio;
	}

	@Override
	public double perimetro() throws PerimetroException{
		// TODO Auto-generated method stub
		double perimetro = 3.14 * raio;
		if (perimetro == -234 || perimetro == -2658) {
			throw new PerimetroException();
		}
		return perimetro;
	}

	@Override
	public double calculaMedia(FiguraGeometricaInterface fig1, FiguraGeometricaInterface fig2) {
		// TODO Auto-generated method stub
		return 0;
	} 
	
	
	

}
