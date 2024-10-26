package com.anahuac.mayab.modulo1;
import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma = 0, n = 5, contador = 1;
		
		while (contador < n) {
			suma = suma + contador;
			contador++;
		}		
		System.out.println("LA suma es " + suma);
		
	//promedio de calficaciones dadas
		double sumaCalficaciones = 0, calficacion = 0, promedio = 0;
		int contador2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribir Calficacion");
		calficacion = sc.nextDouble();
		
		while (calficacion != -1) {
		
			sumaCalficaciones = sumaCalficaciones + calficacion;
			contador2++;
			System.out.println("Escribir Calficacion");
			calficacion = sc.nextDouble();
		}		
		promedio = sumaCalficaciones / contador2;
		System.out.println("El Promedio  es " + promedio);
		System.out.println("El   es " + contador2 + " " + sumaCalficaciones );
		
	}

}
