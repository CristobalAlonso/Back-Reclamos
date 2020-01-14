package com.resilencia.repository;

import org.springframework.data.repository.CrudRepository;

import com.resilencia.model.Admin;

public interface AdminRepo extends CrudRepository<Admin,String>{
	Admin findByCorreoAndContraseña(String correo,String contraseña);
}
