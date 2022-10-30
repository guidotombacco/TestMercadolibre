package com.mercadolibre.examen.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mercadolibre.examen.demo.Entity.Mutantes;

@Repository
public interface VerificadosRepository extends CrudRepository<Mutantes, Long> {


}
