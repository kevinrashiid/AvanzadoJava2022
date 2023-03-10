package principal;

import java.util.Arrays;
import java.util.List;

public class Test8_FlatMap {

	public static void main(String[] args) {
		
		//dadas las notas de un centro de formacion,donde cada Array
		//contiene las notas de un aula, calcular la media global
		List<double[]> notas=List.of(new double[]{3.5,7,8.9},
				new double[]{2.4,5,1,9,6.7},
				new double[]{5.6,3.2,8,10},
				new double[]{9.1,4});
			//hacerlo con flatMap
		 System.out.printf("La media es: "+notas.stream()
		 .flatMapToDouble(s->Arrays.stream(s)) //aplanamos 
		 .average()//sacamos media del array que nos pasa 
		 .orElse(0.0));//por si da 0 y para que no nos aparesca Optional
		 //.flatMapToDouble por que tenemos arrays de dobles
		 //si tenemos listas dentro de otras listas tendremos
		 //que utilizar flatMap o sus variantes
	}	
}
