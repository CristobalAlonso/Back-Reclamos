package com.resilencia.service;

import java.util.List;

import org.springframework.data.domain.Sort;

import com.resilencia.dto.EjecutivoInfoDto;
import com.resilencia.model.Ejecutivo;

public interface IExecutiveService {
	//este metodo guardaen la base de datos (regristro)
	Ejecutivo save(Ejecutivo ejecutivo);
	
	//este metodo busca por el correo y la contraseña retorna boolean
	boolean findByMailAndPass(String email, String contraseña);
	Ejecutivo findByMail(String mail);
	
	List<Ejecutivo> findAll();

}
