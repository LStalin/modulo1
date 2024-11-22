package com.anahuac.mayab.modulo1.proyecto;

public class Veterinaria  {
	private String nombre;

	public Veterinaria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public  Servicio crearServicio(String tipo, String nombre, String fecha) throws Exception{
		Servicio servicio = null;
		
		if(tipo == "Banio" || tipo == "Corte" ) {
			servicio = new ServicioEstetico(tipo, 200, fecha, "encargadoEstetica");
		}
		else
		{	if (tipo=="Vacuna" || tipo=="Consulta" ) {
			servicio = new ServicioMedico(tipo, 250, fecha, "veterinario");
			}
			else
			{
			throw new Exception("No existe este servicio");			
			}
		
		}

		return servicio;
		
	}
	
}
