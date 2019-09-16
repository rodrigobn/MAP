package models;

import exceptions.NumeroNegativoException;
import interfaces.FiguraGeometricaInterface;

public class Retangulo implements FiguraGeometricaInterface {
	
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura ) throws NumeroNegativoException {
		if (altura < 0 || largura < 0) {
			throw new NumeroNegativoException();
		}
		this.altura = altura;
		this.largura = largura;
	}
	
	

	public double getAlturaRetangulo() {
		return altura;
	}




	public void setAlturaRetangulo(double alturaRetangulo) throws NumeroNegativoException {
		if ( alturaRetangulo < 0) {
			throw new NumeroNegativoException();
		}
		this.altura = alturaRetangulo;
	}




	public double getLarguraRetangulo() {
		return largura;
	}




	public void setLarguraRetangulo(double larguraRetangulo) throws NumeroNegativoException {
		if ( largura < 0) {
			throw new NumeroNegativoException();
		}
		this.largura = larguraRetangulo;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.altura * this.largura;
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * (this.largura + this.altura);
	}
	
	

}
