package com.microservicio.empleado.infraestructura;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.empleado.domain.entity.Empleado;

public interface IEmpleadoDao extends JpaRepository<Empleado, Long> {

}
