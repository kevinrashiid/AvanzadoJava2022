package principal;

import java.util.List;

public class Test9_peek {

	public static void main(String[] args) {

		List<Integer> nums=List.of(6,11,-4,6,-7,327,-9,11,41,19);
		//hacer un programa que muestre los positivos no repetidos y nos diga cuantos hay 
		System.out.println("total: "+nums.stream()
		.distinct()
		.filter(s->s>0)
		.peek(p->System.out.println(p))
		.count());
		//peek() es como un forEach pero este es intermedio el forEach es final
		//despues de un .stream tiene que haber metodo intermedio y para cerrar final
		//si no hay un final y quitamos en este ejemplo el .count() no mostraria nada
		//pero no hace falta que para tener un metodo final tengamos intermedios
		
		//peek sirve para hacer mas de una operacion despues despues de la funcion peek
	}
}