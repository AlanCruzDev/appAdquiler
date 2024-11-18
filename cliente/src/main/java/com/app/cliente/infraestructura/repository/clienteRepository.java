package com.app.cliente.infraestructura.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.cliente.application.ports.on.IClienteRepository;
import com.app.cliente.domain.entity.Cliente;

@Repository
public class clienteRepository implements IClienteRepository {

    //@Autowired
	//private EntityManager entityManager;


    @Override
    public List<Cliente> obtenerClienteByNumero(String celular) {
        List<Cliente> cliente = new ArrayList<>();
        return cliente;
    }
    
}
