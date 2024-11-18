package com.microservicio.empleado.application.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservicio.empleado.application.ports.in.EmpleadoUseCase;
import com.microservicio.empleado.application.ports.on.IEmpleadoRepository;
import com.microservicio.empleado.domain.entity.Empleado;
import com.microservicio.empleado.domain.entity.Rol;
import com.microservicio.empleado.infraestructura.IEmpleadoDao;

@Service
public class empleadoService implements EmpleadoUseCase {


	@Autowired
	private IEmpleadoDao empleadoDao;

	@Autowired
	private IEmpleadoRepository empleadoRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public empleadoService(){
		
	}

	@Transactional
	@Override
	public void guardarEmpleado(Empleado empleado) {
		String clave = this.passwordEncoder.encode(empleado.getClave());
		empleado.setClave(clave);

		// SE CREA ROL DE USUARIO
		Rol rol = new Rol();
		rol.setNombre("USER");
		empleado.setRoles(Arrays.asList(rol));
		this.empleadoDao.save(empleado);
	}

	@Transactional(readOnly = true)
	@Override
	public Empleado buscarEmpleadoByUsername(String username) {
		return this.empleadoRepository.buscarEmpleadoByUsername(username);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Empleado> getAllEmpleados() {
		return this.empleadoDao.findAll();
	}

	

}
