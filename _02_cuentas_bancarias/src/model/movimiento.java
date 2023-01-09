package model;

public class movimiento {
	/*PARTE DE LA TERCERA parte:
	Se creará una nueva clase que registre los movimientos realizados en la cuenta (ingreso y extracción).
	Cada movimiento se caracteriza por una cantidad y un tipo (ingreso o extracción).
	Incorporará un nuevo método que devuelva los movimientos registrados*/
	
	private double cantidad;
	private String tipo;
	public movimiento(double cantidad, String tipo) {
		super();
		this.cantidad = cantidad;
		this.tipo = tipo;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
