package principal;

interface Printer{
	void print(String cad);
	//incluiremos un metodos static que proporcione un obejeto
	//de una clase que implementa esa la interfaz
	static Printer of() {
		return new Printer() {// creamos objeto de clase anonima
			@Override
			public void print(String cad) {
			System.out.println(cad);	
			}
		};
	}
}

public class Test2 {

	public static void main(String[] args) {
			
		//podemos llamar al metodo estarico de la interfaz
		//para que nos de un objeto ya hecho de una clase que implementa la interfaz
		//y asi no tener que crear una clase que la implemente
		
		//no creamos un objeto de interface
		//lo que hacemos es crear un objeto de una subclase de interface
		
		Printer pr=Printer.of();
		pr.print("hello");
		
	}

}
