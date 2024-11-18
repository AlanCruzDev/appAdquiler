package com.aquiler.app.infraestructura.out.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aquiler.app.domain.entity.Marca;

@Repository
public interface MarcaDao extends JpaRepository<Marca,Long> {
    
}
