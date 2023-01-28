package sercive;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

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
	
	//hacer un JUnit para probar este Proyecto
	ArrayList<CityModel> city=new ArrayList<>();
	
	/*Añadir ciudad: recibe los datos de una ciudad y la guarda en una lista, teniendo en cuenta
	que no se permiten ciudades repetidas (nombre y país iguales)*/
	public boolean añadirCiudad(CityModel ct) {
		if(
				city.stream()
				.noneMatch(c->c.getNombreCity().equals(ct.getNombreCity())&&c.getPais().equals(ct.getPais()))
					) { //si no hay ninguna ciudad con ese nombre y pais, agregamos
				city.add(ct);
				return true;
			}
			return false;
	}
	/*1.-Número de ciudades en un país: recibe el nombre del pais y devuelve el total de ciudades
	registradas de ese pais. Si no hay ciudades en ese país, devolverá 0*/
	public int nCiudadesPorPais(String nombreCity) {
		return (int)city.stream()//convertimos a int por que para poder utilizar count
				.filter(c->c.getPais().equalsIgnoreCase(nombreCity))//Stream<Pais>
				.count();	
	}
	
	//3.-Ciudad más poblada: Devuelve los datos de la ciudad más poblada
	public CityModel ciudadMasPoblada() {
		return city.stream()
				.max((c1,c2)->c1.getHabitantes()-c2.getHabitantes())//Optional<Ciudad>
				.orElse(null);
	}
	
	/*4.-Buscar ciudad: recibe el nombre de ciudad y país, y devuelve los datos de la misma
	Si no existe, devolverá null*/
	public CityModel buscarCiudad(String nombreCity, String pais) {
		return city.stream()
				.filter(c->c.getNombreCity().equalsIgnoreCase(nombreCity)&&c.getPais().equalsIgnoreCase(pais))
				.findFirst()//optional<CityModel>
				.orElse(null);	
	}
	
	/*5.-Ciudad más fria: Devuelve los datos de la ciudad más fria*/
	public CityModel ciudadMasFria() {
		return city.stream()
				.min((c1,c2)->Double.compare(c1.getTemperaturaMedia(),c2.getTemperaturaMedia()))
				.orElse(null);	
	}
	
	//metodo que devuelva el total de paises registrados
	public int totalDePaises() {
		return (int)city.stream()//Stream<CityModel>
				.map(c->c.getPais())//Stream<String> nos dan el Stream con todo pero aqui nos quedamos con .getPais 
									//la operacion dentro del .map es un Function
				.distinct()//Stream<String> quitamos los duplicados
				.count(); //muestra el tamaño de la lista
	}
	
	//temperatu media de las ciudades cuyo pais se recibe como para parametro
	public double temperaturaMedia(String pais) {
		return city.stream()
				.filter(c->c.getPais().equalsIgnoreCase(pais))
				.mapToDouble(t->t.getTemperaturaMedia())
				.average()//OptionalDouble
				.orElse(0);//0 si no hubiera ninguna ciudad		
	}
	
	public OptionalDouble temperaturaMedia2(String pais) {
		return city.stream()
				.filter(c->c.getPais().equalsIgnoreCase(pais))
				.mapToDouble(t->t.getTemperaturaMedia())
				.average();//OptionalDouble
	}
	
	//devuelve la lista de ciudades que pertenecen a un determinado pais
	public List<CityModel> ciudadPorPais(String nombreCity) {
		return city.stream()//convertimos a int por que para poder utilizar count
				.filter(c->c.getPais().equalsIgnoreCase(nombreCity))//Stream<Pais>
				.collect(Collectors.toList());//metodo final
				//utilizamos collect cuando queramos devolver un list-un Hasset etc
				//para que sea manipulable, pero no se limita solo a eso
	}
	
	//metodo que devuelva total las ciudades agrupadas por pais
	public Map<String,List<CityModel>> agrupadasPorPais(){
		return city.stream()
				.collect(Collectors.groupingBy(s->s.getPais()));	
	}
	
	//metodo que devuelva el total(Es un numero) de habitantes de un determidado pais
	public Integer totalDeHabitantes(String pais){
		return city.stream()
				.filter(n->n.getPais().equalsIgnoreCase(pais))
				.collect(Collectors.summingInt(n->n.getHabitantes()));
		//filtramos por pais que solo sumemos los habitantes del pais que nos pase
	}
}