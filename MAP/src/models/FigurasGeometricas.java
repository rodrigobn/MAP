package models;

import exceptions.FigurasDiferentesException;
import exceptions.NumeroNegativoException;
import interfaces.FiguraGeometricaInterface;

public class FigurasGeometricas {

	private Quadrado quadrado;
	private Retangulo retangulo;
	private Circulo circulo;

	public FigurasGeometricas(double altura, double largura, double lado, double raio) throws NumeroNegativoException {
		quadrado = new Quadrado(lado);
		retangulo = new Retangulo(altura, largura);
		circulo = new Circulo(raio);
	}
	
	public String imprimirAreaQuadrado() {

		String area = "A area deste quadrado e: " + quadrado.area();
		
		System.out.println(area);

		return area;

	}

	public String imprimirAreaRetangulo() {

		String area = "A area deste retangulo e: " + retangulo.area();
		System.out.println(area);
		return area;

	}

	public String imprimirAreaCirculo() {
		String area = "A area deste circulo e: " + circulo.area();
		System.out.println(area);
		return area;

	}

	public String imprimirAreaTodos() {
		String area = "Todas as areas sao: " + retangulo.area() + " " + quadrado.area()
				+ " e " + circulo.area() + " retangulo, quadrado e circulo, respectivamente";
		System.out.println(area);
		return area;
	}

	public String imprimirPerimetroQuadrado() {
		String perimetro = "O perimetro do quadrado e: " + quadrado.perimetro() ;
		System.out.println(perimetro);
		return perimetro;

	}

	public String imprimirPerimetroRetangulo() {
		String perimetro = "O perimetro do retangulo e: " + retangulo.perimetro() ;
		System.out.println(perimetro);
		return perimetro;

	}

	public String imprimirPerimetroCirculo() {
		String perimetro = "O perimetro do circulo e: " + circulo.perimetro();
		System.out.println(perimetro);
		return perimetro;
	}


	public String imprimirToStringQuadrado() {
		String toString = "O quadrado criado tem lados de tamanho: " + quadrado.getLado();
		System.out.println(toString);
		return toString;
	}

	public String imprimirToStringRetangulo() {

		String toString = "O retangulo criado tem altura de tamanho: " + retangulo.getAlturaRetangulo() + "e largura de tamanho: "
				+ retangulo.getLarguraRetangulo();
		System.out.println(toString);
		return toString;

	}

	public String imprimirToStringCirculo() {

		String toString = "O circulo criado tem raio de tamanho: " + circulo.getRaio();
		System.out.println(toString);
		return toString;
	}

	public String imprimirToStringTodos() {

		String toString = "O retangulo criado tem altura: " + retangulo.getAlturaRetangulo() + " e largura de: " + retangulo.getLarguraRetangulo()
				+ " O quadrado criado tem lados de: " + quadrado.getLado() + " O circulo criado tem raio de: "
				+ circulo.getRaio();
		System.out.println(toString);
		return toString;

	}
	public double calculaMedia(FiguraGeometricaInterface figura1, FiguraGeometricaInterface figura2) throws FigurasDiferentesException {
		if(figura1.getClass() == figura2.getClass()) {
			double area1 = figura1.area();
			double area2 = figura2.area();
			
			return (area1 + area2)/2;			
		}
		throw new FigurasDiferentesException();		
	}

	public Quadrado getQuadrado() {
		return quadrado;
	}

	public Retangulo getRetangulo() {
		return retangulo;
	}

	public Circulo getCirculo() {
		return circulo;
	}	

}
