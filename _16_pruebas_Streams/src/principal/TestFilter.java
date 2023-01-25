package principal;

import java.util.Arrays;
import java.util.List;

public class TestFilter {

	public static void main(String[] args) {
		
		List<Integer> nums=List.of(6,11,-4,6,-7,327,-9,11,41,19);
		//¿Cuantos numeros pares diferentes hay?
		System.out.println(nums.stream()
		.distinct()//quitamos duplicados
		.filter(n->n%2==0)//nos quedamos con los pares
		.count());
		
		List<String> nombres=List.of("leche","atún","vino","patatas","leche","agua","vino","lechuga");
		//¿Cuantos nombres diferentes de menos de 6 caracteres hay?
		System.out.println(
				nombres.stream()
				.distinct()
				.filter(n->n.length()<6)
				.count());
		
		String nombresSt="leche,atún,vino,patatas,leche,agua,vino,lechuga";
		//aqui transformamos la cadena String(nombresSt) en un Array.stream
		//¿cuantos nombres diferentes de menos de 6 caracteres hay?
		System.out.println(
				Arrays.stream(nombresSt.split(","))  //Stream<String>
				.distinct()
				.filter(n->n.length()<6)
				.count()
				);
	}
}
