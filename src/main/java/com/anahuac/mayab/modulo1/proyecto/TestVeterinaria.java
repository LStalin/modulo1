package com.anahuac.mayab.modulo1.proyecto;

import java.util.ArrayList;


public class TestVeterinaria {

	public static void main(String[] args )  {
		ArrayList<Servicio> listaServicioV = new ArrayList<Servicio>();
		
		
		Perro perro = new Perro("Pastor", "Grande", 8.5 , "Pacho","Paty", 10);
		CartillaPerro cartilla1 = new CartillaPerro(perro, "123a");
				
		Perro perro2 = new Perro("Xolo", "Mediano", 6.5, "Min", "Juan", 6);
		CartillaPerro cartilla2 = new CartillaPerro(perro2, "245b");
		Veterinaria vet = new Veterinaria("Mi Veterinaria");
		
		try {
		Servicio servicio = vet.crearServicio("Corte", perro.getNombre(),"16-nov-24");
		servicio.realizar(perro.getNombre());
		cartilla1.actualizar("Corte", "5-marzo-2022");
		cartilla1.actualizar("Consulta", "6-oct-2023");
		//listaServicioV.add(servicio);
		Servicio servicio2 = vet.crearServicio("Vacuna Rabia", perro2.getNombre(),"26-nov-24");
		servicio2.realizar(perro2.getNombre());
		cartilla2.actualizar("Vacuna", "26-dic-24");
		cartilla2.actualizar("Banio", "6-ene-24");
		//listaServicioV.add(servicio2);
		

		listaServicioV.add(servicio);
		
		
		listaServicioV.add(servicio2);
		
		
		cartilla1.imprimirCartilla(listaServicioV);
		cartilla1.imprimirExpediente(listaServicioV);
		cartilla2.imprimirCartilla(listaServicioV);
		cartilla2.imprimirExpediente(listaServicioV);
		
		
		}
		catch (Exception e ) {
			System.out.println("No hay Servicio");
			e.printStackTrace();
		}
		
		System.out.println("Cantidad de elementos en la lista:" + listaServicioV.size());
	
	}


	

}
