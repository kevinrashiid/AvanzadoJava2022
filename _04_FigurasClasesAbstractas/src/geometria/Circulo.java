package geometria;

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


//

