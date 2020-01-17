package com.resilencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.resilencia.dto.EjecutivoDto;
import com.resilencia.dto.EjecutivoInfoDto;
import com.resilencia.imp.ExecutiveImp;
import com.resilencia.model.Ejecutivo;
import com.resilencia.util.QueryResult;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/Ejecutivo")
public class ExecutiveController {
	
	@Autowired
	private ExecutiveImp excutiveImp;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> saveEjecutivo(@RequestBody Ejecutivo ejecutivo) {
		ResponseEntity<Object> x = null;
		try {
			x = new ResponseEntity<Object>(excutiveImp.save(ejecutivo), HttpStatus.OK) ;
		}catch(Exception ex) {
			ex.printStackTrace();
			x =  new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		return x;
	}
	
	@RequestMapping(value="/SearchExecutive",method = RequestMethod.POST)
	public ResponseEntity<Object> searchExecutive(@RequestBody EjecutivoDto ejecutivo) {
		ResponseEntity<Object> x = null;
		try {
			x = new ResponseEntity<Object>(excutiveImp.findByMailAndPass(ejecutivo.getMailDto(), ejecutivo.getPassDto()), HttpStatus.OK) ;
		}catch(Exception ex) {
			ex.printStackTrace();
			x =  new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		return x;
	}
	
	@RequestMapping(value="/OnExecutive",method = RequestMethod.POST)
	public Ejecutivo resEjecutivo(@RequestBody EjecutivoInfoDto ejecutivo) {
		Ejecutivo ejeController=null;
		try {
			ejeController=excutiveImp.findByMail(ejecutivo.getMail());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return ejeController;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Ejecutivo> getEjexecutives() {
		return this.excutiveImp.findAll();
	}

}
