package com.resilencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ejecutivo")
public class Ejecutivo {
	
	@Id
	@Column(name="id_mailExecutive", unique = true, nullable = false)
	private String mail;
	
	@Column(name="pass", nullable = false)
	private String pass;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="lastname", nullable = false)
	private String lastname;
	
	@Column(name="A_section", nullable = false)
	private boolean A_section;
	
	@Column(name="Pemission")
	private String permission="Ejecutivo";

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public boolean isA_section() {
		return A_section;
	}

	public void setA_section(boolean a_section) {
		A_section = a_section;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
		
}
