package principal;

interface Printer{
	void print(String cad);
	//incluiremos un metodos static que proporcione
	//una determinada implementacion de la interfaz
	static Printer of() {
		return new Printer() {//objeto de clase anonima
			@Override
			public void print(String cad) {
			System.out.println(cad);	
			}
		};
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
