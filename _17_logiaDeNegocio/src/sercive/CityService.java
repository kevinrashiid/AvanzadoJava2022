package sercive;

import java.util.ArrayList;

import model.CityModel;

public class CityService {
	/*Ejercicio Enunciado.

	Desarrollar la lógica de negocio de una aplicación para la gestión de ciudades.

	Una ciudad se caracteriza por: nombre,país,habitantes,temperaturaMedia

	La clase donde implementamos la lógica de negocio, tendrá que tener los siguientes métodos:

	1.-Añadir ciudad: recibe los datos de una ciudad y la guarda en una lista, teniendo en cuenta
	que no se permiten ciudades repetidas (nombre y país iguales)

	2.-Número de ciudades en un país: recibe el nombre del pais y devuelve el total de ciudades
	registradas de ese pais. Si no hay ciudades en ese país, devolverá 0

	3.-Ciudad más poblada: Devuelve los datos de la ciudad más poblada

	4.-Buscar ciudad: recibe el nombre de ciudad y país, y devuelve los datos de la misma
	Si no existe, devolverá null

	5.-Ciudad más fria: Devuelve los datos de la ciudad más fria*/
	ArrayList<CityModel> city=new ArrayList<>();
	
	public boolean añadirCiudad(CityModel ct) {
		city.stream()
		.filter(n->n.getNombreCity().equalsIgnoreCase(ct));
		
		return false;
		
	}
	public Integer nCiudadesPorPais(String nombreCity) {
		
	}
	
	public CityModel ciudadMasPoblada() {
		return city.stream()
				.max((c1,c2)->c1.getHabitantes()-c2.getHabitantes())//Optional<Ciudad>
				.orElse(null);
		
	}
	public CityModel buscarCiudad(String nombreCity, String pais) {
		
		
	}
	
	public CityModel ciudadMasFria() {
		return city.stream()
				.min((c1,c2)->Double.compare(c1.getTemperaturaMedia(),c2.getTemperaturaMedia()))
				.orElse(null);	
	}
}