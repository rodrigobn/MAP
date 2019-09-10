package Lab03;

public class Quadrado implements FiguraGeometrica {

	private float lado;
	
	public Quadrado(float lado) {
		this.setLado(lado);		
	}

	@Override
	public float area() {
		return this.getLado() * 2;
	}

	@Override
	public float perimetro() {
		return this.getLado() * 4;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public int compareTo(FiguraGeometrica o) {
		if (this.getLado() == ((Quadrado) o).getLado()) {
			return -1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "Quadrado [lado = " + lado + "]";
	}

}
