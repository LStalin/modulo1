package com.anahuac.mayab.modulo1.proyecto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class CartillaPerro {
	//Atributos
	private Perro datosPerro;
	private String idCartilla;
	HashMap<String, ArrayList<String>> servicios = new HashMap<>();
	String nombreArchivo = "Sabueso Vete.txt";
		
	//constructores
	public CartillaPerro() {
	}
	
	public CartillaPerro(Perro datosPerro, String idCartilla) {
		this.datosPerro = datosPerro;
		this.idCartilla = idCartilla;
	}
		
	public CartillaPerro(Perro datosPerro, String idCartilla, HashMap<String, ArrayList<String>> servicios) {
		super();
		this.datosPerro = datosPerro;
		this.idCartilla = idCartilla;
		this.servicios = servicios;
	}

	//SETTERS AND GETTERS	
	public Perro getDatosPerro() {
		return datosPerro;
	}

	public void setDatosPerro(Perro datosPerro) {
		this.datosPerro = datosPerro;
	}

	public String getIdCartilla() {
		return idCartilla;
	}

	public void setIdCartilla(String idCartilla) {
		this.idCartilla = idCartilla;
	}

	public HashMap<String, ArrayList<String>> getServicios() {
		return servicios;
	}

	public void setServicios(HashMap<String, ArrayList<String>> servicios) {
		this.servicios = servicios;
	}

	public void actualizar(String nombreServicios, String fechaAplicacion) {
		//Checar si la vacuna existe en la cartilla
		if (servicios.containsKey(nombreServicios)) {
			ArrayList<String> fechas = servicios.get(fechaAplicacion);
			fechas.add(fechaAplicacion);
			servicios.put(nombreServicios, fechas);
		}
		else { //NO existe
			ArrayList<String> fechas = new ArrayList<>();
			fechas.add(fechaAplicacion);
			servicios.put(nombreServicios, fechas);
		}
		
	}
	
	public void imprimirCartilla(ArrayList<Servicio> lservi){
			System.out.println(datosPerro.toString());
			System.out.println("Cartilla:  : " + idCartilla);
			System.out.println("Tratamientos : " + servicios);
			System.out.println("-------------");
	}
	
	public void imprimirExpediente(ArrayList<Servicio> lservi1){
	try 
	{  
			BufferedWriter pw = new BufferedWriter(new FileWriter(nombreArchivo, true)); 	
			pw.newLine();
        	pw.write("Nombre : " + datosPerro);
			pw.write("\nCartilla:  : " + idCartilla);
			pw.write("\nTratamientos : " + servicios);
			pw.write("\n");
			pw.close();
	                   
    } catch (IOException e) {
    	System.out.println("Hubo un error al abrir");
        e.printStackTrace();
    }
	}
	
	
	public void imprimirExepcion(){
	String nombreArchivo = datosPerro.getNombre()+".txt";
	FileWriter archivo;
	try 
    {  	archivo = new FileWriter(nombreArchivo);
        PrintWriter pw = new PrintWriter(archivo);
        for(String servicio : servicios.keySet() ) {
        	pw.println("---Datos Perro-----");
            pw.println(datosPerro.toString());
            pw.println("-----------");
        	pw.println("Cartilla:  : " + idCartilla);
        	pw.println("Tratamientos : " + servicio);
			ArrayList<String> fechas = servicios.get(servicio);
			for (String fecha : fechas) {
				pw.println("Fecha : " + fecha);
			}
			pw.println("-----------");
		}
        pw.close();
    } catch (IOException e) {
    	System.out.println("Hubo un error al abrir");
        e.printStackTrace();
    	}
	}
}
	

