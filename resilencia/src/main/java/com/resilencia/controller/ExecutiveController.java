package com.resilencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.resilencia.imp.ExecutiveImp;
import com.resilencia.model.Admin;
import com.resilencia.model.Ejecutivo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/Ejecutivo")
public class ExecutiveController {
	
	@Autowired
	private ExecutiveImp excutiveImp;
	
	@RequestMapping(method = RequestMethod.PUT)
	public Ejecutivo saveExecutive(@RequestBody Ejecutivo executive) {
		Ejecutivo executiveController=null;
		try {
			executiveController = excutiveImp.save(executive);
		}catch(Exception ex) {
			ex.printStackTrace(); 
		}
		return executiveController;
	}
	

}
