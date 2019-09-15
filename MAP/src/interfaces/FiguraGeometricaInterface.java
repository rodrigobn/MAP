package interfaces;

import exceptions.PerimetroException;

public interface FiguraGeometricaInterface {
	
	public double area();
	public double perimetro() throws PerimetroException;
	public double calculaMedia(FiguraGeometricaInterface fig1, FiguraGeometricaInterface fig2);
}
