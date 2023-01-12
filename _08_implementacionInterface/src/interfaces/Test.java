package interfaces;
/*
 Crear una implementacion de la interfaz Printer, que consista en que el metodo muestre por pantalla el texto recibido. 
 Se creara un objeto de dicha implementacion y se llamara al metodo con un texto cualquiera*/

//SOLUCION 2

interface Printer{
	void print(String cad);
}
//forma estandar/clasica
class Prueba implements Printer{//Crear una implementacion de la interfaz Printer
	@Override//sobrescribimos el metodo
	public void print(String cad) {
		System.out.println(cad);
	}
}
public class Test {

	public static void main(String[] args) {//Se creara un objeto de dicha implementacion y se llamara al metodo con un texto cualquiera*/
		Prueba pr=new Prueba();
		pr.print("hola");
	}
}
