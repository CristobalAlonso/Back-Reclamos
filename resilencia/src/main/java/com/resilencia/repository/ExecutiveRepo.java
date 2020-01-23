package com.resilencia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.resilencia.model.Ejecutivo;

public interface ExecutiveRepo extends JpaRepository<Ejecutivo, String>{
	Ejecutivo findByMailAndPass(String email, String contraseña);
	Ejecutivo findByMail(String mail);
	List<Ejecutivo> findAll();
	void deleteById(String string);
}
