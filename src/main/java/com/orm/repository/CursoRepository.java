package com.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orm.model.Curso;

@Repository
public interface CursoRepository extends CrudRepository<Curso, Long>{

}
