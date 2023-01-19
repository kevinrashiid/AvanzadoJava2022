package principal;

import java.util.List;

public class Test5_Ordenacion {

	public static void main(String[] args) {
		
		List<Integer> nums=List.of(6,11,-4,6,-7,327,-9,11,41,19);
		//Mostrar el numero negativo mas pequeño
		nums.stream()
		.filter(a->a<0)//filtra mediante la condicion
		.sorted()//ordena de menor a mayor
		.findFirst()//optional<Integer>
		.ifPresentOrElse((n->System.out.println(n)), ()->System.out.println("no hay negativos"));
		//este .ifPresentOrElse() es mas completo si hay algo te lo saca y si no te saca el otro mensaje
		
		//.ifPresent(n->System.out.println(n));
		//si hay valor te lo muestra y si no, no hace nada
		//.get()//.get por que si no se pone te da un opcional
		
		
	}
}
