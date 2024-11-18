package com.aquiler.app.domain.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "marca")
@Getter
@Setter
public class Marca {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "marcaId")
    private long id;


    @Column(name = "nombre")
    private String nombre;

    @Column(name = "activo")
    private Integer activo;


    @OneToMany(mappedBy = "marca", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vehiculo> listVehiculo;
    
}
