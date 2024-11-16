package com.anahuac.mayab.modulo1.sesion5;

import java.io.FileWriter;
import java.io.PrintWriter;

public class TestArchivo {

	public static void main(String[] args) {
		
		//String nombreArchivo = "C:\\miclase\\prueba.txt"; 
		String nombreArchivo = "prueba.txt";
		try (FileWriter archivo = new FileWriter(nombreArchivo))
        {
            PrintWriter pw = new PrintWriter(archivo);
            pw.print("Hola, bienvenido\n");
            pw.print("\t Java");
            pw.print("\n esta es otra");

        } catch (Exception e) {
        	System.out.println("error al abrir");
            e.printStackTrace();
        }
	}

}
