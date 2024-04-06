package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Humano {
	
	
	   private String nombre;
	   private String apellido;
	   private LocalDate fechaNacimiento;
	   private String dni;
	   private String correo;
	   private Float peso;
	   private Float altura;
	   
	   
	   public Humano() {
		   
	   }


	public Humano(String nombre, String apellido, LocalDate fechaNacimiento, String dni, String correo, Float peso,
			Float altura) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.correo = correo;
		this.peso = peso;
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", dni="
				+ dni + ", correo=" + correo + ", peso=" + peso + ", altura=" + altura + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public Float getPeso() {
		return peso;
	}


	public void setPeso(Float peso) {
		this.peso = peso;
	}


	public Float getAltura() {
		return altura;
	}


	public void setAltura(Float altura) {
		this.altura = altura;
	};
	   
	  
  
}
