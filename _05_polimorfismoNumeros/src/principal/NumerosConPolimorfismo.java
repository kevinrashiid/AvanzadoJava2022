package principal;

public class NumerosConPolimorfismo {

	public static void main(String[] args) {
		
		/*Realizar una clase con un método.
		Ese método recibirá un objeto numerico,del tipo que sea, 
		y mostrará el valor del mismo.*/
		
		mostrarValorNumerico(32);
		mostrarValorNumerico(45.32);
		mostrarValorNumerico(4L);
	}
	public static void mostrarValorNumerico(Number n) {//Number es la clase padre de los objetos numericos
		System.out.println(n.intValue());//intValue devuelve el valor entero
	}

}
