package geometria;

public class Triangulo extends Figura{
	public int base,altura;

	public Triangulo(String color, int base, int altura) {
		super(color);//llamada a constructor de figura
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double superficie() {//sobrescribiendo el metodo superficie 
		return base*altura/2;
	}
}
