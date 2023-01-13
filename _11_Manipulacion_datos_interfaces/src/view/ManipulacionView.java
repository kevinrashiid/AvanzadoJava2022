package view;

import java.util.List;
import java.util.function.Predicate;

import service.ManipulacionService;
/*Realizar un programa que permita mostrar el resultado 
de sumar los pares una lista de números enteros*/
public class ManipulacionView {

	public static void main(String[] args) {
		//esto es para crear listas inmutables 
		//que no sean modificables
		List<Integer> nums	= List.of(3,8,2,11,4); 
		//nums.add(20);  //excepcion por que no se puede añadir ni modificar  
		ManipulacionService service=new ManipulacionService();
		
		//mostrar suma de los pares por un lado y suma de los positivos por otro
		/*service.sumaPorCriterio(nums, new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				return t%2==0;//te devuelve true si es par
			
			}
		});
		
		//ahora los positivos 
		//hacemos lo mismo que el de arriba pero no lo metemos en una variable
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums,new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				return t>0; //devuelve true si positivo
			}
		}));*/
		
		/*todo el codigo que hay entre las lineas 19 al 35 se reduce en estas dos lineas*/
		System.out.println("Suma pares: "+service.sumaPorCriterio(nums, t->t%2==0));//la t es el parametro
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums, t->t>0));

	}
}
