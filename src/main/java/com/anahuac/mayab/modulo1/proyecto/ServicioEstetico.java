package com.anahuac.mayab.modulo1.proyecto;

public class ServicioEstetico extends Servicio{

	public ServicioEstetico(String tipo, double costo, String fecha, String encargado) {
		super(tipo, costo,fecha, encargado);
		// TODO Auto-generated constructor stub
	}

	
	public void baniar(String nombre) {
		System.out.println("Bañando a:  "  + nombre );
	}
	
	public void cepillar(String nombre) {
		System.out.println("Cepillando a:  "+ nombre );
	}
	public void corte(String nombre) {
		System.out.println("Cortando a: "+ nombre );
	}

	public void realizar(String nombre) {
		System.out.println("----------" );
		System.out.println("Atendiendo a : " + nombre );
		if (getTipo() == "Banio") {
			baniar(nombre);
			cepillar(nombre);
		}
		else {
			corte(nombre);
			cepillar(nombre);
			
		}
		System.out.println("----------" );
				
	}
}
