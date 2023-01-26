package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ProductosService_NIO {
	
	private Path pt=Path.of("c:\\ficheros\\productos.txt");
	
	/*metodo que devuelve la lista de productos
	en el clase ProductosService_IO el metodo listasProductos
	hace lo mismo que este nuevo metodo pero con menos codigo 
	gracias a los Stream y a la actuzalizacion de IO a NIO*/
	public List<String> listasProductos() {
		try {
			return Files.readAllLines(pt);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	//metodo que a partir del nombre de un productos, 
	//nos dice si esta o no almacenado
	public boolean existeProducto(String producto) {
		try {
			return Files.lines(pt)/*Stream<String> un stream de cadenas de caracteres
									ya nos deja utilizar los metodos de stream*/
					.anyMatch(s->s.equalsIgnoreCase(producto));
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	public void grabarProducto(List<String> prods) {
		try {
			Files.writeString(pt, prods+System.lineSeparator(), StandardOpenOption.APPEND);
			//System.lineSeparator() salto de linea por que writeString no hace salto de linea
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void grabarProductos(List<String> productos) {
		try {
			Files.write(pt, productos, StandardOpenOption.APPEND);
			//StandardOpenOption.APPEND esto para que me lo añada no para que me machaque lo que ya tengo dentro

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
