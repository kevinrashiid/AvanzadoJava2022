package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Function;

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
		//lambdas con implementacion de interface de PREDICATE
		System.out.println("Suma pares: "+service.sumaPorCriterio(nums, t->t%2==0));//la t es la referencia a los parametros
		System.out.println("Suma positivos: "+service.sumaPorCriterio(nums, t->t>0));

		//imprime los numeros de la lista:
		//lambdas con implementacion de interface de CONSUMER
		service.procesaLista(nums,t->System.out.println(t));

		//lambdas que imprimen los numeros pares de la lista
		//lambdas con implementacion de interface de CONSUMER Y PREDICATE
		service.metodoEn1(nums, x->System.out.println(x),x->x%2==0);

		//guarda en fichero los positivos de la lista
		service.metodoEn1(nums, 
				x->{
					//para guardar en un fichero los positivos de la lista
					String ruta="c:\\temp\\lambda.txt";
					try(FileOutputStream fos=new FileOutputStream(ruta,true);
							PrintStream out=new PrintStream(fos);){
						out.println(x);
					}
					catch(IOException ex) {
						ex.printStackTrace();
					}
				}, 
				x->x>0);
		//suma de los cuadrados de la lista
		//lambdas con implementacion de interface de FUNCTION
		System.out.println(service.sumaTransformados(nums, t->t*t));
		
		//lo mismo que el anterior peor con UnaryOperator
		//lambdas con implementacion de interface de UnaryOperator
		System.out.println(service.sumaTransformados2(nums, t->t*t));
		
		//suma de los cuadrados de las raices cubicas de cada elemento
		//con el metodo andThen de function
		Function<Integer,Integer> f1=a->a*a;//creaccion de variable Function
		Function<Integer,Integer> f2=a->(int)Math.pow(a, 1.0/3);
		System.out.println(service.sumaTransformados(nums,f2.andThen(f1)));
		
		//suma de los elementos de la lista mas un un numero aleatorio(entre 1 y 100)
		//supplier no tiene no recibe ningun parametro por eso de los parentesis vacios
		//lambdas con implementacion de interface de SUPPLIER
		System.out.println(service.sumaListaConValor(nums,()->(int)(Math.random()*100+1)));
		
		//total de vocales de las que empiezan por "a"
		List<String> cadena=List.of("salida","armario","luna","armarillo");
		System.out.println(service.listatString(cadena, c->{
			int vocales=0;
			for(int i=0;i<c.length();i++) {
				switch(c.charAt(i)) {
				case 'a','e','i','o','u':
					vocales++;
				}
			}
			return vocales;
		}, c->c.startsWith("a")));
		
		//total de caracteres de las que 
		
		
		//pregunta de examen 
		//cual de esas lambdas es una correcta implementacio de predicate function
		//cual de estas lambdas esta mal 
	}
}