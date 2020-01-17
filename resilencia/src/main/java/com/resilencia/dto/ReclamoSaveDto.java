package com.resilencia.dto;

import javax.persistence.Column;

public class ReclamoSaveDto {
	
	private String tipoDto;
	private String lugarDto;
	private int notaDto;
	private String textoDto;
	
	public String getTipoDto() {
		return tipoDto;
	}
	public void setTipoDto(String tipoDto) {
		this.tipoDto = tipoDto;
	}
	public String getLugarDto() {
		return lugarDto;
	}
	public void setLugarDto(String lugarDto) {
		this.lugarDto = lugarDto;
	}
	public int getNotaDto() {
		return notaDto;
	}
	public void setNotaDto(int notaDto) {
		this.notaDto = notaDto;
	}
	public String getTextoDto() {
		return textoDto;
	}
	public void setTextoDto(String textoDto) {
		this.textoDto = textoDto;
	}
	
		
	
}
