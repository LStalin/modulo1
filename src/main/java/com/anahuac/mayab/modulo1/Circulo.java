package com.anahuac.mayab.modulo1;
//import;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radio;
        double area, diametro, pi, circunferencia;
        radio = 10;
        pi = 3.1416;
        area = (radio * radio) * pi;
        diametro = 2*radio;
        circunferencia= pi * diametro;
        
        System.out.println("El area es: " + area);
        System.out.println("El diametro es: " + diametro);
        System.out.println("El circunferencia es: " + circunferencia);
        
	}

}
