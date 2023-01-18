package principal;

import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,6,-7,327,6,-9,11,41,19);
		//muestra los primeros 7 numeros de la lista, 
		//sin contar los duplicados
		nums.stream()
		.distinct()
		.limit(7)
		.forEach(n->System.out.println(n));
		
		//hay algun negativo??
		//son todos pares?
	}

}
