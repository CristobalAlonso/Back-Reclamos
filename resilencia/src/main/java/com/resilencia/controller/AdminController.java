package com.resilencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.resilencia.dto.AdminVerifyDto;
import com.resilencia.imp.AdminImp;
import com.resilencia.model.Admin;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/Admin")
public class AdminController {
	
	@Autowired
	private AdminImp adminImp;
	
	@RequestMapping(method = RequestMethod.PUT)
	public Admin saveAdmin(@RequestBody Admin admin) {
		Admin adminController=null;
		try {
			adminController=adminImp.saveAdmin(admin);
		}catch(Exception ex) {
			ex.printStackTrace(); 
		}
		return adminController;
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public boolean adminExist(@RequestBody AdminVerifyDto admin) {
		boolean adminController=false;
		try {
			adminController=adminImp.findByCorreoAndContraseña(admin.getCorreoDto(), admin.getContraseñaDto());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return adminController;
	}
}
