package com.resilencia.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resilencia.model.Login;
import com.resilencia.repository.LoginRepository;
import com.resilencia.service.ILoginService;

@Service //sera llamado del controller
public class LoginImp implements ILoginService{
	
	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Login saveLogin(Login login) {
		Login loginLocal=null;
		try {
			loginLocal= loginRepository.save(login);
			//loginLocal			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return loginLocal;
	}

	@Override
	public Login findById(long id) {
		Login loginLocal=null;
		try {
			
			//loginLocal			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return loginLocal;
	}

}
