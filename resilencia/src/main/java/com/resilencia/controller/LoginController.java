package com.resilencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.resilencia.dto.IdLoginDto;
import com.resilencia.dto.ReqLoginDto;
import com.resilencia.imp.AdminImp;
import com.resilencia.imp.LoginImp;
import com.resilencia.model.Admin;
import com.resilencia.model.Login;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/login")
public class LoginController {
	
	@Autowired
	private LoginImp loginImp;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> saveLogin(@RequestBody Login login) {
		ResponseEntity<Object> x = null;
		try {
			x = new ResponseEntity<Object>(loginImp.saveLogin(login), HttpStatus.OK) ;
		}catch(Exception ex) {
			ex.printStackTrace();
			x =  new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		return x;
	}
	
	@RequestMapping(value="/session",method = RequestMethod.POST)
	public boolean validateLogin(@RequestBody ReqLoginDto login) {
		boolean loginController=false;
		try {
			loginController=loginImp.findByEmailAndContraseña(login.getEmailDto(), login.getContraseñaDto());
		}catch(Exception ex) {
			ex.printStackTrace(); 
		}
		return loginController;
	}
	
	@RequestMapping(value="/onSession",method = RequestMethod.POST)
	public Login onSession(@RequestBody IdLoginDto login) {
		Login loginController=null;
		String nombre=null;
		try {
			loginController=loginImp.findByEmail(login.getEmail());
		}catch(Exception ex) {
			ex.printStackTrace(); 
		}
		return loginController;
	}
}


