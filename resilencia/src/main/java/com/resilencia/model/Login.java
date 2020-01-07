package com.resilencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.websocket.ClientEndpoint;

@Entity
@Table(name= "Login") //nombre de la tabla
public class Login {
	
	@Id
	@Column(name= "id_login")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "email", unique= true)
	private String email;
	
	@Column(name= "contraseña", nullable= false)
	private String contraseña;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
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
	
	
}
