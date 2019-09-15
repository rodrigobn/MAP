package interfaces;

import exceptions.NumeroNegativoException;

public interface FiguraGeometricaTeste {
	
	
	public void isNull();
	
	
	public void isFiguraComplete() throws NumeroNegativoException;
	
	public void figuraComParametroInvalido();
	
	
	public void area() throws NumeroNegativoException;
	
	

	public void perimetro() throws NumeroNegativoException;
	

}
