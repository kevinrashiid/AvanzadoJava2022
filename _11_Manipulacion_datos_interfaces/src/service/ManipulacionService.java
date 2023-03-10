package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
/*Realizar un programa que permita mostrar el resultado 
 de sumar los pares una lista de números enteros*/
public class ManipulacionService {
	/*public int sumaPares(List<Integer>numeros) {
		int suma=0;
		for(int n:numeros) {
			if(n%2==0) {
				suma+=n;
			}
		}
		return suma;
	}
	//ahora hacer un metodo de la suma de todos los numeros positivos 
	//es decir todos los numeros por encima de 0
	public int sumaDePositivos(List<Integer>numeros) {
		int suma=0;
		for(int n:numeros) {
			if(n>0) {
				suma+=n;
			}
		}
		return suma;
	}*/
	
	/*este metodo sirve para sumar por cualquier 
	criterio la condicion que debera cumplir el numero para ser sumado
	se proporciona a traves de un objeto que implementala interfaz Predicate*/
	//hacemos un metodo para todos
	//Predicate por que solo hay un parametro
	public int sumaPorCriterio(List<Integer>numeros,Predicate<Integer> condicion) {
		int suma=0;
		for(int n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}
		return suma;
	}
	
	/*Consumer para procesado de datos,
	(imprimir por pantalla,guardar en un fichero, mandar a la nube)*/
	/*mediante un unico metodo, aplicamos el procesado que nos manden a cada
	elemento de la lista*/
	//metodo que recibe lista de numeros y los imprime
	//metodo que recibe lista de numeros y los guarda en un fichero
	//metodo que recibe lista de numeros y los manda a la nube
	public void procesaLista(List<Integer> numeros2,Consumer<Integer> proceso) {
		
		for(int n:numeros2) {//recores cada elemento de la lista y procesa 
			
			proceso.accept(n);/*metodo abstracto accept, realiza algun tipo de procesamiento
							    con el objeto recibido*/
		}
	}
	
	//metodo que recibe una lista de numeros e imprime los pares
	//metodo que recibe un conjunto de numeros y guarda en un fichero los positivos
	//metodo que recibe una lista y guarda en un fichero los multiplos de cinco
	//metodo que recibe un conjunto de numeros e imprime los negativos
	//Collection es el padre de los Array,List,HashSet etc
	/*Se pone 3 atributos por que nos van a pasar lista, conjuntos, 
	y Predicate para que se haga el metodo mientras que se cumplan la condicion*/
	public void metodoEn1(Collection<Integer> numeros,Consumer<Integer>proceso,Predicate<Integer> criterio) {
		for(int n:numeros) {
			if(criterio.test(n)) {//.test metodo del Predicate
				proceso.accept(n);//.accept metodo de Consumer
			}			
		}
	}

	//metodo que recibe una lista y devuelve la suma de los cuadrados de los numeros de la lista
	//metodo que recibe una lista y devulve la suma de las raices cubicas de los numeros de la lista
	//Function es un calculo 
	//definimos lo que queremos que haga el metodo
	public int sumaTransformados(Collection<Integer> numeros,Function<Integer,Integer> fun) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=fun.apply(n);//sumamos el resultado de transformar cada numero segun la funcion
							  //metodo abstracto apply, que a partir
		}
		return suma;
	}
	
	//esto es lo mismo que el anterior pero con UnaryOperator que se usa cuando su tipos de 
	//datos que recibe son dos y son iguales
	public int sumaTransformados2(Collection<Integer> numeros,UnaryOperator<Integer> fun) {
		int suma=0;
		for(Integer n:numeros) {
			suma+=fun.apply(n);//sumamos el resultado de transformar cada numero segun la funcion
							  //metodo abstracto apply, que a partir
		}
		return suma;
	}
	
	/*Metodo que recibe una lista y devuelve la suma de todos los elementos de la lista,
	a la que le añadimos un valor extraido de un fichero*/
	/*Metodo que recibe una lista y devuelve la suma de todos los elementos de la lista,
	a la que le añadimos un numero leido desde un puerto externo*/
	public int sumaListaConValor(Collection<Integer> numeros,Supplier<Integer> data) {
		int suma=0;
		for(Integer n: numeros) {
			suma+=n;
		}
		return suma+data.get();
	}
	/*Método que recibe una lista de cadenas de caracteres y devuelve el total de las vocales de 
	 aquellas que comiencen por "a" método que recibe un alista de cadena de caracteres y 
	 devuelve el total de caracteres de aquellas que tengan más de 5 letras*/
	//COLLECTION por que vamos a recibir una objeto lista 
	//FUNCTION para sumar el total de vocales
	//PREDICATE para que solo se sumen con las que cumplen las condiciones
	public int listatString(Collection<String> texto,Function<String,Integer> vO,Predicate<String> cond) {
		int total=0;
		for(String cad:texto) {//Lista recibida con Collection
			if(cond.test(cad)) {//Metodo abstracto de Predicate
				total+=vO.apply(cad); //Metodo abstracto de Function
			}
		}
		return total;
	}
}