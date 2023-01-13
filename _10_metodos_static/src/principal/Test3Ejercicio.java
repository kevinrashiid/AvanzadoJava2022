package principal;

import java.util.ArrayList;
import java.util.List;

/*Crear una lista de numeros con los valores 7,15y 9*/

public class Test3Ejercicio {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<>();
		num.add(7);
		num.add(15);
		num.add(9);
		
		//Interface List
		List<Integer> lista2=List.of(7,15,9);
	}
}