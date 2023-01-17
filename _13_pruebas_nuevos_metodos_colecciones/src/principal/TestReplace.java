package principal;

import java.util.ArrayList;
import java.util.List;

public class TestReplace {

	public static void main(String[] args) {
		//otra forma de crear un List inmutable pero al ponerlo dentro
		//de los () del ArrayList los haces mutable/modificable
		List<Integer> nums=new ArrayList<>(List.of(8,2,5,11,4));
		/*reemplazar cada elemento de la lista por su cuadrado
		//forma tradional 
		for(int i=0;i<nums.size();i++) {
			nums.set(i, nums.get(i)*nums.get(i));
		}*/
		//programacion funcional (replaceAll)
		nums.replaceAll(n->n*n);
		
		nums.forEach(n->System.out.println(n));
		
	}

}
