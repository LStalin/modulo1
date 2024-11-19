package com.anahuac.mayab.modulo1.sesion5;

public class GastoFacturable extends Gasto implements Facturable {

	public GastoFacturable(double monto, String categoria, String fecha, String tipoPago) {
		super(monto, categoria, fecha, tipoPago);
		// TODO Auto-generated constructor stub
	}

	
	/*public GastoFacturable(int monto, String categoria, String fecha, String tipoPago) {
		// TODO Auto-generated constructor stub
	}
*/

	public void pedirConstanciaSAT() {
		System.out.println("Dame tu Constancia");
	}
	
	
	public void emitirFactura(String id) {
		System.out.println("Emitir factura" + id);
		
	}


	public void enviarFactura(String email) {
		System.out.println("enviar factura al correo: " + email);
		
	}

	
	public void parcializarAMeses(int meses) {
		System.out.println("Parcializando con intereses a: " +meses +" meses");
		
	}

	

	

}
