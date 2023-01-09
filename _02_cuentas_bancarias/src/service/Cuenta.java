package service;

public class Cuenta {
	/*Enunciado:

Crear una clase Cuenta que represente una cuenta bancaria. 
La clase tendrá un atributo saldo que represente el saldo de la cuenta y que será
inicializado en los constructores.
Habrá tres métodos: ingresar, extraer y obtenerSaldo

segunda partes:
Crear una subclase de Cuenta que incluya un nuevo atributo limite, 
que servirá para definir el límite máximo de dinero que se podrá extraer.  
También incluirá un nuevo método, llamado ajustarLimite(), 
que establecerá automáticamente como límite la mitad del saldo existente

tercera parte:
Se creará una nueva clase que registre los movimientos realizados en la cuenta (ingreso y extracción).
Cada movimiento se caracteriza por una cantidad y un tipo (ingreso o extracción).
Incorporará un nuevo método que devuelva los movimientos registrados
*/
	private double saldo;
	public Cuenta() {
		saldo=100;
	}
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}
	//metodos ingresar, extraer y obtenersaldo
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	
	public void extraer(double cantidad){
		saldo-=cantidad;
	}
	public double obtenerSaldo() {
		return saldo;
	}
	
}
