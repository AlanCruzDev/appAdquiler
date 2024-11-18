package com.microservicio.empleado.application.ports.on;

import com.microservicio.empleado.domain.entity.Empleado;

public interface IEmpleadoRepository {


	public Empleado buscarEmpleadoByUsername(String username);

}
