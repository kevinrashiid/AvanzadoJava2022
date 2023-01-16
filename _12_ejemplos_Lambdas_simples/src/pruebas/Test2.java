package pruebas;

import java.util.function.BiPredicate;

//hazme una clase que tenga los siguientes metodos 

//1.-recibe dos numeros y nos indica si son o no iguales
//2.- recibe dos numeros y nos indica si el primero es mayor que el segundo
//2.- recibe dos numeros y nos indica si ambos son pares

class Prueba{
	//BiPredicate por que son dos paremetros lo que comparamos
	public boolean comprobar(int n1, int n2, BiPredicate<Integer, Integer> criterio) {
		return criterio.test(n1,n2);
	}
}

public class Test2 {

	public static void main(String[] args) {//en las siguientes lineas
											//hacemos la llamada al metodo comprobar
		Prueba pr=new Prueba();
		//1.-
		System.out.println(pr.comprobar(6,8,(a,b)->a==b));
		//2.-
		System.out.println(pr.comprobar(6,8,(a,b)->a>b));
		//3.-
		System.out.println(pr.comprobar(6,8,(a,b)->a%2==0&&b%2==0));
	}
}
