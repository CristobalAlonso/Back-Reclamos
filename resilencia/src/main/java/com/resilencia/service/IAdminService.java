package com.resilencia.service;

import com.resilencia.model.Admin;

public interface IAdminService {
	Admin saveAdmin(Admin admin);
	boolean findByCorreoAndContraseña(String correo,String contraseña);
}
