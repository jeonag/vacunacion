package com.kruger.vacunacion.roles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kruger.vacunacion.roles.entidad.Rol;

@Repository
public interface RolRepository 
	extends JpaRepository<Rol, Integer>{
}