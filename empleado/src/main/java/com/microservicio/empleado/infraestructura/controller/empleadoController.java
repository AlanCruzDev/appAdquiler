package com.microservicio.empleado.infraestructura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.empleado.application.service.empleadoService;
import com.microservicio.empleado.domain.entity.Empleado;


@RestController
@RequestMapping("/v1/empleado")
public class empleadoController {

	@Autowired
	private empleadoService empleyeService;


	@PostMapping("/save")
	public void guardarEmpleado(@RequestBody Empleado empleado) {
		this.empleyeService.guardarEmpleado(empleado);
	}

	@GetMapping("/empleado/{username}")
	public Empleado buscarEmpleadoByUsername(@PathVariable("username") String username) {
		return this.empleyeService.buscarEmpleadoByUsername(username);
	}

	@GetMapping("/getAll")
	public ResponseEntity<?> getMethodName() {
		return new ResponseEntity<List<Empleado>>(this.empleyeService.getAllEmpleados(), HttpStatus.OK);
	}
	

}
