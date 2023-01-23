package principal;

import java.util.List;
import java.util.stream.Collectors;

public class Test_11_OtrosCollect {

	public static void main(String[] args) {

		List<Integer> nums=List.of(6,2,5,1,3,22);
		//mostrar la suma de todos los elementos de la lista
		System.out.println(
				nums.stream() //Stream<Integer>
				.mapToInt(n->n)//IntStream
				.sum());
		//utilizando collect nos hace la linea de mapToInt y sum
		System.out.println(
					nums.stream()
					.collect(Collectors.summingInt(n->n)));
		//metodo summingInt suma todos los entero que 
	}
}
