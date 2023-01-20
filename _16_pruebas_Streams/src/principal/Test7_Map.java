package principal;

import java.util.List;

public class Test7_Map {

	public static void main(String[] args) {
		
		//¿Cuantos productos, no repetidos, tienen mas de 6 caracteres?		
		List<String> nombres=List.of("leche","atún","vino","patatas","leche","agua","vino","lechuga");
		//solucion 1
		nombres.stream()
		.distinct()
		.filter(s->s.length()>6)
		.count();
		
		//solucion 2
		System.out.println(nombres.stream()
		.distinct()//Stream<String>
		.map(s->s.length())//Stream<Integer> integer por que .length devuelve un entero
		.filter(n->n>6)
		.count());	
		//muestra 2
		//.map te devuelve un Stream de lo que le pasemos en este caso
		// cada palabra en transformada en en tamaño 
		//por ejemplo leche lo transforma a 4
		
		//suma del total de caracteres de todas las cadenas no repetidas
		System.out.println(nombres.stream()
		.distinct()//Stream<String> Stream de texto 
		.mapToInt(s->s.length())//transforma un texto en un numero entero IntStream
		.sum());//suma el total de caracteres 
		
	}
}
