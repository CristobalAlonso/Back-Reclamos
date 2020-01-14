package com.resilencia.service;

import com.resilencia.model.Login;

public interface ILoginService {
	Login saveLogin(Login login);
	boolean findByEmailAndContraseña(String email, String contraseña);
	Login findByEmail(String email);
}
