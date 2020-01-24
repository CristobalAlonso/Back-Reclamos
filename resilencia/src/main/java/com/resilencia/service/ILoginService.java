package com.resilencia.service;

import java.util.List;

import com.resilencia.model.Login;

public interface ILoginService {
	Login saveLogin(Login login);
	boolean findByEmailAndContraseña(String email, String contraseña);
	Login findByEmail(String email);
	List<Login> findAll();
}
