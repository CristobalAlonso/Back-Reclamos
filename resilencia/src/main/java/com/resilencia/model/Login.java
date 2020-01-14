package com.resilencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Login") //nombre de la tabla
public class Login {
	
	@Id
	@Column(name= "email", unique= true, nullable = false)
	private String email;
	
	@Column(name= "contraseña", nullable= false)
	private String contraseña;
	
	@Column(name= "nombre", nullable= false)
	private String nombre;
	
	@Column(name= "apellido", nullable= false)
	private String apellido;
	
	@Column(name= "rut", unique= true, nullable= false)
	private String rut;
	
	@Column(name= "edad", nullable= false)
	private int edad;
	
	@Column(name= "numero")
	private int numero;
	
	//Sett and Gett
	
	
	public String getEmail() {
		return email;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
		
}
