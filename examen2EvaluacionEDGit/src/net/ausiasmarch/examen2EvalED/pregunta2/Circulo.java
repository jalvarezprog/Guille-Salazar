package net.ausiasmarch.examen2EvalED.pregunta2;


public class Circulo extends FormaGeometrica {

	private double radio;
	// Constructor
	public Circulo(String color, boolean relleno, int radio) {
		super(color, relleno);
		this.radio = radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return radio * radio * Math.PI;
	}
	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String quienSoy() {
		// TODO Auto-generated method stub
		return "Soy un circulo";
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "," + super.toString() + "]";
	}

	

}
