package com.aquiler.app.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "vehiculo")
@Getter
@Setter
public class Vehiculo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Long idVehiculo;


    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca;


    @OneToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;

    @OneToOne
    @JoinColumn(name = "id_tipo")
    private Tipo tipo;


    @Column(name="placa")
    private String placa;
}
