package pruebas;

//interfaces funcionales

interface I1{
	void print(String cad);
}
interface I2{
	int m(int a, int b);
}
interface I3{
	String send();
	default void call() {
		System.out.println("hello world");
	}
}
public class Test {

	public static void main(String[] args) {
		
		//expresion lambdas para implementar interfaces
		// las variable son creadas de tipo objeto(I1,I2,I3) que el objeto tiene sus metodos cada uno 
		//mostramos cad
		I1 i1=cad->System.out.println(cad);
		i1.print("prueba lambda");//llamamos al metodo para hacer lo de la lambdas
		//decido que se sumen los dos parametros, dentro de parentesis por que son mas de dos parametros
		I2 i2=(a,b)->a+b;
		i2.m(3, 5);//llamamos al metodo para hacer lo de la lambdas
		//devuelve un String cualquiera
		I3 i3=()->"bye";
		i3.call();//llamamos al metodo para hacer lo de la lambdas
		i3.send();
	}
}
