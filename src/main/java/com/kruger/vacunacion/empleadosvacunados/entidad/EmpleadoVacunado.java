package com.kruger.vacunacion.empleadosvacunados.entidad;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "empleadovacunado")
@Table(name = "EMPLEADOVACUNADO")
public class EmpleadoVacunado {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CEMPLEADOVACUNA", nullable = false, updatable = false)
	private Integer cempleadovacuna;

	@Column(name = "CEMPLEADO", nullable = false)
	private Integer cempleado;

	@Column(name = "CVACUNA", nullable = false)
	private Integer cvacuna;

	@Column(name = "FVACUNACION", nullable = true)
	private LocalDate fvacunacion;

	@Column(name = "NUMDOSIS", nullable = true)
	private Integer numdosis;

	public EmpleadoVacunado() {

	}

	public EmpleadoVacunado(Integer cempleado, Integer cvacuna, LocalDate fvacunacion, Integer numdosis) {
		super();
		this.cempleado = cempleado;
		this.cvacuna = cvacuna;
		this.fvacunacion = fvacunacion;
		this.numdosis = numdosis;
	}

	public Integer getCempleadovacuna() {
		return cempleadovacuna;
	}

	public void setCempleadovacuna(Integer cempleadovacuna) {
		this.cempleadovacuna = cempleadovacuna;
	}

	public Integer getCempleado() {
		return cempleado;
	}

	public void setCempleado(Integer cempleado) {
		this.cempleado = cempleado;
	}

	public Integer getCvacuna() {
		return cvacuna;
	}

	public void setCvacuna(Integer cvacuna) {
		this.cvacuna = cvacuna;
	}

	public LocalDate getFvacunacion() {
		return fvacunacion;
	}

	public void setFvacunacion(LocalDate fvacunacion) {
		this.fvacunacion = fvacunacion;
	}

	public Integer getNumdosis() {
		return numdosis;
	}

	public void setNumdosis(Integer numdosis) {
		this.numdosis = numdosis;
	}

	
}