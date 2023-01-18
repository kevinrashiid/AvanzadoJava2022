package principal;

import java.util.List;

public class TestForEach {

	public static void main(String[] args) {
		
		List<Integer>numes=List.of(8,2,4,6,8,4,11);
		//la forma tradicional de recorrer con un forEach
		for(int n:numes) {
			System.out.println(n);
		}
		//forma de recorrer con un metodo forEach 
		//programacion funcional
		numes.forEach(n->System.out.println(n));
		//este metodo es muy util

	}
}
