package com.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orm.model.Estudiante;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Long>{

}
