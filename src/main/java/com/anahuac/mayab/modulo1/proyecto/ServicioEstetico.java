package com.anahuac.mayab.modulo1.proyecto;

public class ServicioEstetico extends Servicio{

	public ServicioEstetico(String tipo, double costo, String fecha, String encargado) {
		super(tipo, costo,fecha, encargado);
		// TODO Auto-generated constructor stub
	}

	
	public void baniar() {
		System.out.println("Bañando " );
	}
	
	public void cepillar() {
		System.out.println("Cepillando " );
	}
	public void corte() {
		System.out.println("Cortando " );
	}

	public void realizar(String nombre) {
		System.out.println("----------" );
		System.out.println("Atendiendo a : " + nombre );
		if (getTipo() == "Banio") {
			baniar();
			cepillar();
		}
		else {
			corte();
			cepillar();
			
		}
		System.out.println("----------" );
				
	}
}
