package com.resilencia.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resilencia.model.Ejecutivo;
import com.resilencia.repository.ExecutiveRepo;
import com.resilencia.service.IExecutiveService;

@Service
public class ExecutiveImp implements IExecutiveService{
	
	@Autowired 
	private ExecutiveRepo executiveRepo;
	
	@Override
	public Ejecutivo save(Ejecutivo ejecutivo) {
		Ejecutivo eje;
		try
		{
		eje = executiveRepo.save(ejecutivo);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ejecutivo no guardado");
		}
		
		return null;
	}
		
}
