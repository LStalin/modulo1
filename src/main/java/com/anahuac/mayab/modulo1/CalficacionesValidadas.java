package com.anahuac.mayab.modulo1;

import java.util.Scanner;

public class CalficacionesValidadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sumaCalficaciones = 0, calficacion = 0, promedio = 0;
		int contador2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribir Calficacion");
		calficacion = sc.nextDouble();
		
		
		while (calficacion != -1) {
			if (calficacion >= 5 && calficacion <=10) {
				
			
			sumaCalficaciones = sumaCalficaciones + calficacion;
			contador2++;
			}
			else {
				System.out.println("El no Valido  es " );
			}
			System.out.println("Escribir Calficacion");
			calficacion = sc.nextDouble();
		}		
		promedio = sumaCalficaciones / contador2;
		System.out.println("El Promedio  es " + promedio);
		System.out.println("El   es " + contador2 + " " + sumaCalficaciones );
		
	}

}
