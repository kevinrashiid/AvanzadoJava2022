package main_view;

import java.util.List;

import service.ProductosService_NIO;

public class Test {

	public static void main(String[] args) {
		
		ProductosService_NIO service=new ProductosService_NIO();
		List<String> prods=List.of("pollo","cerveza","pizza");
		service.grabarProducto(prods);
		service.listasProductos().forEach(System.out::println);
	}
}
