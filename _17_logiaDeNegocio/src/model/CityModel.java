package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CityModel {
	private String nombreCity;
	private String pais;
	private int habitantes;
	private double temperaturaMedia;
	/*Ejercicio.
 

Desarrollar la lógica de negocio de una aplicación para la gestión de ciudades.

Una ciudad se caracteriza por: nombre,país,habitantes,temperaturaMedia

La clase donde implementamos la lógica de negocio, tendrá que tener los siguientes métodos:

-Añadir ciudad: recibe los datos de una ciudad y la guarda en una lista, teniendo en cuenta
que no se permiten ciudades repetidas (nombre y país iguales)

-Número de ciudades en un país: recibe el nombre del pais y devuelve el total de ciudades
registradas de ese pais. Si no hay ciudades en ese país, devolverá 0

-Ciudad más poblada: Devuelve los datos de la ciudad más poblada

- Buscar ciudad: recibe el nombre de ciudad y país, y devuelve los datos de la misma
Si no existe, devolverá null

-Ciudad más fria: Devuelve los datos de la ciudad más fria*/
	
	
}
