package com.kruger.vacunacion.empleados.entidad;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "empleado")
@Table(name = "EMPLEADO")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CEMPLEADO", nullable = false, updatable = false)
	private Integer cempleado;

	@Column(name = "IDENTIFICACION", nullable = true)
	private Integer identificacion;

	@Column(name = "NOMBRES", nullable = true)
	private String nombres;

	@Column(name = "APELLIDOS", nullable = true)
	private String apellidos;

	@Column(name = "MAIL", nullable = true)
	private String mail;

	@Column(name = "DIRECCION", nullable = true)
	private String direccion;

	@Column(name = "TELEFONO", nullable = true)
	private Integer telefono;

	@Column(name = "ESTADOVACUNA", nullable = true)
	private Integer estadovacuna;

	@Column(name = "FNACIMIENTO", nullable = true)
	private LocalDate fnacimiento;

	public Empleado() {

	}

	public Empleado(Integer identificacion, String nombres, String apellidos, String mail, String direccion,
			Integer telefono, Integer estadovacuna, LocalDate fnacimiento) {
		super();
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.mail = mail;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estadovacuna = estadovacuna;
		this.fnacimiento = fnacimiento;
	}

	public Integer getCempleado() {
		return cempleado;
	}

	public void setCempleado(Integer cempleado) {
		this.cempleado = cempleado;
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Integer getEstadovacuna() {
		return estadovacuna;
	}

	public void setEstadovacuna(Integer estadovacuna) {
		this.estadovacuna = estadovacuna;
	}

	public LocalDate getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(LocalDate fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

}
