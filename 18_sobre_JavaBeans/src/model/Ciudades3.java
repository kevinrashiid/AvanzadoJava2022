package model;

public record Ciudades3(String nombre, String pais) {
	//Esto es un record y es lo mismo que un javaBeans
	//un record es INMUTABLE
	//Y SOLO HAY GETTER
	public Ciudades3() {this(null,null);}//todo constructor explicito de un record debe llamar al implicito
	//el anterior es el constructor
}
