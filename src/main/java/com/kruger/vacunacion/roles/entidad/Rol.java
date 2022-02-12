package com.kruger.vacunacion.roles.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "rol")
@Table(name = "ROL")
public class Rol {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CROL", nullable = false, updatable = false)
	private Integer crol;
	
	@Column(name = "NOMBRE", nullable = true)
	private String nombre;

	public Rol() {
	}

	public Rol(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Integer getCrol() {
		return crol;
	}

	public void setCrol(Integer crol) {
		this.crol = crol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}