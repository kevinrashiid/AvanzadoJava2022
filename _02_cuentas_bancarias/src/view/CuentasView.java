package view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.movimiento;
import service.CuentaMovimientos;

public class CuentasView {
	
	static CuentaMovimientos cuentamovimientos;

	public static void main(String[] args) {
		/*Hacer la capa de presentación de aplicación banco

		Al iniciar el programa, se solicita al usuario la introducción
		de un saldo inicial y un límite. A partir de ahí, aparecerá el siguiente menú:

		1.- Ingresar dinero
		2.- Extraer dinero
		3.- Consultar saldo y movimientos
		4.- Salir*/
		
		//pido saldo, pido limite y creo el objeto Cuen
		double saldo,limite;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el saldo");
		saldo=Double.parseDouble(sc.nextLine());
		System.out.println("Introduce limite");
		limite=Double.parseDouble(sc.nextLine());
		cuentamovimientos=new CuentaMovimientos(saldo,limite);
		//ahora viene el rollo del mostrar el menu
		
		Scanner sc2=new Scanner(System.in);
		int opcion;

			do {
				mostrarMenu();
				try {
				opcion=Integer.parseInt(sc2.nextLine());//conviertes lo que te meten por teclado(en este caso numeros) a nextLine
				switch(opcion) { //evaluamos
				case 1:
					ingresarDinero();//creamos menu para mostrar menu
					break;
				case 2:
					extraerDinero();//metodo para buscar el mas reciente
					break;
				case 3:
					consultarSaldoYMovimientos();//metodo para mostrar todos los datos
					break;
				case 4:
					System.out.println("---Salir---");
				}
			}
			catch(InputMismatchException ex) {
				System.out.println("Hey solo pon numeros");
				opcion=0;
			}
		}while(opcion!=4);
	}
	//RESTO DE LOS METODOS
	static void mostrarMenu() {
		System.out.println("1.- Ingresar Dinero");
		System.out.println("2.- Extraer dinero");
		System.out.println("3.- Consultar Saldo y Movimientos");
		System.out.println("4.- Salir");
		
	}
	static void ingresarDinero() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentamovimientos.ingresar(cantidad);
	}
	static void extraerDinero() {
		Scanner sc=new Scanner(System.in);
		double cantidad;
		System.out.println("Introduce cantidad");
		cantidad=Double.parseDouble(sc.nextLine());
		cuentamovimientos.extraer(cantidad);
		
	}
	static void consultarSaldoYMovimientos() {
		ArrayList<movimiento> movs=CuentaMovimientos.obtenerMovimiento();
		for(movimiento m:movs) {
			System.out.println(m.getTipo()+":"+m.getCantidad());
		
		}
		System.out.println(m.getTipo()+":"+m.getCantidad());	
	}
}
