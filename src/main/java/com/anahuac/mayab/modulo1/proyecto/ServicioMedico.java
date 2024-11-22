package com.anahuac.mayab.modulo1.proyecto;

public class ServicioMedico extends Servicio {

	public ServicioMedico(String tipo, double costo, String fecha, String encargado) {
		super(tipo, costo, fecha, encargado);
		// TODO Auto-generated constructor stub
	}
	public void consultar(String nombre) {
		System.out.println("Realizando consulta paciente: " + nombre);
	}
	public void darReceta(String nombre) {
		System.out.println("Crear receta a.... " + nombre);
		
	}
	public void aplicaVac(String nombre) {
		System.out.println("----------" );
		System.out.println("Vacunando a .... " + nombre);
		//Perro miPerro = new Perro( "unica" + nombre +, 5, "Paty");
		//CartillaPerro cartilla = new CartillaPerro();
		//cartilla.setDatosPerro(miPerro);
		System.out.println("----------" );
		//cartilla.actualizar("rabia", "25-marzo-2022");
		
	}
	
	@Override
	public void realizar(String nombre) {
		System.out.println("----------" );
		System.out.println(nombre + " en Consulta" );
		if (getTipo() == "Consulta") {
			consultar(nombre);
			darReceta(nombre);
		}
		else {
			aplicaVac(nombre);
			
			
		}
		System.out.println("----------" );		
	}

}
