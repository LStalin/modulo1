package com.anahuac.mayab.modulo1.proyecto;

public abstract class Servicio {
	private String tipo;
	private double costo;
	private String encargado;
	private CartillaPerro cartilla;
	
		
	public Servicio(String tipo, double costo, String fecha, String encargado) {
		super();
		this.tipo = tipo;
		this.costo = costo;
		this.encargado = encargado;
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

}
