package com.app.cliente.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.cliente.application.ports.in.clienteUseCase;
import com.app.cliente.domain.entity.Cliente;
import com.app.cliente.infraestructura.dao.clienteDao;

@Service
public class clienteUseCaseImpl implements clienteUseCase {

    @Autowired
    private clienteDao clienteDao;
    
    @Override
    public Cliente guardarUsuario(Cliente cliente){
        return this.clienteDao.save(cliente);
    }


    @Override
    public List<Cliente> getAllClientes() {
        return this.clienteDao.findAll();
    }
    
}
