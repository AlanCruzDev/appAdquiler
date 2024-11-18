package com.app.cliente.application.ports.in;

import java.util.List;

import com.app.cliente.domain.entity.Cliente;

public interface clienteUseCase {


    public List<Cliente> getAllClientes();
    public Cliente guardarUsuario(Cliente cliente);
    
}
