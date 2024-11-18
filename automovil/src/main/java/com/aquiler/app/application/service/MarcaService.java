package com.aquiler.app.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquiler.app.application.ports.in.MarcaUseCase;
import com.aquiler.app.application.ports.on.MarcaRepository;
import com.aquiler.app.domain.entity.Marca;


@Service
public class MarcaService implements MarcaUseCase {

    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public void crearMarca(Marca marca) {
       this.marcaRepository.guardarMarca(marca);
    }
    
}
