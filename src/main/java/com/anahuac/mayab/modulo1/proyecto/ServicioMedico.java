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
		System.out.println("----------" );
		
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
