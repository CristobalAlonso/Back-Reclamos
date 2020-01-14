package com.resilencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.resilencia.dto.IdLoginDto;
import com.resilencia.model.Login;

public interface LoginRepository extends JpaRepository<Login, String>{
	Login findByEmailAndContraseña(String email, String contraseña);
	Login findByEmail(String email);
	
}
