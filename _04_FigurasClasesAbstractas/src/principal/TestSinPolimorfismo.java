package principal;

import geometria.Circulo;
import geometria.Triangulo;

public class TestSinPolimorfismo {

	public static void main(String[] args) {
		//hacer un programa de prueba que cree un objeto circulo y un triangulo
		//y muestre la informacion(color y superficie) de cada figura
		
		Circulo circulo=new Circulo("Azul",4);
		Triangulo triangulo=new Triangulo("Amarillo",3,7);
		System.out.println("Tipo de figura: Circulo");
		System.out.println("Color:"+circulo.getColor());
		System.out.println("Superficie:"+circulo.superficie());
		System.out.println("Tipo de figura: Triangulo");
		System.out.println("Color:"+triangulo.getColor());
		System.out.println("Superficie:"+triangulo.superficie());
		
	}

}
