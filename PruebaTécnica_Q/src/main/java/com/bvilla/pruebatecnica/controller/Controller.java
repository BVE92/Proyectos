package com.bvilla.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bvilla.pruebatecnica.model.Equipo;
import com.bvilla.pruebatecnica.interfaceService.InterfazEquipoService;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    private InterfazEquipoService service;

    @GetMapping("/list")
    public String list(Model model){
            
        List<Equipo>equipos=service.list();
        model.addAttribute("equipos", equipos);
        return "Index";
    }
}
