package com.aquiler.app.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tipo")
@Getter
@Setter
public class Tipo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Long idTipo;


    @Column(name="descripcion_ampliada")
    private String descripcionAmpliada;

    @Column(name="CostoAquiler")
    private float costo_aquiler;


    @OneToOne(mappedBy = "tipo")
    private Vehiculo vehiculo;

    
}
