package com.proyecto.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/api/hello")
    public String hello() {
        return "Hola, mundo!";
    }
}
