package com.app.cliente.infraestructura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.cliente.application.service.clienteService;
import com.app.cliente.domain.entity.Cliente;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/v1/cliente")
public class clienteController {

    @Autowired
    private clienteService clientService;

    @GetMapping("/getall")
    public List<Cliente> getMethodName(@RequestParam String param) {
        return this.clientService.getAll();
    }
    

    @PostMapping("/save")
    public ResponseEntity<?> guardarCliente(@RequestBody Cliente client){
        Cliente c=this.clientService.guardarCliente(client);
        return new ResponseEntity<Cliente>(c, HttpStatus.CREATED);
    }

}
