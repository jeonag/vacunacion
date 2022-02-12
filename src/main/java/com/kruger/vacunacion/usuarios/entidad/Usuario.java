package com.kruger.vacunacion.usuarios.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "usuario")
@Table(name = "USUARIO")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CUSUARIO", nullable = false, updatable = false)
	private Integer cusuario;

	@Column(name = "CEMPLEADO", nullable = false)
	private Integer cempleado;

	@Column(name = "CROL", nullable = false)
	private Integer crol;

	@Column(name = "PASSWORD", nullable = true)
	private String password;

	public Usuario() {

	}

	public Usuario(Integer cempleado, Integer crol, String password) {
		super();
		this.cempleado = cempleado;
		this.crol = crol;
		this.password = password;
	}

	public Integer getCusuario() {
		return cusuario;
	}

	public void setCusuario(Integer cusuario) {
		this.cusuario = cusuario;
	}

	public Integer getCempleado() {
		return cempleado;
	}

	public void setCempleado(Integer cempleado) {
		this.cempleado = cempleado;
	}

	public Integer getCrol() {
		return crol;
	}

	public void setCrol(Integer crol) {
		this.crol = crol;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}