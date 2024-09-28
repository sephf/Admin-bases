package com.proyecto.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.backend.model.Curso;

@RestController
public class Controller {
    
    @GetMapping("/api/hello")
    public String hello() {
        return "Hola, mundo!";
    }
    @GetMapping("/api/cursos")
    public Curso curso(){
        return new Curso(1, "Descripcionx", "nombrex", "horariox");
    }
}
