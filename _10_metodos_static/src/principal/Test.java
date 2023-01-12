package principal;

interface Datos{//creamos interface
	//los metodos static tiene un objetivo claro
	//es proporcinar implementaciones de la interfaz
	static void print() {
		System.out.println("Hello");
	}
	
}
class Prueba implements Datos{//implementamos interface Datos
	
	
}

public class Test {

	public static void main(String[] args) {
		Datos.print();
		
		
	}

}
