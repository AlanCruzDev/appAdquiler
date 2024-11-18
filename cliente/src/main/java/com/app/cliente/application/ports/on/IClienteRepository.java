package com.app.cliente.application.ports.on;

import java.util.List;

import com.app.cliente.domain.entity.Cliente;

public interface IClienteRepository {
    
    public List<Cliente> obtenerClienteByNumero(String celular);
}
