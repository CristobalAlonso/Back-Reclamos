package com.resilencia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.resilencia.model.Reclamo;
import com.resilencia.model.ReclamoResuelto;


public interface ReclamoResueltoRepo extends JpaRepository<ReclamoResuelto, Long>{
	List<ReclamoResuelto> findAll();
	

}
