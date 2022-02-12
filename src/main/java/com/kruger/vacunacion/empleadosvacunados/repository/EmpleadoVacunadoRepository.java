package com.kruger.vacunacion.empleadosvacunados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kruger.vacunacion.empleadosvacunados.entidad.EmpleadoVacunado;



@Repository
public interface EmpleadoVacunadoRepository 
	extends JpaRepository<EmpleadoVacunado, Integer>{
}
