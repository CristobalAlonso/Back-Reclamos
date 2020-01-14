package com.resilencia.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resilencia.model.Admin;
import com.resilencia.repository.AdminRepo;
import com.resilencia.service.IAdminService;

@Service
public class AdminImp implements IAdminService{
	
	@Autowired
	private AdminRepo adminRepo;

	@Override
	public Admin saveAdmin(Admin admin) {
		Admin adminLocal=null;
		try {
			adminLocal=adminRepo.save(admin);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return adminLocal;
	}

	@Override
	public boolean findByCorreoAndContraseña(String correo, String contraseña) {
		Admin adminLocal=null;
		boolean res=false;
		try {
			adminLocal=adminRepo.findByCorreoAndContraseña(correo,contraseña);
			if(null!=adminLocal) {
				res=true;
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return res;
	}
}
