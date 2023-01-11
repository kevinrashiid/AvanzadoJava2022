package principal;

import interfaces.Operaciones;
import pruebas.Mesa;
import pruebas.Punto3D;

//polimorfismo con interfaces
public class test {
	
	public static void main(String[] args) {
		Operaciones op;
		procesar(new Mesa(2,7,3));
		
		procesar(new Punto3D(1,6,2));
	}
	static void procesar(Operaciones op) {
		op.girar(10);
		System.out.println(op.invertir());
	}
}