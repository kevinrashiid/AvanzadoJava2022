package principal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,6,-7,327,6,-9,11,41,19);
		//muestra los primeros 7 numeros de la lista, 
		//sin contar los duplicados
		/*nums.stream()
		.distinct()
		.limit(7)
		.forEach(n->System.out.println(n));*/
		
		
	//hay ALGUN negativo??
	System.out.println("hay algun numero negativo?? \n"
	+nums.stream()
	.anyMatch(n->n<0));/*ESTE METODO ES ES UN PREDICATE
	 					.anyMatch() es para si hay ALGUN negativo*/
	
	//son TODOS pares?
	System.out.println("Son todos pares?? \n"
	+nums.stream()
	.allMatch(n->n%2==0)); /*ESTE METODO ES ES UN PREDICATE
	  						.anyMatch() es para si son TODOS pares */	
	
	// Creacion de un Stream a partir de un Array
	String[]cads= {"av","vf","ñl"};
	Stream<String> st=Arrays.stream(cads);
	
	 /*Creacion a partir Stream a partir 
	 de una serie discreta de datos*/
	 Stream<Double> st3=Stream.of(1.9,3.5);
	 
	
	//Este metodo te hace un Stream del 1 al 9
	IntStream stint=IntStream.range(1, 10);
	
	//Este metodo te hace un Stream del 1 al 10
	IntStream stint2=IntStream.rangeClosed(1, 10);
	}
}