package com.microservicio.empleado.application.ports.in;


import java.util.List;

import com.microservicio.empleado.domain.entity.Empleado;

public interface EmpleadoUseCase {


	public void guardarEmpleado(Empleado empleado);
	public Empleado buscarEmpleadoByUsername(String username);
	public List<Empleado> getAllEmpleados();

}
