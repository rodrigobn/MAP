package interfaces;

public interface FiguraGeometricaInterface extends Comparable<FiguraGeometricaInterface> {
	
	public double area();
	public double perimetro();
	public double calculaMedia(FiguraGeometricaInterface fig1, FiguraGeometricaInterface fig2);
}
