package net.ausiasmarch.examen2EvalED.pregunta2;

import java.util.ArrayList;
import java.util.List;


public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		List<FormaGeometrica> listaFormas = new ArrayList<FormaGeometrica>(10);
		

		
		Triangulo t1 = new Triangulo("blanco", false, 12, 34);
		Triangulo t2 = new Triangulo("verde", true, 7, 11);
		Triangulo t3 = new Triangulo("amarillo", false, 14, 3);
		
		Rectangulo r1 = new Rectangulo("naranja", false, 2, 4);
		Rectangulo r2 = new Rectangulo("gris", true, 28, 5);
		Rectangulo r3 = new Rectangulo("naranja", true, 22, 26);
		
		

		listaFormas.add(t1);
		listaFormas.add(t2);
		listaFormas.add(t3);
		listaFormas.add(r1);
		listaFormas.add(r2);
		listaFormas.add(r3);


		for ( FormaGeometrica fm: listaFormas ) {			
			
			System.out.println(fm.toString());
			System.out.println("Quien soy? "+fm.quienSoy());
			System.out.println("Area = "+fm.area());
			System.out.println("Volumen = "+fm.volumen());

		}
		
	}

}
