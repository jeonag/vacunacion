package com.kruger.vacunacion.tipovacunas.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "tipovacuna")
@Table(name = "TIPOVACUNA")
public class TipoVacuna {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CVACUNA", nullable = false, updatable = false)
	private Integer cvacuna;
	
	@Column(name = "NOMBRE", nullable = true)
	private String nombre;

	public TipoVacuna() {
	}

	public TipoVacuna(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Integer getCvacuna() {
		return cvacuna;
	}

	public void setCvacuna(Integer cvacuna) {
		this.cvacuna = cvacuna;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}