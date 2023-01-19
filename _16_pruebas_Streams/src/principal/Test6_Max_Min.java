package principal;

import java.util.List;

public class Test6_Max_Min {

	public static void main(String[] args) {
		
		List<Integer> nums=List.of(6,11,-4,6,-7,327,-9,11,41,19);
		//mostrar el numero positivo mas pequeño
		nums.stream()
		.filter(n->n>0)//filtras con el predicate(condicion)
		.min((a,b)->a-b)//Optional<Integer> ordena de menor a mayor
		//.min((a,b)->b-a)//para que salga de mayor a menor 
		.ifPresentOrElse(n->System.out.println(n),()->System.out.println("Imposible"));
	}

}
