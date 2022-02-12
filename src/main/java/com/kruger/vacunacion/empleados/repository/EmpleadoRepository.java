package com.kruger.vacunacion.empleados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kruger.vacunacion.empleados.entidad.Empleado;

@Repository
public interface EmpleadoRepository 
	extends JpaRepository<Empleado, Integer>{
}
