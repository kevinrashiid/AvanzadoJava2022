package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//github.com/kevinrashiid/AvanzadoJava2022.git

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
	opcion3: Se ordenan los productos por precio, de menor a mayor
	opcion4: Se pide una categoría y se eliminan los productos de dicha categoría
	opcion5: Se muestran los datos de todos los productos almacenados
	
	lo hacemos con ArrayList<>()*/
	ArrayList<PedidosAV_Model> pd= new ArrayList<PedidosAV_Model>();
	
	public void guardarProducto(PedidosAV_Model producto) {
		pd.add(producto);
	}
	//sube el precio a todos los productos 
	public void subirPrecio(double porcentaje) {//con UnaryOperator por que son el mismo 
											    //tipo el dato de entrada y de salida
		pd.replaceAll(p->{
			p.setPrecio(p.getPrecio()+(p.getPrecio()*porcentaje/100));
			return p;
		});
	}
	
	//sube el precio a los productos que cumplen una condición
	public void subirPrecioConCondicion(int porcentaje, Predicate<PedidosAV_Model> cond) {
		pd.replaceAll(p->{
			if(cond.test(p)) {
				p.setPrecio(p.getPrecio()+(p.getPrecio()*porcentaje/100));
			}
			return p;
		});
	}
	public void ordenar() {//metodo para ordenar los productos por precio, de menor a mayor
		pd.sort((a,b)->Double.compare(a.getPrecio(), b.getPrecio()));
		//metodo compare recibe dos parametros y vevuelve un (int)
	}
	public void eliminarProductosProductosPorCategoria(String categoria) {
			//metodo que hace Se pide una categoría y se eliminan los productos de dicha categoría
			pd.removeIf(t->t.getCategoria().equalsIgnoreCase(categoria));
	}
	public List<PedidosAV_Model> productosAlmacenados(){
		 //Se muestran los datos de todos los productos almacenados
		return pd;	
	}
}