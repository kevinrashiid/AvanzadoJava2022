package principal;

import java.util.Collection;

//Realizar una clase con un metodo.
//Ese metodo recibira una coleccion de numeros
//enteros y devolvera la suma de los mismos

public class ColeccionDeNumeros {

	public static void main(String[] args) {

	}
	public static int coleccionNum(Collection <Integer> col) {
		int suma=0;
		for(int c:col) {//recorremos todas las clases que estan en Collection con la variable c
			suma+=c;	//sumamos todo lo que tiene Collection que es la raiz padre que dentro tiene
						//ArrayList,HashSet,HashMap etc tec 
		}
		return suma; //devolvemos suma
	}
	//Realizamos un segundo metodo, que reciba dos colecciones de numeros
	//y nos diga cuantos numeros se encuentran en ambas colecciones
	public static int repetidos(Collection<Integer> col1, Collection<Integer> col2) {
		int rep=0;
		for(Integer n:col1) {//Recorremos col1 con n
			if(col2.contains(n)) {//preguntamos si en col2 hay que tiene n 
				rep++;
			}
		}
		return rep;
	}
	
}
