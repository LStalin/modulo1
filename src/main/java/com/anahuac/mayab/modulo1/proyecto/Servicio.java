package com.anahuac.mayab.modulo1.proyecto;

public abstract class Servicio {
	private String tipo;
	private double costo;
	private String encargado;
	private CartillaPerro cartilla;
	

	public Servicio(String tipo, double costo, String encargado, CartillaPerro cartilla) {
		super();
		this.tipo = tipo;
		this.costo = costo;
		this.encargado = encargado;
		this.cartilla = cartilla;
	}


	public Servicio(String tipo2, double costo2, String fecha, String encargado2) {
		// TODO Auto-generated constructor stub
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public String getEncargado() {
		return encargado;
	}


	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}


	public CartillaPerro getCartilla() {
		return cartilla;
	}


	public void setCartilla(CartillaPerro cartilla) {
		this.cartilla = cartilla;
	}


	public abstract void realizar(String nombre);


	public Servicio setCartilla(Perro perro, String string) {
		// TODO Auto-generated method stub
		return null;
	}





	
	

}
