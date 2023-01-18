package principal;

import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,6,-7,327,6,-9,11,41,19);
		//muestra los primeros 7 numeros de la lista, 
		//sin contar los duplicados
		/*nums.stream()
		.distinct()
		.limit(7)
		.forEach(n->System.out.println(n));*/
		
		
	//hay algun negativo??
	System.out.println("hay algun numero negativo?? \n"
	+nums.stream()
	.anyMatch(n->n<0));
	
	//son todos pares?
	System.out.println("Son todos pares?? \n" 
	+nums.stream()
	.allMatch(n->n%2==0));	
	}
}