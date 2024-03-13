package com.bvilla.pruebatecnica.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bvilla.pruebatecnica.model.Equipo;

@Repository
public interface InterfazEquipo extends CrudRepository<Equipo, Integer>{

}
