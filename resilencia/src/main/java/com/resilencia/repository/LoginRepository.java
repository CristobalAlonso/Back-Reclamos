package com.resilencia.repository;

import org.springframework.data.repository.CrudRepository;

import com.resilencia.model.Login;

public interface LoginRepository extends CrudRepository<Login,Long>{
	
}
