package com.resilencia.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resilencia.model.Ejecutivo;
import com.resilencia.model.Reclamo;
import com.resilencia.repository.ReclamoRepo;
import com.resilencia.service.IReclamoService;

@Service
public class ReclamoImp implements IReclamoService{
	
	@Autowired
	private ReclamoRepo reclamoRepo;

	@Override
	public Reclamo save(Reclamo reclamo) {
		Reclamo rec = null;
		try{
		rec = reclamoRepo.save(reclamo);
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("Ejecutivo no guardado");
		}
		
		return rec;
	}

	@Override
	public List<Reclamo> findAll() {
		try {
			return reclamoRepo.findAll();
		} catch (Exception e) {
			System.out.println("Error al encontrar los reclamos");
		}
		
		return null;
	}
	
}
