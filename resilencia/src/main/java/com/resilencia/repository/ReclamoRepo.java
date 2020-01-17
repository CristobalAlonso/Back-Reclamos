package com.resilencia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.resilencia.model.Ejecutivo;
import com.resilencia.model.Reclamo;

public interface ReclamoRepo extends JpaRepository<Reclamo, Long>{
	List<Reclamo> findAll();
}
