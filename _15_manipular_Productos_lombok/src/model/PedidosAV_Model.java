package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter 
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PedidosAV_Model {
	/*ENUNCIADO
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
	
	private String nombre;
	private double precio;
	private String categoria;
	
}