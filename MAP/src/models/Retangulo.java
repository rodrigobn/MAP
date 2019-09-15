package models;

import interfaces.FiguraGeometricaInterface;

public class Retangulo implements FiguraGeometricaInterface {
	
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura ) {
		this.altura = altura;
		this.largura = largura;
	}
	
	

	public double getAlturaRetangulo() {
		return altura;
	}




	public void setAlturaRetangulo(double alturaRetangulo) {
		this.altura = alturaRetangulo;
	}




	public double getLarguraRetangulo() {
		return largura;
	}




	public void setLarguraRetangulo(double larguraRetangulo) {
		this.largura = larguraRetangulo;
	}




//	@Override
//	public int compareTo(FiguraGeometricaInterface arg0) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.altura * this.largura;
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * this.largura;
	}
	@Override
	public double calculaMedia(FiguraGeometricaInterface fig1, FiguraGeometricaInterface fig2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
