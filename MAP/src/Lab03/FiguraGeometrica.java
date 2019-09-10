package Lab03;

public interface FiguraGeometrica extends Comparable<FiguraGeometrica> {
	
	abstract float area();
	abstract float perimetro();
	default float calculaMedia(FiguraGeometrica fig1, FiguraGeometrica fig2) {
		return ( fig1.area() + fig2.area() ) / 2;
	}
}
