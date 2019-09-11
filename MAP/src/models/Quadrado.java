package models;

import interfaces.FiguraGeometricaInterface;

public class Quadrado implements FiguraGeometricaInterface {

	private double largura;
	
	public Quadrado(double lado) {
		this.largura = lado;	
	}

	@Override
	public double area() {
		return this.largura * 2;
	}

	@Override
	public double perimetro() {
		return this.largura * 4;
	}

	public double getLado() {
		return largura;
	}

	public void setLado(double lado) {
		this.largura = lado;
	}

	@Override
	public int compareTo(FiguraGeometricaInterface o) {
		if (this.getLado() == ((Quadrado) o).getLado()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Quadrado [lado = " + largura + "]";
	}

	@Override
	public double calculaMedia(FiguraGeometricaInterface fig1, FiguraGeometricaInterface fig2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
