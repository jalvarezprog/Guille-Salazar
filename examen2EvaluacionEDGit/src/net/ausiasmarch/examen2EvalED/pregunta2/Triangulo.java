package net.ausiasmarch.examen2EvalED.pregunta2;


public class Triangulo extends FormaGeometrica {
	// Private member variables
	private int base;
	private int altura;

	// Constructor
	public Triangulo(String color, boolean relleno, int base, int altura) {
		super(color, relleno);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0.5*base*altura;
	}


	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String quienSoy() {
		// TODO Auto-generated method stub
		return "Soy un triangulo";
	}
	
	@Override
	public String toString() {
		return "Triangle[base=" + base + ",altura=" + altura + "," + super.toString() + "]";
	}
}