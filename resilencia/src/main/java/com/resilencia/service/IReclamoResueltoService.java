package com.resilencia.service;

import java.util.List;

import com.resilencia.model.ReclamoResuelto;

public interface IReclamoResueltoService {

	List<ReclamoResuelto> findAll();
	boolean save(ReclamoResuelto reclamo);
}
