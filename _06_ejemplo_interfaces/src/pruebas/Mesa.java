package pruebas;

import interfaces.Operaciones;

public class Mesa implements Operaciones{ //implementamos/comprometemos de la interface operaciones 
	private int largo,ancho,alto;

	public Mesa(int largo, int ancho, int alto) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public void girar(int a) {
		largo+=a;
		ancho+=a;
	}

	@Override
	public int invertir() {
		alto*=-1;
		return alto;
	}
	

}
