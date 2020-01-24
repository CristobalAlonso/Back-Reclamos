package com.resilencia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Reclamo") //nombre de la tabla
public class ReclamoResuelto {
	
	@Id
	@Column(name= "id_reclamo", unique = true)
	private Long id;
	
	@Column(name= "tipo_reclamo", nullable= false)
	private String tipo;
	
	@Column(name= "lugar_reclamo", nullable= false)
	private String lugar;
	
	@Column(name= "nota_reclamo", nullable= false)
	private int nota;
	
	@Column(name= "texto_reclamo", nullable= false)
	private String texto;
	
	@Column(name= "id_Reclamante", nullable=true)
	private String mailUser;
	
	@Column(name= "id_Ejecutivo", nullable=true)
	private String mailEjecutivo;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getMailUser() {
		return mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	public String getMailEjecutivo() {
		return mailEjecutivo;
	}

	public void setMailEjecutivo(String mailEjecutivo) {
		this.mailEjecutivo = mailEjecutivo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}	
}