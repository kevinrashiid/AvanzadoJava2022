package principal;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		//lista de numeros
		List<Integer> nums=List.of(6,11,-4,6,-7,327,-9,11,41,19);
		//metodo .stream().count para saber el tamaño de la lista
		System.out.println(nums.stream().count());
		
		//metodo forEach() muestra cada elemento	
		nums.stream().forEach(n->System.out.println(n));
		
		//METODOS INTERMEDIOS
		//metodo muestra los elementos SIN duplicados 
		//solo aparece uno de los duplicados
		nums.stream()
		.distinct() //este es el metodo
		.forEach(n->System.out.println(n));
		
		//metodo limit() extrae los n primeros elementos del mismo
		

		//metodo skip salta los n primeros elementos 
	}

}
