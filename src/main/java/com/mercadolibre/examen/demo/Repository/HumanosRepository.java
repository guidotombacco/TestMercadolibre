package com.mercadolibre.examen.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mercadolibre.examen.demo.Entity.Humanos;

@Repository
public interface HumanosRepository extends CrudRepository<Humanos, Long> {

    // @Query("SELECT COUNT(u) FROM Humanos u")
    // public Integer getCount();

}
