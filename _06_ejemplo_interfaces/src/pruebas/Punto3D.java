package pruebas;

import interfaces.Operaciones;

public class Punto3D extends Punto implements Operaciones{//hereda Punto //e implementa los metodos en Operaciones
	
	private int z;//agregamos atributo
	public Punto3D(int z) {
		super(20,8);//llamada a constructor con parametros de la super
		this.z=z;
	}
	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	public void mover(int d) {//nuevo metodo
		//x=x+d; ERROR de compilacion por que son privates(Encapsulacion)	
		
		setX(getX()+d);//modificamos atributos heredados a traves de set/get
		setY(getY()+d);
		z=z+d;
	}
	//sobrescribimos el metodo dibujar()
	@Override //para sobrescribir un metodo y no equivocarse al poner el mismo nombre
	public void dibujar() {
		//System.out.println("Coordenada:"+getX()+","+getY()+","+z);
		super.dibujar();//llamada a la version original del metodo
		System.out.println(","+z);
	}
	@Override
	public void girar(int a) {
		setX(getX()+a);
		
	}
	@Override
	public int invertir() {
		z-=2;
		return z;
		
	}
}

//en todos constructor hay el metodo super();