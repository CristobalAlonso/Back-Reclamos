package com.resilencia.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
		Ejecutivo eje = null;
		try{
		eje = executiveRepo.save(ejecutivo);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ejecutivo no guardado");
		}
		
		return null;
	}

	@Override
	public boolean findByMailAndPass(String mail, String contraseña) {
		Ejecutivo eje=null;
		boolean res=false;
		try {
			eje=executiveRepo.findByMailAndPass(mail, contraseña);
			if(null != eje) {
				res=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al buscar Usuario");
		}
		return res;
	}

	@Override
	public Ejecutivo findByMail(String mail) {
		Ejecutivo ejeImp=null;
		try {
			ejeImp=executiveRepo.findByMail(mail);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ejeImp;
	}

	@Override
	public List<Ejecutivo> findAll() {
		return this.executiveRepo.findAll();
	}
		
}
