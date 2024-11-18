package com.app.cliente.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.cliente.application.ports.in.clienteUseCase;
import com.app.cliente.domain.entity.Cliente;

@Service
public class clienteService {

    @Autowired
    private clienteUseCase clienteUseCase;


    public Cliente guardarCliente(Cliente cliente){
        return this.clienteUseCase.guardarUsuario(cliente);
    }

    public List<Cliente> getAll(){
        return this.clienteUseCase.getAllClientes();
    }


    
}
