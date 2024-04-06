package ar.edu.unju.fi.main;

import java.time.LocalDate;

import ar.edu.unju.fi.model.Humano;

public class Main {

	public static void main(String[] args) {
		
	   Humano pepe = new Humano("Milagro", "Martiez", LocalDate.now(), "332424", "fsdfdsf", 75.9f, 168f);
	    
	   Humano otraPersona = new Humano();
	   otraPersona.setNombre("Dios");
	   otraPersona.setApellido("Prueba");
	   otraPersona.setFechaNacimiento(LocalDate.of(2024, 12, 07));
	   otraPersona.setCorreo("midasda");
	   otraPersona.setDni("132312321");
	   otraPersona.setPeso(67f);
	   otraPersona.setAltura(167f);
	   
	   
	   System.out.println("PRIMERA PERSONA\n" + pepe.toString() + "\n");
	   System.out.println("SEGUNDA PERSONA\n" + otraPersona.toString());
	}

}
