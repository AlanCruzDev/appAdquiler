package com.microservicio.empleado.infraestructura.repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservicio.empleado.application.ports.on.IEmpleadoRepository;
import com.microservicio.empleado.domain.entity.Empleado;


@Repository
public class EmpleadoRepository implements IEmpleadoRepository{

	@Autowired
	private EntityManager entityManager;

	@Override
	public Empleado buscarEmpleadoByUsername(String username) {
	    String sql = "SELECT em FROM Empleado em WHERE em.activo = true AND em.usuario = :username";
	    Query query = this.entityManager.createQuery(sql);
	    query.setParameter("username", username);
	    return (Empleado) query.getSingleResult();
	}

}
