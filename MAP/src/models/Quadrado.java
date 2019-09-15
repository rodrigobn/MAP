package models;

import interfaces.FiguraGeometricaInterface;

public class Quadrado implements FiguraGeometricaInterface {

	private double lado;
	
	public Quadrado(double lado) {
		
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
			this.lado = lado;
	}


	@Override
	public String toString() {
		return "Quadrado [lado = " + lado + "]";
	}

	@Override
	public double calculaMedia(FiguraGeometricaInterface fig1, FiguraGeometricaInterface fig2) {
		return ( fig1.area() + fig2.area() ) / 2;
	}

}