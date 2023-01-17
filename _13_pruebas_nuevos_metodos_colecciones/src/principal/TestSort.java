package principal;

import java.util.ArrayList;
import java.util.List;

public class TestSort {
	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>(List.of(8,6,5,11,4));
		//ordenar de menor a mayor
		/*nums.sort((a,b)->{
			if(a>b) {
				return 1;
			}else if(a<b) {
				return -1;
			}else {
				return 0;
			}
		});*/
		//el codigo desde la linea 12 a la 20 se reduce a las siguientes lineas 
		//ordenar de menor a mayor
		
		System.out.println("1.-USANDO .sort de menor a mayor");
		nums.sort((a,b)->a-b);
		nums.forEach(n->System.out.println(n)); 
		
		//ordenar de mayor de menor
		//la resta al reves
		System.out.println("----------------------\n2.-USANDO .sort de mayor a menor");
		nums.sort((a,b)->b-a);
		nums.forEach(n->System.out.println(n));
		
		//ordenar por numero de caracteres/cantidad de letras
		System.out.println("----------------------\n3.-USANDO .sort con texto");
		List<String> cadena=new ArrayList<String>(List.of("salida","armario","luna","armarillo"));
		cadena.sort((a,b)->a.length()-b.length());
		cadena.forEach(n->System.out.println(n));
		
		//ordenar lexicograficamente/alfabeticamente
		System.out.println("----------------------\n4.-USANDO .compareTo");
		List<String> cadena2=new ArrayList<String>(List.of("salida","armario","luna","armarillo"));
		cadena2.sort((a,b)->a.compareTo(b));
		cadena.forEach(n->System.out.println(n));
	}
}