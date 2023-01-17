package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import model.PedidosAV_Model;

public class PedidosAV_Service {
	/*
	1.-Añadir producto
	2.-Subir precio
	3.-Ordenar productos
	4.-Eliminar productos
	5.-Mostrar productos
	6.-Salir

	Cada producto se identifica por:
	nombre, precio, categoria

	opcion1: Se piden los datos del producto y se añade
	opcion2: se pide un porcentaje, y se sube en ese porcentaje el precio
	de todos los productos
	opcion3: se ordenan los productos por precio, de menor a mayor
	opcion4: se pide una categoría y se eliminan los productos de dicha categoría
	opcion5: se muestran los datos de todos los productos almacenados
	
	lo hacemos con ArrayList<>()*/
	ArrayList<PedidosAV_Model> pd= new ArrayList<PedidosAV_Model>();
	
	public void guardarProducto(PedidosAV_Model producto) {
		pd.add(producto);
	}

	public void subirPrecio(double porcentaje) {
		pd.sort());
	}
	public void ordenar() {

	}
	public void eliminarProductosProductosPorCategoria() {
			pd.removeIf(t->t.getCategoria());
	}
	public List<PedidosAV_Model> productosAlmacenados(){
		
	}
}

