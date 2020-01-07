package com.resilencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.resilencia.imp.LoginImp;
import com.resilencia.model.Login;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController {
	
	@Autowired
	private LoginImp loginImp;
	
	@RequestMapping(method = RequestMethod.POST)
	public Login saveLogin(@RequestBody Login login) {
		Login loginController=null;
		try {
			loginController=loginImp.saveLogin(login);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return loginController;
		
	}
}
