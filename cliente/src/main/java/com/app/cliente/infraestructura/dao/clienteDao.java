package com.app.cliente.infraestructura.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.cliente.domain.entity.Cliente;

@Repository
public interface clienteDao extends JpaRepository<Cliente,Long> {
    
}
