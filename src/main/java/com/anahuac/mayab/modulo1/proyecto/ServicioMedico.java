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
		System.out.println("Crear receta.... " + nombre);
		
	}
	
	@Override
	public void realizar(String nombre) {
		consultar(nombre);
		darReceta(nombre);
	}

}
