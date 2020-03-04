package net.ausiasmarch.examen2EvalED.pregunta2;



public class Rectangulo extends FormaGeometrica {  
	// Private member variables
	private int alto;
	private int ancho;
	
	private int numeroAristas;

	// Constructor
	public Rectangulo(String color, boolean relleno, int alto, int ancho) {
		super(color, relleno);
		this.alto = alto;
		this.ancho = ancho;
	}

	
	
	
	public int getNumeroAristas() {
		return numeroAristas;
	}




	public void setNumeroAristas(int numeroAristas) {
		this.numeroAristas = numeroAristas;
	}




	@Override
	public double area() {
		return alto*ancho;
	}

	@Override
	public double volumen() {
		return 0;
	}

	@Override
	public String quienSoy() {
		// TODO Auto-generated method stub
		return "Soy un Rectangulo\n";
	}

	@Override
	public String toString() {
		return "Rectangulo [alto=" + alto + ", ancho=" + ancho + "," + super.toString() + "]";
	}

	public int getAlto() {
		return alto;
	}

	public int getAncho() {
		return ancho;
	}
	
	
	
	
	
	

}