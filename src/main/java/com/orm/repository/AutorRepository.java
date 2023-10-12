package com.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orm.model.Autor;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long>{
}
