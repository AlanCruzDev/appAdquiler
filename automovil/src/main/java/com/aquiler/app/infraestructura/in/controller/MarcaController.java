package com.aquiler.app.infraestructura.in.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarcaController {
    

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola Mundo";
        
    }
}
