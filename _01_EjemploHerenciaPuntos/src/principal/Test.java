package principal;

public class Test {

	public static void main(String[] args) {

		//creamos dos objetos punto y Dibujamos
		/*Punto p1=new Punto();
		Punto p2=new Punto(3,7);
		p1.dibujar();
		p2.dibujar();*/
	
		//Creamos un objeto Punto3d y llamamos a sus metodos
		Punto3D pd=new Punto3D(1,7,4);
		pd.dibujar();
		pd.mover(2);
		System.out.println("----------------");
		pd.dibujar();
	}

}

