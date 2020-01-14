package com.resilencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@Column(name = "correo_admin", nullable = false,unique = true)
	private String correo;
	
	@Column(name="nombre_admin", nullable = false)
	private String nombre;
	
	@Column(name="contraseña_admin", nullable = false)
	private String contraseña;
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre+" Admin"; 
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}	
}
