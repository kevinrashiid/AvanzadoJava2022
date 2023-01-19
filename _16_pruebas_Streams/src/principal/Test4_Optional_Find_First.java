package principal;

import java.util.List;

public class Test4_Optional_Find_First {

	public static void main(String[] args) {
		
		List<String> nombres=List.of("leche","atún","vino","patatas","leche","agua","vino","lechuga");
		
		/*¿Mostrar el nombre del primer producto que comience por A, 
		 *si no hubiera ninguno que muestre "no hay ninguno"*/
		System.out.println(nombres.stream()//un stream de objetos <String>
		.filter(s->s.startsWith("a"))// devuelve Stream<String> //atun
		.findAny()//optional de <String> 
		.orElse("No hay nada"));//te devuelve el contenido que encuentre por a 
								//pero si no encuentra nada muestra el mensaje
								//"No hay nada"
		
	}

}
