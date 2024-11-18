package com.aquiler.app.infraestructura.out.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aquiler.app.application.ports.on.MarcaRepository;
import com.aquiler.app.domain.entity.Marca;


@Repository
public class jpaMarcaRepository implements MarcaRepository {


    @Autowired
    private EntityManager entityManager;

    @Override
    public void guardarMarca(Marca marca) {
        this.entityManager.merge(marca);
    }
    
}
