package com.orm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.orm.model.Libro;

@Repository
public interface LibroRepository  extends CrudRepository<Libro, Long>{

}
