package com.orm.repository;

import com.orm.model.Socio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocioRepository extends CrudRepository<Socio, Long>{
	
	
	
}
