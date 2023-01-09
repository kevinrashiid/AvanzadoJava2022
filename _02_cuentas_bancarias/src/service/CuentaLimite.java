package service;

public class CuentaLimite extends Cuenta {
	/*SEGUNDA partes:
		Crear una subclase de Cuenta que incluya un nuevo atributo limite, 
		que servirá para definir el límite máximo de dinero que se podrá extraer.  
		También incluirá un nuevo método, llamado ajustarLimite(), 
		que establecerá automáticamente como límite la mitad del saldo existente
		*/
	private double limite;

	public CuentaLimite(double saldo, double limite) {
		
		super(saldo);//para añadir el valor del saldo que hay en cuenta
		this.limite=limite;
	}
	public CuentaLimite() {
		this.limite=50;
		
	}
	public void ajustarLimite() {
		limite=obtenerSaldo()/2;
	}
	//sobrescritura de extraer
	@Override
	public void extraer(double cantidad) {
		if(cantidad<=limite) {
			super.extraer(cantidad);//llamamos al metodo extraer ORIGINAL 
									//si no ponemos super llamamos al extraer de la linea anterior
		}else {
			super.extraer(limite);//si quiere extraer mas del limite, solo le permite el limite
		}
	}
}
	

	


