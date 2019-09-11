package models;

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
	public int compareTo(FiguraGeometricaInterface o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * raio;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 3.14 * raio;
	}

	@Override
	public double calculaMedia(FiguraGeometricaInterface fig1, FiguraGeometricaInterface fig2) {
		// TODO Auto-generated method stub
		return 0;
	} 
	
	
	

}
