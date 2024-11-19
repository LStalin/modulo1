package com.anahuac.mayab.modulo1.proyecto;

public class TestVeterinaria {

	public static void main(String[] args) {
		Perro perro = new Perro("unica", "firu", "paty");
		CartillaPerro cartilla = new CartillaPerro(perro, "123");
		Veterinaria vet = new Veterinaria("Mi Veterinaria");
		try {
		Servicio servicio = vet.crearServicio("Corte", perro.getNombre(),"16-nov-24");
		servicio.realizar(perro.getNombre());
		Servicio servicio2 = vet.crearServicio("Consulta", perro.getNombre(),"6-nov-24");
		servicio2.realizar(perro.getNombre());
		//cartilla.imprimirCartilla();
		}
		catch (Exception e ) {
			System.out.println("No hay Servicio");
			e.printStackTrace();
		}
		cartilla.imprimirExpediente();
		//cartilla.imprimirCartilla();
		
	}

}
