package com.resilencia.service;

import java.util.List;

import com.resilencia.model.Reclamo;

public interface IReclamoService {
	
	Reclamo save(Reclamo reclamo);
	List<Reclamo> findAll();

}
