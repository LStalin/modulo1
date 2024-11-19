package com.anahuac.mayab.modulo1.sesion3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.random.*;

public class TestPerro {

	public static void main(String[] args) {
		
		System.out.println("----- Ahora usando un array ------- ");
		Perro[] misPerros = new Perro[5];
		String[] nombres = {"Manchas","Cuchu","Parmesano","Chato","Capo","Max", "Croqueta"};
		String[] duenos = {"Manuel","Juan","Daniel","Jorge","Luis","Iker", "Dilan", "Ana", "Flor", "Maria"};
		for(int i = 0; i < misPerros.length; i++) {
			misPerros[i] = new Perro();
			misPerros[i].setNombre(nombres[i]);
			misPerros[i].setNombreDuenio(duenos[i]);
		}
		for(int i = 0; i < (misPerros.length); i++) {
			misPerros[i].ladrar();
		}
	
		int cantidadPerros = 6; //Cantidad de perros a crear
		
		System.out.println("----- Ahora usando un arraylist ------- ");
		Random randomGenerator = new java.util.Random();
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		for(int i = 0; i < cantidadPerros; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
			int numeroAleatorio = randomGenerator.nextInt(nombres.length);
			perroTemporal.setNombreDuenio(duenos[numeroAleatorio]);
			//Ya que estan seteados los valores, ahora guardo en la lista
			listaPerros.add(perroTemporal);
		}
		
		for(int i = 0; i < listaPerros.size(); i++) {
			listaPerros.get(i).ladrar();
		}		
		
		System.out.println("---- For each ");
		for(Perro perro : listaPerros) {
			perro.ladrar();
		}
		
		//Usando un hashMap 
		HashMap<Integer, Perro> mapPerros = new HashMap<>();
		for(int i = 0; i < cantidadPerros; i++) {
			Perro perroTemporal = new Perro();
			perroTemporal.setNombre(nombres[i]);
			int numeroAleatorio = randomGenerator.nextInt(nombres.length);
			perroTemporal.setNombreDuenio(duenos[numeroAleatorio]);
			//Ya que estan seteados los valores, ahora guardo en el mapa
			mapPerros.put(i,perroTemporal);
		}
		
		System.out.println("---- Usando un hashMap con keyset ");
		for(Integer ii : mapPerros.keySet()) {
			mapPerros.get(ii).ladrar();
		}
		System.out.println("---- Usando un hashMap con entryset");
		for(Entry<Integer, Perro> entry : mapPerros.entrySet()) {
			entry.getValue().ladrar();
		}
		
		System.out.println("---- Usando un hashMap con values");
		for(Perro p : mapPerros.values()) {
			p.ladrar();
		}
	}

}
