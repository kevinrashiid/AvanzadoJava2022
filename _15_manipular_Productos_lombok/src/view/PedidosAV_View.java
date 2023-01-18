package view;

import java.util.List;
import java.util.Scanner;

import model.PedidosAV_Model;
import service.PedidosAV_Service;

public class PedidosAV_View {
	static PedidosAV_Service productosService=new PedidosAV_Service();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					agregarProducto();
					break;
				case 2:
					subirPrecio();
					break;
				case 3:
					ordenar();
					break;
				case 4:
					eliminarProductos();
					break;
				case 5:
					subirPorCategoria();
					break;
				case 6:
					mostrarProductos();
					break;
				case 7:
					System.out.println("---Adios---");
			}
		}while(opcion!=7);
	}
	static void mostrarMenu() {
		System.out.println("1.- Nuevo producto");
		System.out.println("2.- Subir precios");
		System.out.println("3.- Ordenar productos");
		System.out.println("4.- Eliminar productos");
		System.out.println("5.- Subir precios por categoria");
		System.out.println("6.- Mostrar todos los productos");
		System.out.println("7.- Salir"); 
		
	}
	static void agregarProducto () {
		Scanner sc=new Scanner(System.in);
		String nombre;
		Double precio;
		String categoria;
		System.out.println("Nombre del producto: ");
		nombre = sc.nextLine();
		System.out.println("Precio del producto: ");
		precio = Double.parseDouble(sc.nextLine());
		System.out.println("Categoria del producto: ");
		categoria = sc.nextLine();
		productosService.guardarProducto(new PedidosAV_Model(nombre, precio, categoria));		
	}
	
	static void subirPrecio () {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Cuanto quieres subir los precios?: ");		
		productosService.subirPrecio(Integer.parseInt(sc.nextLine()));		
	}
	
	static void ordenar() {
		productosService.ordenar();
	}
	static void eliminarProductos() {
		Scanner sc=new Scanner(System.in);
		String categoria;
		System.out.println("Introduce categoría:");
		categoria=sc.nextLine();
		productosService.eliminarProductosProductosPorCategoria(categoria);
	}
	static void subirPorCategoria() {
		Scanner sc=new Scanner(System.in);
		String categoria;
		int porcentaje;
		System.out.println("Introduce categoría:");
		categoria=sc.nextLine();
		System.out.println("Introduce porcentaje:");
		porcentaje=Integer.parseInt(sc.nextLine());
		
		productosService.subirPrecioConCondicion(porcentaje, p->p.getCategoria().equals(categoria));
		
	}
	static void mostrarProductos() {
		List<PedidosAV_Model> prods=productosService.productosAlmacenados();
		prods.forEach(p->System.out.println(p.getNombre()+":"+p.getPrecio()));
	}

}
