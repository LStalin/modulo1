package com.anahuac.mayab.modulo1.sesion5;

public class GastoNoFacturable extends Gasto{

	public GastoNoFacturable(double monto, String categoria, String fecha, String tipoPago) {
		super(monto, categoria, fecha, tipoPago);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void parcializarAMeses(int meses) {
		System.out.println("Parcializando sin intereses a: " +meses +" meses");
		
	}

}
