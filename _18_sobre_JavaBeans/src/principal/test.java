package principal;

import model.Ciudades3;
import model.ciudades;

public class test {

	public static void main(String[] args) {
		
		ciudades c=new ciudades("Badajoz","España");
		System.out.println(c.toString());
		//muestra- Badajoz:España
		
		/*Ciudades2 c=new Ciudades2("Badajoz","España");
		System.out.println(c.toString());*/
		//muestra esto Ciudades2(nombre=Badajoz, pais=España)
		
		Ciudades3 c3=new Ciudades3("Madrid","España");
		//un record es INMUTABLE
		System.out.println(c3.nombre());
		//muestra- Madrid
		System.out.println(c3.pais());
		//muetsra- España
		System.out.println(c3);
		//muestra- Ciudades3[nombre=Madrid, pais=España]
		Ciudades3 cr=new Ciudades3(); 
		//este objeto se puede crear gracias al contructor Ciudades3
	}
}