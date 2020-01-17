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

import com.resilencia.imp.ReclamoImp;
import com.resilencia.model.Reclamo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/Reclamo")
public class ReclamoController {
	
	@Autowired
	private ReclamoImp reclamoImp;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Object> saveReclamo(@RequestBody Reclamo reclamo) {
		ResponseEntity<Object> x = null;
		try {
			x = new ResponseEntity<Object>(reclamoImp.save(reclamo), HttpStatus.OK) ;
		}catch(Exception ex) {
			ex.printStackTrace();
			x =  new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
		}
		return x;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Reclamo> getReclamos(){
		return reclamoImp.findAll();
	}

}
