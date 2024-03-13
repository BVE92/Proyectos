package com.bvilla.pruebatecnica.interfaceService;

import java.util.List;
import java.util.Optional;

import com.bvilla.pruebatecnica.model.Equipo;

public interface InterfazEquipoService {
    public List<Equipo>list();
    public Optional<Equipo>listId(int id);
    public int save(Equipo e);
    public void update (int id, Equipo e);
    public void delete(int id);
}
