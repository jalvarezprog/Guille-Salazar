package net.ausiasmarch.examen2EvalED.pregunta2;


abstract public class FormaGeometrica {

	private String color;
	private boolean relleno;

	// Constructor
	public FormaGeometrica (String color, boolean isRelleno) {
		this.color = color;
		this.relleno = isRelleno;
	}

	public abstract double area() ;
	public abstract double volumen() ;
	public abstract String quienSoy();

	@Override
	public String toString() {
		return "color=" + color + ", relleno=" + relleno;
	}


	




}