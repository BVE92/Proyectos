package com.bvilla.pruebatecnica.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bvilla.pruebatecnica.interfaceService.InterfazEquipoService;
import com.bvilla.pruebatecnica.interfaces.InterfazEquipo;
import com.bvilla.pruebatecnica.model.Equipo;

@Service
public class EquipoService  implements InterfazEquipoService{

    @Autowired
    private InterfazEquipo equipo;


    @Override
    public List<Equipo> list() {
        return (List<Equipo>) equipo.findAll();
    }

    @Override
    public Optional<Equipo> listId(int id) {
        return equipo.findById(id);
    }

    @Override
    public int save(Equipo e) {
        equipo.save(e);
        return e.getId();
    }

    @Override
    public void update(int id, Equipo e) {
        Optional<Equipo> equipoOptional = equipo.findById(id);
        if (equipoOptional.isPresent()){
            Equipo equipoExists = equipoOptional.get();
            equipoExists.setSerialNum(e.getSerialNum());
            equipoExists.setFechaRegistro(e.getFechaRegistro());
            equipoExists.setFabricante(e.getFabricante());
            equipoExists.setModelo(e.getModelo());
            equipo.save(equipoExists);
        }
    }

    @Override
    public void delete(int id) {
       equipo.deleteById(id);
    }
}

   