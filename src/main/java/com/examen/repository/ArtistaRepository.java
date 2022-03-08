package com.examen.repository;

import com.examen.entity.Artista;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Long>{
    
}
