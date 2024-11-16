package com.anahuac.mayab.modulo1.sesion3;

public class TestCartilla {
	public static void main(String[] args) {
		Perro miPerro = new Perro( "unica", "Firulais", 5, "Paty");
		CartillaPerro cartilla = new CartillaPerro();
		cartilla.setDatosPerro(miPerro);
		cartilla.actualizar("rabia", "5-marzo-2022");
		cartilla.actualizar("Parvo", "5-marzo-2022");
		cartilla.actualizar("rabia2", "5-marzo-2022");
		cartilla.actualizar("Moc", "5-marzo-2022");
		
	
	cartilla.imprimirCartilla();
	cartilla.imprimirExpediente();
	}

}
