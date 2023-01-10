package service;

import java.util.ArrayList;

public class ListaDeNumeros extends ArrayList<Integer>{
	/*Crear una nueva clase de colección para listas de enteros.
	Esta nueva clase, a la que llamaremos ListaNumeros, va a heredar ArrayList<integer>.

	Sus particularidades son las siguientes:
	-Añadirá los siguientes métodos nuevos:
	  *first(). Devuelve el primer número de la colección.
	  *last(). Devuelve el último número de la colección.
	  *sum(). Devuelve la suma de todos los números.
	- No permetirá añadir números repetidos.*/
	public Integer first() {//Este metodo Devuelve el primer número de la colección.
		return this.get(0);
	}
	public Integer last(){// este metodo Devuelve el último número de la colección.
		return this.get(size()-1);
		
	}
	public	Integer sum(){// este metodo Devuelve la suma de todos los números.
		int suma=0;
		for(int i=0;i<this.size();i++) {
			suma=suma+get(i);
		}
		return suma;
	}
	//ahora, no permitira añadir numeros repetidos
	boolean existe;
	@Override
	public boolean add(Integer e) {
		//si no lo contiene, lo añade
		if(!contains(e)) {
			return super.add(e);
		}
		return false;
	}
}
