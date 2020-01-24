package com.resilencia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resilencia.model.Login;

public interface LoginRepository extends JpaRepository<Login, String>{
	Login findByEmailAndContraseña(String email, String contraseña);
	Login findByEmail(String email);
	List<Login> findAll();
	
}
