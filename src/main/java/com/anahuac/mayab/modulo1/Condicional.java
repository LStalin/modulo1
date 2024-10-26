package com.anahuac.mayab.modulo1;

public class Condicional {

	public static void main(String[] args) {
// CAlcula si es mayor de edad
		int edad = 18 ;
		boolean ine = false;
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
			
			if (ine) {
				System.out.println("Puedes Votar");
			}
			else {
				System.out.println("Haz tu Tramite");
				
			}
		}
		
		else {
		System.out.println("Eres menor de edad");
		}
		
// Calcula el mayor de 2 numeros
	int num1 = 5;
	int num2 = 6;
	if (num1 > num2) {
		System.out.println("El mayor es" + num1);
	}			
		else {
			if (num1 == num2) {
				System.out.println("Son Iguales");
			}
			else {
				System.out.println("El mayor es " + num2);
			}
				
		}
			
// Calcula propina
	double cuenta = 170, propina = 10;
	if (cuenta > 100) {
		propina = cuenta*.10;
	}			
		System.out.println("La propina es " + propina);
	
	}

}
