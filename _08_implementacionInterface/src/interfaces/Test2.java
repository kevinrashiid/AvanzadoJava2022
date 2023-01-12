package interfaces;
/*
 Crear una implementacion de la interfaz Printer, que consista en que el metodo muestre por pantalla el texto recibido. 
 Se creara un objeto de dicha implementacion y se llamara al metodo con un texto cualquiera*/

//SOLUCION 2
//aqui esta resuelto con clases anonimas
//esta solucion es mas reducido

interface Printer2{
	void print(String cad);
}



public class Test2 {

	public static void main(String[] args) {//Se creara un objeto de dicha implementacion y se llamara al metodo con un texto cualquiera*/
		
		//se crea una implementacion de la interface a traves de una clase anonima
		
		Printer2 pr=new Printer2() {//objeto de clase anonima
			
			@Override
			public void print(String cad) {
				System.out.println(cad);
			}
		};
		pr.print("hola");
	}
}
