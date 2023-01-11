package principal;

import geometria.Circulo;
import geometria.Figura;
import geometria.Triangulo;

public class TestConPolimorfismo {

	public static void main(String[] args) {
	//hacer un programa de prueba que cree un objeto circulo y un triangulo
	//y muestre la informacion(color y superficie) de cada figura
		mostrarDatosFigura(new Circulo("Azul",4));
		mostrarDatosFigura(new Triangulo("Amarillo",3,7));
		
	}
	static void mostrarDatosFigura(Figura f) {
		System.out.println("Tipo de figura: "+f.getClass().getName());
		System.out.println("Color:"+f.getColor());
		System.out.println("Superficie:"+f.superficie());
	}

}
