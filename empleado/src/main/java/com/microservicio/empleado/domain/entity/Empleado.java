package com.microservicio.empleado.domain.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "empleado")
public class Empleado {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="empleado_id")
    private Long idEmpleado;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apaterno")
    private String apaterno;
    @Column(name = "amaterno")
    private String amaterno;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "clave")
    private String clave;

    @Column(name = "activo")
    private boolean activo;

    @Column(name = "intentos")
    private int intentos;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="usuarios_roles",joinColumns = @JoinColumn(name="usuario_id"),inverseJoinColumns = @JoinColumn(name="role_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario_id","role_id"})})
    private List<Rol> roles;


	public Long getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApaterno() {
		return apaterno;
	}


	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}


	public String getAmaterno() {
		return amaterno;
	}


	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getClave() {
		return clave;
	}


	public void setClave(String clave) {
		this.clave = clave;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public int getIntentos() {
		return intentos;
	}


	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}


	public List<Rol> getRoles() {
		return roles;
	}


	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}







}
