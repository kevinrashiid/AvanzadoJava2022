package geometria;

/*Una clase abstracta es una clase que contiene al menos un método abstracto.
Un método abstracto es aquel que esta declarado, pero no implementado.
No es posible crear objetos de clases abstractas, su objetivo es definir 
formato de métodos para subclases, que deberán sobrescribirlos.*/

public class Circulo extends Figura{
	private int radio;
	public Circulo(String color, int radio) {
		super(color);//llamada a constructor de figura
		this.radio=radio;
	}
	@Override
	public double superficie() {
		return Math.PI*radio*radio;
	}
}