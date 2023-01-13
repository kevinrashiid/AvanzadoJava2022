package service;

import java.util.List;
import java.util.function.Predicate;
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
	
	public int sumaPorCriterio(List<Integer>numeros,Predicate<Integer> condicion) {
		int suma=0;
		for(int n:numeros) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}
		return suma;
	}
}