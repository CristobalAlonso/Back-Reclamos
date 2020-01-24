package com.resilencia.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resilencia.model.ReclamoResuelto;
import com.resilencia.repository.ReclamoResueltoRepo;
import com.resilencia.service.IReclamoResueltoService;

@Service
public class ReclamoResueltoImp implements IReclamoResueltoService{

	@Autowired
	private ReclamoResueltoRepo reclamoResueltoRepo;

	@Override
	public List<ReclamoResuelto> findAll() {
		List<ReclamoResuelto> list=null;
		try {
			list=reclamoResueltoRepo.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	@Override
	public boolean save(ReclamoResuelto reclamo) {
		boolean res=false;
		try {
			reclamoResueltoRepo.save(reclamo);
			res=true;
		} catch (Exception e) {
		}
		return res;
	}
	
}
